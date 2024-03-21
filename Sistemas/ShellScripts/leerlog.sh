#!/bin/bash

# Directorio donde se almacenarán los archivos rotados
rot_dir="old_rot"

# Comprobamos si el directorio de archivos rotados existe, si no, lo creamos
if [ ! -d "$rot_dir" ]; then
    mkdir "$rot_dir"
fi

# Iteramos sobre todos los archivos .log en el directorio actual
for logfile in *.log; do
    # Contamos las líneas del archivo
    line_count=$(wc -l < "$logfile")

    # Si supera las 50 líneas, rotamos el archivo
    if [ "$line_count" -gt 50 ]; then
        echo "El archivo $logfile supera las 50 líneas. Rotando..."

        # Movemos las últimas 30 líneas a un archivo temporal
        tail -n 30 "$logfile" > "$logfile.tmp"
        
        # Movemos el archivo temporal de vuelta al original
        mv "$logfile.tmp" "$logfile"

        # Comprimimos y rotamos las porciones eliminadas
        for ((i=4; i>=1; i--)); do
            # Si existe el archivo anterior, lo eliminamos
            if [ -f "$rot_dir/$logfile.rot$i.gz" ]; then
                rm "$rot_dir/$logfile.rot$i.gz"
            fi
            # Si existe un archivo anterior, lo renombramos
            if [ -f "$rot_dir/$logfile.rot$(($i-1)).gz" ]; then
                mv "$rot_dir/$logfile.rot$(($i-1)).gz" "$rot_dir/$logfile.rot$i.gz"
            fi
        done

        # Comprimimos la última porción eliminada
        gzip -c < "$logfile" > "$rot_dir/$logfile.rot1.gz"

        echo "Archivo $logfile rotado y porciones eliminadas comprimidas."
    fi
done

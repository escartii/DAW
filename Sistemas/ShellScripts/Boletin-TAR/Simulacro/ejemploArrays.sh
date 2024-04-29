#!/bin/bash


# Definir un array
mi_array=("elemento1" "elemento2" "elemento3")

# Recorrer el array e imprimir cada elemento
for elemento in "${mi_array[@]}"; do
    echo "$elemento"
done

# Obtener una lista de archivos en un directorio
archivos=("/ruta/a/tu/directorio"/*)

# Recorrer el array de archivos e imprimir cada uno
for archivo in "${archivos[@]}"; do
    echo "$archivo"
done

# Leer contenido de un archivo línea por línea y almacenarlo en un array
archivo="/ruta/a/tu/archivo.txt"
contenido=()

while IFS= read -r linea; do
    contenido+=("$linea")
done < "$archivo"

# Recorrer el array de contenido e imprimir cada línea
for linea in "${contenido[@]}"; do
    echo "$linea"
done


exit 0

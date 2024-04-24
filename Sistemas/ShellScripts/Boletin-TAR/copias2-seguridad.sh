#!/bin/bash

#Hecho por Alvaro Escarti :))

if [ "$EUID" -ne 0 ]; then
    echo "Debes ejecutar como sudo"
    exit
fi

if mount | grep -q "/dev/sdb4" && [ -d /BACKUPS ]; then
    tar cv -g /BACKUPS/lista-incremental.file -f /BACKUPS/noticias-$(date +%d-%m-%Y).tar /NOTICIAS
else 
    echo "La partición /dev/sdb4 no está montada."
    echo "USO: sudo mount /dev/sdb4 /BACKUPS"
    read -p "¿Desea montar la partición /dev/sdb4 en /BACKUPS? (s/n): " respuesta
    if [ $respuesta = "s" ] || [ $respuesta = "si" ] || [ $respuesta = "y" ] || [ $respuesta == "yes" ]; then
        sudo mount /dev/sdb4 /BACKUPS
        echo "Partición montada..."
        if [ ! -d /BACKUPS ]; then
            echo "La ruta o el fichero no existe..."
            echo -e "\e[31mSaliendo del programa\e[0m"
            mkdir /BACKUPS
            tar cv -g /BACKUPS/lista-incremental.file -f /BACKUPS/noticias-$(date +%d-%m-%Y).tar /NOTICIAS
        else 
            tar cv -g /BACKUPS/lista-incremental.file -f /BACKUPS/noticias-$(date +%d-%m-%Y).tar /NOTICIAS
        fi
    else
        echo "Saliendo del programa..."
        exit 1
    fi
fi

exit 0

#!/bin/bash

# Hecho por Alvaro Escarti :))

if [ "$EUID" -ne 0 ]; then
    echo "Debes ejecutar como sudo"
    exit
fi

# Compruebo que la partición /dev/sdb4 está montada
if mount | grep -q "/dev/sdb4"; then
    echo "--------------"
    echo -e "\e[32m/dev/sdb4 está montada.\e[0m"
    º
    # Compruebo que existe la ruta y/o el fichero

    if [ ! -d /BACKUPS ]; then
        echo "La ruta o el fichero no existe..."
        echo -e "\e[31mSaliendo del programa\e[0m"
        exit 1
    else
        tar cv -g lista-incremental.file -f /BACKUPS/noticias-$(date +%d-%m-%Y).tar /NOTICIAS
    fi
else
    echo "-/dev/sdb4 no está montada."
    echo "USO: sudo mount /dev/sdb4 /BACKUPS"
    read -p "¿Desea montar la partición /dev/sdb4 en /BACKUPS? (s/n): " respuesta
    if [ $respuesta = "s"  || $respuesta = "si" || $respuesta = "y" || $respuesta == "yes"]; then
        sudo mount /dev/sdb4 /BACKUPS
        echo "Partición montada..."
    else
        echo "Saliendo del programa..."
        exit 1
    fi
fi

exit 0
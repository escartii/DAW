#!/bin/bash

#Alvaro Escarti

#if [ "$(whoami)" != "root" ]; then
#    echo "Este script necesita privilegios de root para ejecutarse."
#    exit 1
#fi

#read -p "introduce tu nombre de usuario: " usuario
#read -p "introduce tu contraseña: " password

#useradd -m -p $(openssl passwd -1 $password) $usuario

#echo "Usuario creado correctamente"

#Año, mes y dia
date=$(date +"%Y-%m-%d")
#Hora y minutos
time=$(date +"%H-%M")


if mount | grep -q "/dev/sdb1"; then
    echo "/dev/sbd1 está montado"
else
    echo "/dev/sdb1 no está montado"
    if [ -d /media/escartii ]; then
        echo "la carpeta /media/escartii existe"
    else
        echo "la carpeta /media/escartii no existe"
        mkdir /media/escartii
    fi
    mount /dev/sdb1 /media/escartii
fi

tar -czf /media/escartii/$date-$time.tar.gz /home/carles/Escritorio
echo "Copia de seguridad realizada correctamente"

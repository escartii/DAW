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
current_date=$(date +"%Y-%m-%d")
#Hora y minutos
current_time=$(date +"%H-%M")

if [ -d /media/escartii ]; then
    echo "la particion está montada"
    tar -czf /media/escartii/$current_date-$current_time.tar.gz /home/carles/Escritorio
else
    echo "la particion no esta montada"
    exit 1
fi


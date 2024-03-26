#!/bin/bash

#Alvaro Escarti


while IFS=";" read login password grupo

if [ "$EUID" -ne 0 ]; then
    echo "Por favor, ejecuta este script como superusuario."
    exit 1
fi

if [[$login != "login"]]; then
    existe= grepp "$grupo" /etc/group
    if [ -z "$existe" ]; then
        echo "El grupo $grupo no existe. Creando el grupo..."
        groupadd "$grupo"
        echo "Grupo $grupo creado correctamente."
    fi

    useradd -m -g "$grupo" "$login"
    echo -e "$login:$password" | chpasswd
fi
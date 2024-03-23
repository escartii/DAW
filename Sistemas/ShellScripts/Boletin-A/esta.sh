#!/bin/bash
clear
echo
read -p "introduce el usuario: " usuario

existe=$(who | grep $usuario /etc/passwd)

if [ -z $existe ]; then
    echo "no tiene un usuario creado"
else
    echo "si tiene un usuario creado"
fi
echo

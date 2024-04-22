#!/bin/bash

#Alvaro Escarti


if [ "$(whoami)" != "root" ]; then
    echo "Este script necesita privilegios de root para ejecutarse."
    exit 1
fi

read -p "introduce tu nombre de usuario: " usuario
read -p "introduce tu contraseña: " password

useradd -m -p $(openssl passwd -1 $password) $usuario



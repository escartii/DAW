#!/bin/bash

read -p "Introduce el usuario " usuario
if [ -z "$usuario" ]; then
  usuario=`whoami`
fi

directorio="/home/$usuario/seguridad"

if [ ! -d "$directorio" ]; then
  mkdir -p "$directorio"
  echo "El $directorio ha sido creado."
fi

cp -r * "$directorio"
echo "Ficheros copiados $directorio."

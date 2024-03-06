#!/bin/bash

# Ask for user input (optional)
read -p "Introduce el usuario " usuario
if [ -z "$usuario" ]; then
  usuario=`whoami`
fi

directorio="/home/$usuario/seguridad"

if [ ! -d "$directorio" ]; then
  mkdir -p "$directorio"
  echo "El $directorio ha sido creado."
fi

# Copy all files to the target directory
cp -r * "$directorio"
echo "Ficheros copiados $directorio."

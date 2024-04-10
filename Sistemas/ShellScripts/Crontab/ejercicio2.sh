#!/bin/bash

# Define la ruta de origen y destino
origen=$HOME
destino="/backup"

# Crea un nombre de archivo único basado en la fecha y hora actual
nombre_archivo="backup_$(date +%Y-%m-%d_%H-%M-%S)"

# Crea el directorio de destino si no existe
mkdir -p "$destino"

# Realiza la copia de seguridad de los archivos del directorio /home al directorio /backup
cp -r $origen $destino/$nombre_archivo

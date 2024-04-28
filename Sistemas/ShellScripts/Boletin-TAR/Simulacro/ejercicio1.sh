#!/bin/bash

# Obtener el año, mes, dia y hora

date=$(date +"%Y-%m-%d-%H")

# Creo un fichero
fichero="backup-carles-$date.tar"

# Crear la copia de seguridad en el escritorio de Carles

tar cvf /home/carles/Escritorio/$fichero /home/carles

# Para ejecutar el at será asi:
# at now +1 hour -f /home/carles/Escritorio/ejercicio1.sh 

exit 0


#!/bin/bash

#Alvaro Escarti

#Crear una tarea cron que se ejecute cada minuto y que escriba la hora actual en un
#archivo llamado time.txt en el directorio del usuario actual.

# Obtiene la hora actual en formato HH:MM
hora=$(date +%H:%M)

# Escribe la hora actual en el archivo time.txt en el directorio del usuario actual
echo $hora > $HOME"/time.txt"

exit 0

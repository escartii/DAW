#!/bin/bash

#Alvaro Escarti

archivo=$1

read -p "introduce el nombre del campo por el que quieres ordenar: " campo

archivo_salida=${archivo%.*}_ordenado.txt

num_columna=`head -n 1 $archivo | tr ',' '\n' | grep -n -x $campo | cut -d ':' -f1`
echo "el campo $campo está en la columna $num_columna"

if [ -z $num_columna ]; then
    echo "el campo no existe"
    exit 1
fi

head -n 1 $archivo > $archivo_salida
tail -n +2 $archivo | sort -t ',' -k$num_columna >> $archivo_salida
echo "archivo ordenado en $archivo_salida"
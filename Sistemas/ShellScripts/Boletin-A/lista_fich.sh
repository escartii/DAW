#!/bin/bash

#Alvaro Escarti :))

#compruebo que se introducen argumentos
clear

if [ $# -eq 0 ]; then
	echo "no has introducido ningun parametro"
	exit 1
fi

for archivos in "$@"; do

	if [ ! -f "$archivos" ]; then
		echo "el archivo: "$archivos "no existe"
	else
		echo "Contenido de $archivos"
		echo "----------------------------"
		echo "$archivos"
		cat "$archivos"
		echo ""
	fi

done

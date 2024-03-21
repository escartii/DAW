#!/bin/bash

#Alvaro Escarti :))

#Compruebo que se introducen los parametros

if [ $# -eq 0 ]; then
	echo "no has introducido parametros"
	exit 1
fi

directorio="$1"

lectura=$(find "$directorio" -type f -readable | wc -l)
escritura=$(find "$directorio" -type f -writable | wc -l)
ejecucion=$(find "$directorio" -type f -executable | wc -l)

sin_lectura=$(find "$directorio" -type f ! -readable | wc -l)
sin_escritura=$(find "$directorio" -type f ! -writable | wc -l)
sin_ejecucion=$(find "$directorio" -type f ! -executable | wc -l)


echo "Numero de archivos con permisos de lectura: "$lectura
echo "Numero de archivos con permisos de escritura: "$escritura
echo "Numero de archivos con permisos de ejecucion: "$ejecucion
echo "Numero de archivos sin permisos de lectura: "$sin_lectura
echo "Numero de archivos sin permisos de escritura: "$sin_escritura
echo "Numero de archivos sin permisos de ejecucion: "$sin_ejecucion

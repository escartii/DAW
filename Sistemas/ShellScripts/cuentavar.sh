#!/bin/bash

#Alvaro Escarti :))

# compruebo que se hayan introducido parametros al script

if [ $# -eq 0 ]; then
	echo "no has introducido parametros"
	exit 1
fi


echo "Numero total de argumentos: "$#

contador=1

for var in "$@"; do

	echo "Argumento $contador: $var"
	contador=$((contador+1))
done

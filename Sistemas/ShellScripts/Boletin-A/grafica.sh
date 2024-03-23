#!/bin/bash

#Alvaro Escarti :))

#Compruebo que se añaden argumentos

if [ $# -eq 0 ]; then
	echo "No has introducido ningun argumento"
	exit 1
fi

for num in "$@"; do
	if [ "$num" -ge 1 ] && [ "$num" -le 75 ]; then
		# contador
		contador=0
		# mientras que el contador sea menor o igual que el numero
		while [ $contador -lt $num ]; do
			# pinto el numero del argumento
			echo -n "*"
			contador=$((contador+1))
		done
		# Este echo sirve para el salto de linea
		echo
	else
		echo "el numero introducido no está dentro del rango"
	fi
done

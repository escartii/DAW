#!/bin/bash

while true; do
    date >> date.log
    sleep 1;
done


#contador utilizando un bucle while
contador=1
while [ $contador -le 5 ]; do

	echo "COntador: $contador"
	contador=$((contador+1))
done

archivo = "ejemplo.txt"
while IFS=read -r linea
do
	echo "linea leida: $inea"
done < "$archivo"

entrada =""
while [ "$entrada" != "salir" ]
do
	echo "Ingresa 'salir' para finalizar"
	read entrada
	echo "erntrada :$entrada"
done

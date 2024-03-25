#!/bin/bash

#Alvaro Escarti :))


for i in {1..5}
do
	echo "Numero: "$i
done

#Iterar sobre un array

frutas=("manzana","banana","naranja")
for fruta in "${frutas[@]}"
do
	echo "fruta: "$fruta
done

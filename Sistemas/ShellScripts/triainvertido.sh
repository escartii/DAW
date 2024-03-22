#!/bin/bash

if [ $# -ne 1 ]; then
    echo "Uso: $0 <numero>"
    exit 1
fi

numero=$1

for ((i = numero; i >= 1; i--)); do
    for ((j = 1; j <= i; j++)); do
        echo -n "$i "
    done
    echo
done

for ((i=1; i<=$1; i++)); do
	for e in $(seq $i $1); do
		echo -n $e " "
	done
	echo
done


#!/bin/bash

#ALvaro Escarti

for i in {1..6}; do
    existe=1
    while [ $existe -eq 1 ]; do
        num=$(( RANDOM % 49 + 1))
        existe=0
        for val in "${bonoloto[@]}"; do
            if [ $val -eq $num ]; then
                existe=1
                echo "el numero " $num "ya existe"
            fi
        done
    done
    bonoloto+=($num)
done

bonoloto_ordenada=($(for i in "${bonoloto[@]}"; do echo $i; done | sort -n))

for i in ${bonoloto_ordenada[@]}; do
    echo -n $i" "
done

echo


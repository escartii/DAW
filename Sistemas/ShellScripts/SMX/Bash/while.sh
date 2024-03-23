#!/bin/bash

#Alvaro Escarti :))

a=0
while [[ $a -le 18 ]]; do
    ((a++))
    if [ $a -eq 7 ]; then
        echo "$a" "es mi numero favorito"
    fi
    echo 
done

exit 0

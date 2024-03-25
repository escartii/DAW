#!/bin/bash

declare -A telefonos
telefonos=([Juan]='123' [Pedro]='456' [Andres]='789')


for i in ${!telefonos[@]}; do
    echo "El telefono de $i es ${telefonos[$i]}"
done

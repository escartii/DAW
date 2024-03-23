#!/bin/bash

#Alvaro Escarti :))

if [ $# -lt 2 ]; then
    echo "ERROR"
    echo "Uso: <ip primera> <ipsegunda> <mascara de red>"
else
    ip=$(echo $1 | sed 's/./ /g')
    ip2=$(echo $2 | sed 's/./ /g')
    for numeros in $ip; do
        convertidor=echo "$(([##2]$numeros))"
        binario+="${convertidor}."
    done
    for numeros in $ip2; do
        convertidor=echo "$(([##2]$numeros))"
        binario2+="${convertidor}."
    done
    echo "La primera ip es "$1" y en binario: "$binario
    echo "La segunda ip es "$2" y en binario: "$binario2
fi
exit 0

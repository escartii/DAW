#!/bin/bash

read -p "Escribe un nombre: " name

encontrado=$(cat /etc/passwd | grep -c $name)

if [ $encontrado -ge 1 ]; then
    echo "si esta"
else
    echo "no encuentro la palabra" $name
fi




#!/bin/bash

#Alvaro Escarti

read -p "introduce el primer numero: " num1
read -p "Introduce el segundo numero: " num2

if [ $num1 -gt $num2 ]; then
    echo "el numero 1 es mayor"
else
    echo "el numero 2 es mayor"
fi


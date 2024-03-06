#!/bin/bash

for usuario in $*; do
    TEST=$(who | grep $usuario)
    if [ ! -z "$TEST" ]; then
        echo "si está conectado"
    else
        echo "no está conectado"
    fi
done

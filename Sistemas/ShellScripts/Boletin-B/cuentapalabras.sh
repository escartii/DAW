#!/bin/bash

# Solicitar al usuario que ingrese el nombre del archivo
read -p "Introduce el nombre del archivo: " fichero

# Verificar si el archivo existe y es legible
if [ -f "$fichero" ]; then
    echo "El archivo '$fichero' existe."

    # Contar la cantidad de palabras en el archivo
    contarPalabras=$(cat $fichero | wc -w)

    echo "El archivo tiene: $contarPalabras palabras."
else
    echo "El archivo '$fichero' no existe o no es legible."
fi



#!/bin/bash



# Comprobamos que se ha pasado un argumento
if [ $# -ne 1 ]; then
    echo "Error: número de argumentos incorrecto"
    exit 1
fi

# Comprobamos que el argumento es un fichero
if [ ! -f $1 ]; then
    echo "Error: el argumento no es un fichero"
    exit 1
fi

fichero=$1
# Ordenar el contenido del fichero alfabéticamente
cat $1 | sort -k 1 -d | uniq > output1.txt

exit 0
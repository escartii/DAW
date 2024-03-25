#!/bin/bash

echo "hola como    estas" | tr -s ' '

# Este script lee el contenido del archivo "file_wget_med" línea por línea.
# Luego, elimina los espacios consecutivos en cada línea utilizando el comando 'tr'.
# Las líneas modificadas se imprimen en la consola.

while IFS= read -r line; do
    echo "$line" | tr -s ' '
done < ./file_wget_med

# Este script lee el contenido del archivo "file_wget_med" línea por línea.
# Luego, elimina los espacios consecutivos en cada línea utilizando el comando 'tr'.
# Las líneas modificadas se imprimen en el archivo "file_wget_med.csv" con los espacios reemplazados por punto y coma.
echo > ./file_wget_med.csv
while IFS= read -r line; do
  echo "$line" | tr ' ' ';' >> ./file_wget_med.csv
done < ./file_wget_med
#!/bin/bash

clear

fichero="/NOTICIAS/$1"
# Compruebo que existe la ruta y/o el fichero
if [ ! -f $fichero ]; then
    echo "La ruta o el fichero no existe..."
    echo -e "\e[31mSaliendo del programa\e[0m"
    exit 1
fi  

# Compruebo que la partición /dev/sdb3 está montada
if mount | grep -q "/dev/sdb3"; then
    echo "--------------"
    echo -e "\e[32m/dev/sdb3 está montada.\e[0m"
else
    echo "-/dev/sdb3 no está montada."
    exit 1
fi

suma=0
while IFS="$" read -r ID FECHA TITULO AUTOR TEXTO; do
    echo "--------------"
    echo  "ID: $ID" 
    echo "Fecha: $FECHA" 
    echo "Título: $(echo "$TITULO" | tr '[:lower:]' '[:upper:]')"
    echo "Autor: $AUTOR" 
    echo "Texto: $TEXTO"
    contarPalabras=$(echo "$TEXTO" | wc -w)
    echo "Palabras: $contarPalabras"
    precioPalabra=$(echo "$contarPalabras * 0.10" | bc)
    echo "Total: $precioPalabra€" 
    # Obtener el nombre del periodista
    date=$(echo "$FECHA" | cut -d' ' -f2)
    mes=$(date -d "$date" "+%B")
    echo "$AUTOR,$contarPalabras,$precioPalabra" >> "pagar-$mes.txt"
    echo "$AUTOR", "$TITULO", "$contarPalabras" >> "palabras-$mes.txt"
done < $fichero

exit 0
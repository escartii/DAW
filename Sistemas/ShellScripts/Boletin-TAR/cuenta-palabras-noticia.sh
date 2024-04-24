#!/bin/bash

# Definir un array con los nombres de los meses
meses=("Enero" "Febrero" "Marzo" "Abril" "Mayo" "Junio" "Julio" "Agosto" "Septiembre" "Octubre" "Noviembre" "Diciembre")

# Iterar sobre los archivos de noticias
for archivo in /NOTICIAS/noticia*.txt; do
    contarPalabras=$(echo "$TEXTO" | wc -w)
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
        echo "Precio por palabra: €$precioPalabra" 
        # Obtener el nombre del periodista
        periodista=$(echo "$AUTOR" | cut -d' ' -f1)
        date=$(echo "$FECHA" | cut -d' ' -f2)
        mes=$(date -d "$date" "+%B")
        echo "$AUTOR,$contarPalabras,$precioPalabra" >> "pagar-$mes.txt"
        echo "$periodista", "$TITULO", "$contarPalabras" >> "palabras-$mes.txt"
    done < "$archivo"
done

exit 0

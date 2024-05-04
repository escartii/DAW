#!/bin/bash

# Calcular el pago de los periodista
#el peridosita puede haber escrito mas de un artículo al mes

rm -f pagar-$(date %+B).txt
declare -A palabras_por_autor
while IFS="," read -r autor _palabras; do
    ((palabras_por_autor[$autor] += palabras))

done < palabras-$(date +%B).txt

for autor in "${!palabras_por_autor[@]}"; do

    total_palabras="${palabras_por_autor[$autor]}"
    pago=$(echo "$total_palabras * 0.10" | bc);
    echo "$autor,$total_palabras,$pago" >> pagar-$(date +%B).txt
done

sort -t ',' -k3 -nr pagar-$(date +%B).txt -o pagar-$(date +%B).txt
# fichero ordenado por coste de mayor a menor vale:

cat pagar-$(date +%B).txt


exit 0
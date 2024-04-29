#!/bin/bash

while IFS=',' read autor _ palabras
do
        ##pago=$[$palabras/10]
        ##pago=$(($palabras/10))
        #let pago=palabras/10
        pago=$(echo "$palabras * 0.10" | bc)
        echo "$autor,$palabras,$pago" >> pagar-$(date +%B).txt
done < palabras-$(date +%B).txt

sort -t ',' -k3 -nr pagar-$(date +%B).txt -o pagar-$(date +%B)

echo "El fichero ordenado por coste de mayor a menos vale: "

cat pagar-$(date +%B).txt

# -o --> lo mismo que > (puede dar errores)
# -n --> ordena en números
# -r --> "al revés" reverse

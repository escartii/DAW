#!/bin/bash
#Alvaro Escarti

myDni=$1
echo "My DNI is: "$myDni

#Creamos un bucle con la variable i
#Utilizamos la variable de angel para comprobar si es 0 incrementa el numero
#usamos -q para no mostrar por pantalla

for i in $(seq 1 100); do
    rc=0 
    echo $myDni | grep -q $i || rc=1
    if [ $rc -eq 0 ]; then
        ((++incremento))
        echo " * The number : {$i} is in our DNI number yes | name of ocurrences $incremento"
    fi

done
exit 0

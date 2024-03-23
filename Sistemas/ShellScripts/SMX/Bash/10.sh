#!/bin/bash

#Alvaro Escarti :))

iplocal=$(hostname -I | cut -d "." -f4)
#echo $iplocal

##NO LEER SON APUNTES MIOS :)
# hola angel
## tail -n +2 para cortar la primera linea, tambien podemos usar awk "NR>1"


cat MOCK_DATA.csv | tail -n +2 | while read lines; do

    username=$(echo $lines | cut -d "," -f8)
    ip=$(echo $lines | cut -d "," -f5 | cut -d "." -f4)
    #Puede parecer algo obvio pero ponemos -eq por que las ips son numeros :)
    # soy idiota y habia puesto "="
    if [ $ip -eq $iplocal ]; then
        #echo $username
        echo " username: "$username ": tiene la misma ip :" $ip
    fi

done
exit 0

#!/bin/bash

#Alvaro Escarti :))

#rc=0
#domain=$( cat MOCK_DATA.csv | cut -d "," -f6 | grep *^"\\." ) || rc=1

#if [ $rc -eq 0 ]; then 
 #   echo $domain | cut -d "," -f2,8
#fi

#echo $domain

cat MOCK_DATA.csv | while read lines; do
    #guardamos la variables
    #cortamos la linea de los dominios
    #Con el sed cortamos entre dos palabras
    #wc -w cuenta palabras

    rc=$(echo $lines | cut -d "," -f6 | sed 's/\./ /g' | wc -w) 
    #si la variable RC es igual a 3
    if [ $rc -eq 3 ]; then
       # echo $lines | cut -d "," -f2,8
        name=$(echo $lines | cut -d "," -f2)
        username=$(echo $lines | cut -d "," -f8)
        echo "name : "$name " : username : "$username

    fi
done
exit 0



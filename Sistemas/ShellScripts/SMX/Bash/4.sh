#!/bin/bash

#Alvaro Escarti :))

cat MOCK_DATA.csv | while read lines; do
    rc=0
    numpalabras=$(echo $lines | cut -d "," -f9 | wc -w)
    #echo $numpalabras

    if [ $numpalabras -eq 3 ]; then 
        echo #$numpalabras
        name=$(echo $lines | cut -d "," -f2)
        plantname=$(echo $lines | cut -d "," -f9)
        echo "name :" $name " plantname : " $plantname

    fi

done
exit 0


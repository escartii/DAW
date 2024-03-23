#!/bin/bash

#Alvaro Escarti :))


cat MOCK_DATA.csv | tail -n 1000 | while read lines; do
    id=$(echo $lines | cut -d "," -f1)
    startD=$(echo $lines | cut -d "," -f2 | grep -i "^d")
    comprobar=$(echo $lines | tr " " "." | cut -d "," -f2 | grep -i "^d" | wc -w)
    let num=id%7
    if [ $num -eq 0 ]; then 

        if [ ! -z $comprobar ]; then 
            echo "$startD"
            
        fi
    fi

done


exit 0
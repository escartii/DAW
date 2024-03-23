#!/bin/bash

#Alvaro Escarti

cat MOCK_DATA.csv | while read lineas; do
    num=0
    rc=0
    c=0
    n=2
    #echo $lineas | cut -d "," -f1 
    #if [ $rc -eq 0 ]; then
        num=$(echo $lineas | cut -d "," -f1)
        echo $num

    fi
done

exit 0
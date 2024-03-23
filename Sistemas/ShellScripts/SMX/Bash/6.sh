#!/bin/bash


#Alvaro Escarti

cat MOCK_DATA.csv | while read lines; do
    rc=0
    echo $lines | cut -d "," -f7 | grep -iq ".gif" || rc=1
    if [ $rc -eq 0 ]; then 
        #echo $lines | cut -d "," -f8,7
        username=$(echo $lines | cut -d "," -f8)
        fichero=$(echo $lines | cut -d "," -f7)

        echo "username :" $username "fichero :" $fichero
    

    fi
done

exit 0

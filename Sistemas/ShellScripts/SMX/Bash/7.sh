#!/bin/bash 

#Alvaro Escarti :)))

cat MOCK_DATA.csv | while read lines; do

    rc=0
    echo $lines | cut -d "," -f4 | grep -q ".org" || rc=1
     if [ $rc -eq 0 ]; then 
        name=$(echo $lines | cut -d "," -f2)
        email=$(echo $lines | cut -d "," -f4)

        echo "name : "$name "email : "$email 
    fi

done
exit 0
#!/bin/bash

#Alvaro Escarti

cat MOCK_DATA.csv | while read lines; do
    rc=0
    echo $lines | cut -d "," -f7 | grep -q ".txt" || rc=1
    if [ $rc -eq 0 ]; then
     echo $lines | cut -d "," -f2,4
    fi

done

exit 0


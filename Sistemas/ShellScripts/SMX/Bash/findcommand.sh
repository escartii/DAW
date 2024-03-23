#!/bin/bash

#Alvaro Escarti :))

search=$1

for i in $(ls $HOME); do
    rc=0
    echo $i | grep -q $search || rc=1
    if [ $rc -eq 0 ]; then
        echo " * Working with : " $i
    fi
done

exit 0

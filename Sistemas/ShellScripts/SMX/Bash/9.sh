#!/bin/bash

#Alvaro Escarti :)


## que sea impar o divisible entre 6
## comience por F

cat MOCK_DATA.csv | while read lines; do
    

    id=$(echo $lines | cut -d "," -f1)
    username=$(echo $lines | cut -d "," -f8)
    rc=0
    f=$(echo $lines | cut -d "," -f9 | grep -i "^f") || rc=1  
    ## Calculamos que la planta empiece por F                                     
    if [ $rc -eq 0 ]; then
        ## Calculamos que el numero sea impar si el resto 1
        let num=id%2
        ## Calculamos si es divisor de 6 si el resto es 0
        let nume=id%6

        if [ $num -eq 1 -o $nume -eq 0 ]; then 
            #echo "el numero es impar o divisible entre 6"
            #echo $id
            #echo $username
            echo "id: "$id" || username: "$username" || plantname: "$f
        fi
    fi

 




done

exit 0

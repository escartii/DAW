#!/bin/bash


#Alvaro Escarti :))

cat MOCK_DATA.csv | while read lines; do


    ip=$(echo $lines | cut -d "," -f5)
    ipcomprobar=$(echo $lines | cut -d "," -f5 | cut -d "." -f1)
    #echo $ip

    if [ $ipcomprobar -ge 1 -a $ipcomprobar -le 127 ]; then 
        echo "la ip: "$ip "es tipo A"
    fi
    if [ $ipcomprobar -ge 128 -a $ipcomprobar -le 191 ]; then 
        echo "la ip: "$ip "es tipo B"
    fi
done

exit 0
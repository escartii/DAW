#!/bin/bash

directory=(Nocturns Fratres Adagio De DeProfundis)
instruments=(piccolo clarinet horn trunk fiddle viola cello doublebass battery xylophone conductor)

for crearDirectorios in $directory; do
[ -d /srv/sox/$work ]; then  
    rm -d /srv/sox/$crearDirectorios
else
    mkdir -p /srv/sox/$crearDirectorios
done

for instrument in $instruments;do
    for crearDirectorios in $directory; do
        echo "$instrument" > /srv/sox/$work/$instrument.txt
        chmod 640 /srv/sox/$work/$instrument.txt
        if [ $instrument = "viola" -o $instrument = "fiddle" ]; then
            chown $instrument:strings /srv/sox/$work/$instrument.txt
        else
            chown $instrument:woodwind /srv/sox/$work/$instrument.txt
fi

done
done

echo " * Working with Nocturns"
find /srv/sox/Nocturns -name "*.txt" -exec touch -t "197701010800" {} \;

echo " * Working with Fratres "
chown root:orchestra /srv/sox/Fratres
chmod g+s /srv/sox/Fratres

echo " * Working with De Profundis"

users="piccolo viola fiddle"
folders="Nocturns Fratres DeProfundis Adagio"

for directory in $directory; do
    for instrument in $instruments; do

id -u $user >> /srv/sox/$directory/$instrument.txt
id -g $user >> /srv/sox/$directory/$instrument.txt

    done
done

exit 0
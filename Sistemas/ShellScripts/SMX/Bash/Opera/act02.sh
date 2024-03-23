#!/bin/bash

#Alvaro Escarti :))
usuarios=(piccolo clarinet horn trunk fiddle viola cello doublebass battery xylophone conductor)
Directorios=(Sinfonetta Saturn Unfinished Valkyries)


if [ "$(id -u)" != "0" ]; then
   echo "Este script debe ejecutarse como root" 1>&2
   exit 1
fi


if id spectador >/dev/null 2>&1; then
    echo  "El usuario existe"
    userdel spectador &> /dev/null
else
    echo "El usuario no existe"
    useradd -p $(mkpasswd "1234") spectador &> /dev/null
fi

for crearUsuarios in "${usuarios[@]}" ; do

    mkdir /srv/sox/crearUsuarios &> /dev/null
done

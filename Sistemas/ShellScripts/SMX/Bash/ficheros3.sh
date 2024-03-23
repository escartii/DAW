#!/bin/bash


#Alvaro Escartii


#Checking if the script has root permission

if ! [ $(id -u) = 0 ]; then
    echo " ** [ ERROR ] : Run the script as ROOT **"
    exit 1
fi

#MAKING BACKUP
echo "Making Backup of the file: sources.list"
fecha=$(date +%Y%m%d.%H%M)
cp /etc/apt/sources.list /root/sources.$fecha.bak

fichero=($1)
for i in "${fichero[@]}"; do
    if [ $i = "senia" ]; then
        echo "* CHANGING CONFIGURATION**"
        echo "* DO STUFF *"
        echo "deb http://tic.ieslasenia.org/ubuntu jammy main universe restricted multiverse " > /etc/apt/sources.list
        echo "deb http://tic.ieslasenia.org/ubuntu jammy-updates main universe restricted multiverse" >> /etc/apt/sources.list
        echo "deb http://tic.ieslasenia.org/ubuntu jammy-security main universe restricted multiverse" >> /etc/apt/sources.list
        echo "deb http://tic.ieslasenia.org/ubuntu jammy-backports main restricted universe multiverse" >> /etc/apt/sources.list
        apt purge appstream command-not-found
        dpkg --remove-architecture i386
        echo "** UPDATING **"
        apt update
        echo "** UPGRADING **"
        apt full-upgrade --yes
    elif [ $i = "home" ]; then
	    echo "** File changing to HOME**"
        echo "deb http://es.archive.ubuntu.com/ubuntu jammy main universe restricted multiverse" > /etc/apt/sources.list
        echo "deb http://es.archive.ubuntu.com/ubuntu jammy-updates main universerestricted multiverse" >> /etc/apt/sources.list
        echo "deb http://es.archive.ubuntu.com/ubuntu jammy-security main universerestricted multiverse" >> /etc/apt/sources.list
        echo "deb http://es.archive.ubuntu.com/ubuntu jammy-backports main universerestricted multivers" >> /etc/apt/sources.list
    else
        exit 1
    fi

done

exit 0


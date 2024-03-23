#!/bin/bash

#Script CopyRight Alvaro Escarti :)
#email: <escartismx@gmail.com>

echo "Script for testing purpouses"
echo "Wait im checking if Dual Boot exist"
sleep 2

#Testing if Dual Boot Exists

rc=0
os-prober | grep -iq "windows" || rc=1
if [ $rc -eq 0 ]; then 
    echo "Dual Boot exists"
else
    echo "*** [ ERROR ] *** : Dual Boot not found! "
fi

#Verfiy the GRUB is installed

if [ -f /boot/grub/grub.cfg ]; then 
    echo "GRUB is installed"
else
    echo " *** [ ERROR ] *** : GRUB is not installed"
    exit 1
fi

#Checking if the grub have a password
rc=0
cat /etc/grub.d/00_header | grep "transistor" || rc=1
if  [ $rc -eq 0 ]; then
    echo "GRUB HAS PASSWORD"
else
    echo "*** [ ERROR ] *** : GRUB has not password"
fi

#Checking there is no restriction =)
rc=0
cat /etc/grub.d/10_linux | grep "unrestricted" || rc=1
if [ $rc -eq 0 ]; then
    echo "LLIUREX IS UNLOCKED"
else
    echo "*** [ ERROR ] *** LLIUREX IS LOCKED"
fi

exit 0



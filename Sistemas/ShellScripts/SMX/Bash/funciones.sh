#!/bin/bash

#Alvaro Escarti :))

function saludar () {

    echo "Hola Angel"

}

saludar ## o/

##Saber cuantos scripts SH hay en mi Escritorio

function saber_scripts () {

scripts=$(find $HOME . -iname '*.sh' | wc -l)
echo "EN TU HOME HAY: " $scripts " SHELL SCRIPTS"
}


saber_scripts


#Encontrar directorios y listarlos por numeros
function saber_dir () {

dirr=$(find $HOME/Escritorio . -type d | wc -l)
echo "EN TU HOME HAY: "$dirr "DIRECTORIOS"
}

saber_dir

exit 0

#!/bin/bash
#Se que esta mal tabulado pero es para repasar
rutaDir=/users/alvaroescarti
#Alvaro Escarti
Directorios="Carpeta1 Carpeta2 Carpeta3"
$2 = $comprobar
#Compruebo que introduce 2 parametros
if [ $# -eq 2 ]; then

    echo "has introducido dos parametros"
    #Array crear directorios
    for i in "${Directorios[@]}"; do
	mkdir $Directorios
    done
    if [ -d $rutaDir ]; then
	echo "la ruta existe"
    else

	echo "no existe"
    fi
    #Compruebo si existe el usuario mediante su ID
    if id "$1" &>/dev/null; then
        echo "El usuario: "$1 "existe"
	if [ $comprobar = "xd" ]; then
	    echo "ha introducido xd"
	else
	    echo "no ha introducido xd"
        fi
    else
        echo 'user not found'
fi
else
    echo "No has introducido dos parametros"

fi

#Contar lineas de un fichero
contarLineas=$(wc -l /etc/passwd)
if [ $contarLineas -eq 127 ]; then
    echo "OLE"
else
    echo "nO OLE"
fi 


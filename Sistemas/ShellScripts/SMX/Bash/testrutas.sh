#!/bin/bash


#Alvaro Escarti :))

read -p "Introduce una ruta: " ruta
echo $ruta

if [ -d $ruta ]; then
    cd $ruta
    read -p "Introduce un fichero: " fichero
    if [ -a $fichero ]; then
    [ -w $fichero ] && W="Tiene permisos de Escritura" || W="No tiene permisos de Escritura"
	[ -x $fichero ] && X="Tiene permisos de Ejecución" || X="No tiene permisos de ejecucion" 
	[ -r $fichero ] && R="Tiene permisos de Lectura" || R="No tiene permisos de lectura"

	echo "El fichero " $fichero "$W"
	echo "El fichero " $fichero "$R"
	echo "El fichero " $fichero "$X"
    else
        echo "El fichero no existe"
    fi
else
    echo "La ruta no existe"
fi

exit 0
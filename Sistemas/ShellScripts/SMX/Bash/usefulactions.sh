
#!/bin/bash
#ALvaro Escarti :))
usuario=$1
ruta=$3
if [ $# -ne 2 ]; then
    #compruebo que existe un usuario, si existe envio la salida al agujero negro
    if id "$1" >/dev/null 2>&1; then
        echo "The user: "$usuario "exists"
        if [ $2 = "replenish" ]; then
            # Creo un array con los nombres de los directorios que quieres crear
	    echo "Creando SolarSystem en tu HOME..."
            cd /home/$usuario
            mkdir -p /home/$usuario/SolarSystem
            directorios=(Mercury Venus Mars Jupiter Saturn Uranus Neptune)
	    echo "Creando los directos de los planetas en SolarSystem..."
            for directorio in ${directorios[@]}; do
                mkdir -p SolarSystem/$directorio
	        touch /home/$1/SolarSystem/$directorio/control-planet.txt
	        if [ $directorio = "Saturn" ]; then
		    date=$(date +%Y%m%d-%H%M)
		    touch /home/$1/SolarSystem/Saturn/Enviroment-$1-$date.txt
		    if [ -f "/home/$1/SolarSystem/Saturn/control-planet.txt" ]; then
			echo "Eliminado el fichero intruso en Saturn..."
		        rm "/home/$1/SolarSystem/Saturn/control-planet.txt"
		    fi
	        fi

            done
        fi

	if [ $2 = "test" ]; then #si el segundo argumento es test entra aqui
		read=$(ls -l $HOME/SolarSystem | cut -d "d" -f2 | head -n2 | tail -n1) #corto para que empiece por R
		if [[ $read =~ ^r.* ]]; then #Si empieza por r tienen permisos de lectura
		    echo "El directorio: "$ruta "tiene permisos de lectura"
		else
		    echo "No tiene permisos de lectura"
		fi

	        if test -d $ruta; then
		    echo "la carpeta SolarSystem está en un lugar correcto"
	        fi
		cd /home/$1/SolarSystem
		all=$(find . -perm /u=r) #este comando muestra directorios, subdirectorios y ficheros :)
		ficheros=$(find . -perm /u=r | grep ".txt") #busco ficheros para comprobar mas tarde si tienen permisos
		if [ -n "$all" ]; then
		    directorios=$(ls -l | cut -d " " -f9) #Corto los directorios
		    echo "Los directorios: "$directorios" tienen permisos de lectura"
		else
		    echo"Los directorios: "$directorios" no tienen permisos de lectura"
		fi
		for i in $ficheros; do # Bucle para que muestre linea a linea los permisos que tienen :)
		    if [ -n "$ficheros" ]; then  #compruebo que los ficheros tienen permisos
			echo "Los ficheros: "$i" Tienen permisos de lectura"
		    else
			echo "Los ficheros: "$i" No tienen permisos de lectura"
		    fi
		done
        fi
	if [ $2 = "clean" ]; then
	    if test -d $ruta; then
		echo "la carpeta SolarSystem está en un lugar correcto"
	    fi
	    echo "Borrando SolarSystem y todo su contenido..."
	    sleep 1
 	    echo "Borrado con exito"
	    rm -rf /home/$1/SolarSystem
	fi
    else
        echo "Error - The user given not exists " 
    fi
else
    echo "Put 3 arguments"
    exit 1
fi

exit 0

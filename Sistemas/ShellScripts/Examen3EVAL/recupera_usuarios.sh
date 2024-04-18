#!/bin/bash

#Alvaro Escarti :))

#Comprobar que el script se ejecuta como sudo

if [ "$EUID" -ne 0 ]; then
    echo "Por favor, ejecuta este script como sudo"
    exit 1
fi

#Inicializo el array que guardara el listado de los usuarios reparados
usuarios_reparados=()
    usuario=$1
    pass_inicial=$2
    #Primero busco el nombre
    grupo=$(grep "^^$usuario:" /etc/group | cut -d ":" -f1)
    

    # Creo el directorio home del usuario, si no existe
    if [ ! -d "/home/$usuario" ]; then
        mkdir "/home/$usuario"
        chown $usuario:$grupo "/home/$usuario"
	chmod 750 "/home/$usuario"
    fi

    # Configuro la contraseña que hemos solicitado
    echo "$usuario:$pass_inicial" | chpasswd
    chage -d 0 $usuario
    
    # Añado el usuario que hemos reparado al array de usuarios reparados
    usuarios_reparados+=


read -p "Introduce la contraseña inicial para los usuarios reparados: " pass_inicial

# Rwecorremos /etc/passwd en busca de usuarios a los que les falta el home

# de los 7 campos, elijo los que me quiero quedar
while IFS=: read -r usuario _ uid _ _ home _; do

    if [  ! -d "$home" ]; then
        reparar_usuario $usuario $pass_inicial

    fi
#Cargo el fichero
done < /etc/passwd

echo "Los usuarios que han sido reparados son: ${usuarios_reparados[@]}"



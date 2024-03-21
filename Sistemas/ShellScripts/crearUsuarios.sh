#!/bin/bash

# Verifica si el script se ejecuta con privilegios de superusuario
if [ "$EUID" -ne 0 ]; then
    echo "Por favor, ejecuta este script como superusuario."
    exit 1
fi

# Archivo de texto que contiene los detalles de los usuarios
archivo_usuarios="usuarios.txt"

# Verifica si el archivo de usuarios existe
if [ ! -f "$archivo_usuarios" ]; then
    echo "El archivo $archivo_usuarios no existe."
    exit 1
fi

# Itera sobre cada línea del archivo
while IFS=':' read -r username password uid gid nombre_completo directorio_inicial shell; do
    # Verifica si el grupo primario existe
    if ! getent group "$gid" &>/dev/null; then
        echo "El grupo $gid no existe. Creando el grupo..."
        groupadd -g "$gid" "$username"
        echo "Grupo $gid creado correctamente."
    fi
    
    # Verifica si el usuario ya existe
    if id "$username" &>/dev/null; then
        echo "El usuario $username ya existe."
    else
        # Crea el usuario con los detalles proporcionados
        useradd -m -p "$password" -g "$gid" -c "$nombre_completo" -d "$directorio_inicial" -s "$shell" "$username"
        echo "Usuario $username creado correctamente."
    fi
done < "$archivo_usuarios"

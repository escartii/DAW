#!/bin/bash

limpiar_pantalla() {
    clear
}

verificar_permisos() {
    if [ -w "$fichero" ]; then
        W="\e[32m\xE2\x9C\x94"  # Tick verde
    else
        W="\e[31m\xE2\x9C\x98"  # X roja
    fi

    if [ -r "$fichero" ]; then
        R="\e[32m\xE2\x9C\x94"
    else
        R="\e[31m\xE2\x9C\x98"
    fi

    if [ -x "$fichero" ]; then
        X="\e[32m\xE2\x9C\x94"
    else
        X="\e[31m\xE2\x9C\x98"
    fi

    echo -e "El fichero $fichero: "
    echo -e "$W Tiene permisos de Escritura \e[0m"
    echo -e "$R Tiene permisos de Lectura \e[0m"
    echo -e "$X Tiene permisos de Ejecución \e[0m"
}

while true; do
    read -p "Introduce una ruta (o 'exit' para salir): " ruta

    if [ "$ruta" == "exit" ]; then
        echo "Saliendo del script."
        break
    fi

    if [ -d "$ruta" ]; then
        cd "$ruta" || continue

        for fichero in *; do
            if [ -f "$fichero" ]; then
                verificar_permisos
            fi
        done
    else
        echo "La ruta no existe o no es un directorio válido."
    fi
done

limpiar_pantalla

exit 0

#!/bin/bash

#Alvaro Escarti :))


#!/bin/bash

# Alvaro Escarti :))


limpiar_pantalla() {
	clear
}



limpiar_pantalla

while true; do
    read -p "Introduce una ruta (o 'exit' para salir): " ruta

    # Verificar si el usuario desea salir del bucle
    if [ "$ruta" == "exit" ]; then
        echo "Saliendo del script."
        exit 0
    fi

    # Verificar si la ruta es un directorio válido
    if [ -d "$ruta" ]; then
        cd "$ruta" || continue  # Cambiar al directorio, continuar con el siguiente ciclo si falla

        # Iterar sobre cada fichero en la ruta
        for fichero in *; do
            if [ -f "$fichero" ]; then  # Verificar si el elemento es un archivo regular
                [ -w "$fichero" ] && W="Tiene permisos de Escritura" || W="No tiene permisos de Escritura"
                [ -x "$fichero" ] && X="Tiene permisos de Ejecución" || X="No tiene permisos de ejecucion"
                [ -r "$fichero" ] && R="Tiene permisos de Lectura" || R="No tiene permisos de lectura"

                echo "El fichero $fichero: $W, $R, $X"
            fi
        done
    else
        echo "La ruta no existe o no es un directorio válido."
    fi
done

exit 0



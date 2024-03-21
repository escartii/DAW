#!/bin/bash/

# Función para verificar si el texto es un nombre válido
es_nombre_valido() {
    if [[ "$1" =~ ^[a-zA-Z0-9_]+$ ]]; then
        return 0
    else
        return 1
    fi
}


while true; do
    read -p "Nombre: " nombre

    if es_nombre_valido "$nombre"; then
        break
    else
        echo "Nombre de carpeta"
    fi
done

mkdir $nombre
mkdir $nombre/query
read -p "Numero de consultas: " num

echo "# "$nombre > $nombre/README.md

echo  >> $nombre/README.md

for ((i = 1; i <= $num; i++)); do
    touch $nombre"/query/query$i.sql"
    echo -e "## Query $i:\n" >> $nombre/README.md
    echo -e "\`\`\`sql\n\n\`\`\`" >> $nombre/README.md
    echo -e "**[Enlace el archivo de la consulta $i](./query/query$i.sql)**\n" >> $nombre/README.md
done

git add *
git commit -m "Creacion de carpeta y querys completadas para el ejercicio"$nombre

exit 0
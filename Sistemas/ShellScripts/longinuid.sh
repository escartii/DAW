#!/bin/bash

#!/bin/bash
read -p "Archivo: " archivo
#output-delimitir, cambia el delimitador de salida, (el de entrada es ":", y ahora el de salida es ";")
cat /etc/passwd | cut -d ':' -f1,2 --output-delimiter=";" | sort -t ';' -k2 -n > $archivo
#!/bin/bash

# Copia total de un directorio con tar en la ruta /BACKUPS
tar cvf /BACKUPS/copia.tar /home/escartii/Documentos

# Descomprimir el archivo tar
tar xvf /BACKUPS/copia.tar

# Copia incremental de un directorio con tar en la ruta /BACKUPS
tar cv -g /BACKUPS/lista-incremental.file -f /BACKUPS/noticias-$(date +%d-%m-%Y).tar /NOTICIAS

# Descomprimir el archivo tar
tar xvf /BACKUPS/noticias-$(date +%d-%m-%Y).tar

# ver el contenido del archivo tar
tar tvf /BACKUPS/copia.tar
#
exit 0
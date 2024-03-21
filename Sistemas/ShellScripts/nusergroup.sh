#!/bin/bash

#Alvaro Escarti

#uniq sirve para quitar las lineas repetidas

#Cut es un comando que se utiliza para cortar una parte de un archivo llamado delimitador

cut -d ':' -f4 /etc/passwd | sort -n | uniq -c | sort -nr
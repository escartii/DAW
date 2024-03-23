#!/bin/bash

#Alvaro Escarti

#uniq sirve para quitar las lineas repetidas

#Cut es un comando que se utiliza para cortar una parte de un archivo llamado delimitador
#esto es un ejemplo con el sort y el cut
sort -t -k 3 /etc/passwd 
cut -d ':' -f4 /etc/passwd | sort -n | uniq -c | sort -nr
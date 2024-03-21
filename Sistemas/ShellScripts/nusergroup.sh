#!/bin/bash

#Alvaro Escarti

#uniq sirve para quitar las lineas repetidas

cut -d ':' -f4 /etc/passwd | sort -n | uniq -c | sort -nr
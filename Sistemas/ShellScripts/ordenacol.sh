#!/bin/bash

#Alvaro Escarti :))
# esto ordena el archivo usuarios.csv por el campo 2 y muestra las 10 primeras lineas
sort -t ',' -k2 usuarios.csv | head -n 10


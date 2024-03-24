#!/bin/bash
clear
read -p "Dime el archivo: " arch
# primero quita los espacios y pone un carro, los ordena
# alfabeticamente, despues cuenta las palabras y finalmete ordena
# numericamente de mayor a menor
tr ' ' '\n' < $arch | sort | uniq -c | sort -nr

#!/bin/bash

#Alvaro Escarti :))

archivo="usuarios.csv"

cat $archivo | tail -n +2 | tr ' ' ','



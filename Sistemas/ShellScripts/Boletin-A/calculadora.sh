#!/bin/bash

# Función para sumar
sumar() {
    resultado=$(($1 + $2))
    echo "La suma de $1 y $2 es: $resultado"
}

# Función para restar
restar() {
    resultado=$(($1 - $2))
    echo "La resta de $1 menos $2 es: $resultado"
}

# Función para multiplicar
multiplicar() {
    resultado=$(($1 * $2))
    echo "El producto de $1 y $2 es: $resultado"
}

# Función para dividir
dividir() {
    if [ $2 -ne 0 ]; then
        resultado=$(echo "scale=2; $1 / $2" | bc)
        echo "La división de $1 entre $2 es: $resultado"
    else
        echo "Error: No se puede dividir por cero."
    fi
}

# Función principal
main() {
    echo "Calculadora básica en Bash"
    echo "Ingrese dos números:"
    read -p "Número 1: " num1
    read -p "Número 2: " num2

    echo "Seleccione la operación que desea realizar:"
    echo "1. Sumar"
    echo "2. Restar"
    echo "3. Multiplicar"
    echo "4. Dividir"
    read -p "Opción: " opcion

    case $opcion in
        1) sumar $num1 $num2 ;;
        2) restar $num1 $num2 ;;
        3) multiplicar $num1 $num2 ;;
        4) dividir $num1 $num2 ;;
        *) echo "Opción inválida";;
    esac
}

# Llamada a la función principal
main

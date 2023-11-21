@echo off

set /p "numero_usuario=Ingrese un número del 1 al 23: "

if %numero_usuario% lss 1 (
    echo El numero debe ser al menos 1.
    goto :fin
)

if %numero_usuario% gtr 23 (
    echo El numero debe ser como máximo 23.
    goto :fin
)

set /a "numero_aleatorio=%RANDOM% %% %numero_usuario% +1"

echo El numero aleatorio entre 1 y %numero_usuario% es: %numero_aleatorio%

:fin

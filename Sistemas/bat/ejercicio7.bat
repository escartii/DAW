@echo off

echo Bienvenido al juego de adivinar el numero.
set /p "min=ingresa el valor minimo: "
set /p "max=ingresa el valor maximo: "

rem Genera un numero aleatroio entre min y max
set /a "numero_secreto=!random" %% (%max% - %min% +1) + %min%"
set "intentos=0"

:adivina
set /p "adivina=Intenta adivinar el numero entre %min% y %max%: "
set / a "Intentos+=1"

if %adivina% lss %numero_secreto% (
    echo Demasiado bajo. Intenta de nuevo.
    goto adivina
) else if %adivina% gtr %numero_secreto% (
    echo Demasiado alto. Intenta de nuevo.
    goto adivina
) else (
    echo Coreecto. Has adivinado el numero en %intentos% intentos.

endlocal
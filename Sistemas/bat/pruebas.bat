@echo off
title Division de dos numeros
set/p uno=Escriba el numerador

:denominador
set/p dos=Escriba el denominador

if %dos%==0(goto no se puede) else (goto dividr)

:nosepuede

echo El denominador no puede ser cero.
goto denominador.

:dividir
set/a tres=%uno%/%dos%
echo El resultado de %uno%/%dos% es %tres%
pause>nul
exit

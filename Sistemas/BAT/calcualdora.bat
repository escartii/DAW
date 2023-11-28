@echo off
set /p num1="Introduce el primer número: "
set /p num2="Introduce el segundo número: "


set /a suma=%num1% + %num2%
echo La suma es: %suma%

set /a resta=%num1% - %num2%
echo La resta es: %resta%

REM BEGIN: Multiplicación
set /a multiplicacion=%num1% * %num2%
echo La multiplicación es: %multiplicacion%


REM BEGIN: División
set /a division=%num1% / %num2%
echo La división es: %division%


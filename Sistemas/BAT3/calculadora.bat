@echo off
setlocal enabledelayedexpansion

:menu
cls
echo ------- Calculadora -------
echo 1. Sumar
echo 2. Restar
echo 3. Multiplicar
echo 4. Dividir
echo 5. Salir
echo --------------------------

set /p opcion=Selecciona una opción (1-5): 

if "%opcion%"=="1" goto sumar
if "%opcion%"=="2" goto restar
if "%opcion%"=="3" goto multiplicar
if "%opcion%"=="4" goto dividir
if "%opcion%"=="5" goto salir

echo Opción no válida. Inténtalo de nuevo.
pause
goto menu

:sumar
set /p num1=Introduce el primer número: 
set /p num2=Introduce el segundo número: 
set /a resultado=num1+num2
echo El resultado de la suma es: !resultado!
pause
goto menu

:restar
set /p num1=Introduce el primer número: 
set /p num2=Introduce el segundo número: 
set /a resultado=num1-num2
echo El resultado de la resta es: !resultado!
pause
goto menu

:multiplicar
set /p num1=Introduce el primer número: 
set /p num2=Introduce el segundo número: 
set /a resultado=num1*num2
echo El resultado de la multiplicación es: !resultado!
pause
goto menu

:dividir
set /p num1=Introduce el primer número: 
set /p num2=Introduce el segundo número: 
if "%num2%"=="0" (
    echo No se puede dividir por cero.
) else (
    set /a resultado=num1/num2
    echo El resultado de la división es: !resultado!
)
pause
goto menu

:salir
echo Saliendo de la calculadora.
pause

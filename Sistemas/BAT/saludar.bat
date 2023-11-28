@echo off
setlocal

REM BEGIN: Obtener nombre de usuario
set "username=%USERNAME%"
echo Hola, %username%!

REM BEGIN: Obtener nombre del ordenador
set "computername=%COMPUTERNAME%"
echo Estás en el ordenador %computername%.

REM BEGIN: Obtener hora del sistema
for /f "tokens=1 delims= " %%a in ('time /t') do set "hora=%%a"
echo La hora actual es %hora%.

REM BEGIN: Obtener fecha del sistema
for /f "tokens=1 delims= " %%a in ('date /t') do set "fecha=%%a"
echo La fecha actual es %fecha%.


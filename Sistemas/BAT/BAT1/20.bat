@echo off
echo La fecha actual es:
date /t

echo.
pause

cls

echo Listado de directorios en el directorio activo:
dir /ad /on

echo.
pause

echo Versión del sistema operativo:
systeminfo | find "Versión del sistema operativo"

pause

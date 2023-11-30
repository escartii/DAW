@echo off
set "directorio_borrar=C:\ruta_absoluta\BORRAR"
set "directorio_temporal=%TEMP%"

if not exist "%directorio_temporal%" mkdir "%directorio_temporal%"

copy "%directorio_borrar%\*2*" "%directorio_temporal%"
echo Archivos que contienen '2' en el nombre copiados al directorio temporal de Windows.
exit /b 1

@echo off
set "directorio_descargas=..\Descargas"
set "directorio_borrar=BORRAR"

if not exist "%directorio_borrar%" mkdir "%directorio_borrar%"
copy "%directorio_descargas%\*.bak" "%directorio_borrar\"
echo Archivos .bak copiados correctamente a %directorio_borrar%
exit /b 1

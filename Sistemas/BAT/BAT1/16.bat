@echo off
set "directorio_escritorio=%USERPROFILE%\Desktop"
set "nuevo_archivo=%directorio_escritorio%\fusion.txt"

echo Quitando el atributo de solo lectura...
attrib -r "%nuevo_archivo%"

echo Intentando borrar el archivo %nuevo_archivo%...
del "%nuevo_archivo%"

pause

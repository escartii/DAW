@echo off
set "directorio_escritorio=%USERPROFILE%\Desktop"
set "nuevo_archivo=%directorio_escritorio%\fusion.txt"

echo Quitando los atributos de oculto y de solo lectura...
attrib -h -r "%nuevo_archivo%"

echo Atributos eliminados del archivo %nuevo_archivo%.

pause

@echo off
set "directorio_escritorio=%USERPROFILE%\Desktop"
set "nuevo_archivo=%directorio_escritorio%\fusion.txt"

attrib +h "%nuevo_archivo%"
echo Se ha asignado el atributo oculto al archivo %nuevo_archivo%.

pause

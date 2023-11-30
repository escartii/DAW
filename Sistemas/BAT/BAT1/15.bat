@echo off
set "directorio_escritorio=%USERPROFILE%\Desktop"
set "nuevo_archivo=%directorio_escritorio%\fusion.txt"

attrib +r "%nuevo_archivo%"
echo Se ha asignado el atributo de solo lectura al archivo %nuevo_archivo%.

exit /b 1

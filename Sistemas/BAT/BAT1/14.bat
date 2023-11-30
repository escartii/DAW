@echo off
set "directorio_escritorio=%USERPROFILE%\Desktop"
set "nuevo_archivo=%directorio_escritorio%\fusion.txt"

echo Atributos del archivo %nuevo_archivo%:
attrib "%nuevo_archivo%"

exit /b 1
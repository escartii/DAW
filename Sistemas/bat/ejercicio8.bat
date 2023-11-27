
@echo off
set "extension=txt"  REM Reemplaza "txt" con la extensión que deseas eliminar
set "directorio=%USERPROFILE%\Downloads"

echo Eliminando archivos con la extensión .%extension% en %directorio%
cd /d "%directorio%" || exit /b

del /q *.%extension%

echo Archivos con la extensión .%extension% eliminados correctamente.

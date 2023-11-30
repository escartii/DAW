@echo off

rem Verificar que se proporciona la extensión como parámetro
if "%1"=="" (
    echo Por favor, proporciona la extensión de los archivos a borrar como parámetro.
    exit /b 1
)

rem Establecer la ruta del directorio Descargas del usuario
set "directorio_descargas=%USERPROFILE%\Downloads"

rem Borrar los archivos con la extensión especificada en el directorio Descargas
del /q "%directorio_descargas%\*.%1"

echo Archivos con la extensión .%1 borrados del directorio Descargas.

pause

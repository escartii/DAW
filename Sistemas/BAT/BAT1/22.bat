@echo off

if "%1"=="" (
    echo Por favor, proporciona un directorio como primer parámetro.
    exit /b 1
)

if "%2"=="" (
    echo Por favor, proporciona un archivo como segundo parámetro.
    exit /b 1
)

set "directorio_a_listar=%1"
set "archivo_a_visualizar=%2"
set "directorio_descargas=%USERPROFILE%\Downloads"

echo Listando el contenido del directorio %directorio_a_listar%:
dir "%directorio_a_listar%"

echo.
pause

echo Visualizando el contenido del archivo %archivo_a_visualizar%:
type "%archivo_a_visualizar%"

echo.
pause

echo Copiando el archivo %archivo_a_visualizar% a %directorio_descargas%...
copy "%archivo_a_visualizar%" "%directorio_descargas%"

echo Copia completada. El archivo se ha copiado a %directorio_descargas%.
pause

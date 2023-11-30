@echo off

if "%1"=="" (
    echo Por favor, proporciona un nombre de archivo como parámetro.
    exit /b 1
)

set "archivo_a_copiar=%1"
set "directorio_temporal=%TEMP%"

echo Visualizando el contenido del archivo %archivo_a_copiar%:
type "%archivo_a_copiar%"

echo.
pause

echo Copiando el archivo %archivo_a_copiar% al directorio temporal...
copy "%archivo_a_copiar%" "%directorio_temporal%"

echo Copia completada. El archivo se ha copiado al directorio temporal.
pause

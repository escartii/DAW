@echo off
set "directorio_escritorio=%USERPROFILE%\Desktop"
set "nuevo_archivo=%directorio_escritorio%\fusion.txt"

if exist "%nuevo_archivo%" (
    type "%nuevo_archivo%"
) else (
    echo El archivo %nuevo_archivo% no existe.
)

exit /b 1


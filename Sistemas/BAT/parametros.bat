@echo off

if "%1"=="" (
    echo Por favor, proporciona un nombre de archivo como parámetro.
    exit /b 1
)

set archivo_a_verificar=%1


if exist %archivo_a_verificar% (
    echo El archivo %archivo_a_verificar% existe.
) else (
    echo El archivo %archivo_a_verificar% no existe.
)


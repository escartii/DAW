@echo off
echo Visualizando el contenido del archivo pasado como parámetro:
type %1

pause

echo Copiando el archivo pasado como parámetro al directorio temporal...
copy %1 %TEMP%

echo Copia completada. El archivo se ha copiado al directorio temporal.
exit /b 1

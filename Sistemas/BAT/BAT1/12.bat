@echo off
copy "%userprofile%\Desktop\texto1.txt" + "%userprofile%\Desktop\texto2.txt" "%userprofile%\Desktop\fusion.txt"
echo Fusion completada. Se ha creado el archivo fusion.txt en el escritorio.
exit /b 1

@echo off
set count=0

REM BEGIN: Contar argumentos
for %%x in (%*) do (
    find /c /v "" "%%x"
    set /a count+=1 
)
REM END: Contar argumentos

echo El número de argumentos es: %count%


@echo off
REM FORMA 1
date 01-01-1990
echo La fecha del sistema ha sido cambiada a 01-01-1990.

REM FORMA 2

setx CURRENT_DATE %DATE%
setx DATE 01-01-1990
echo La fecha del sistema ha sido cambiada a 01-01-1990.

REM FORMA 3

reg add "HKCU\Control Panel\International" /v sShortDate /t REG_SZ /d "01-01-1990" /f
echo La fecha del sistema ha sido cambiada a 01-01-1990.



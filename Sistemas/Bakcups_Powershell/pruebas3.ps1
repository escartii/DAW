wbadmin start backup -backupTarget:\\WSERVER-PROFE\Compartir -include:X:\DAW1\SI\Act-ps3.txt -user:prova -password:1234QWERasdf -quiet 


$ultimaVersion = (wbadmin get versions -backupTarget:$recursoCompartido2 -machine:WSERVER-PROFE | Select-Object -Last 1).backupTime
wbadmin start recovery -version:$ultimaVersion -backupTarget:\\WSERVER-PROFE\compartir\Escarti -itemType:Volume -items:X:
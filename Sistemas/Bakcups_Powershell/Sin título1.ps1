#Hacemos una copia de seguridad 
wbadmin start backup -backupTarget:\\WSERVER-PROFE\Compartir -include:X: -user:prova -password:1234QWERasdf -quiet 
$ultimaVersion = (wbadmin get versions -backupTarget:$recursoCompartido2 -machine:WSERVER-PROFE | Select-Object -Last 1).backupTime
wbadmin start recovery -version:$ultimaVersion -backupTarget:\\WSERVER-PROFE\compartir\Escarti -itemType:Volume -items:X:



## PROGRAMAR UNA TAREA QUE COPIA MI VOLUMEN X: 
wbadmin enable backup -addTarget:\\WSERVER-PROFE\compartir -include:X: -schedule:22:00 -user:prova -password:1234QWERasdf

wbadmin enable backup -addTarget:\\WSERVER-PROFE\compartir -include:X: -schedule:22:00 -user:prova -password:1234QWERasdf 
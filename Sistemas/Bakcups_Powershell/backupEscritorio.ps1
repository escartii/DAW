wbadmin start backup -backupTarget:F: -include:C:\Users\Administrador\Desktop -quiet
#Solo recupera ficheros 
wbadmin start recovery -version:02/21/2024-15:10 -backupTarget:F: -machine:Escarti -items:C:\Users\Administrador\Desktop -itemtype:File -quiet


# 9. Realizar una copia de seguridad de la unidad X: en \\WSERVER-PROFE\COMPARTIR
$recursoCompartido2 = "\\WSERVER-PROFE\compartir\WindowsImageBackup\Escarti"
Mostrar-MensajeExito "Realizando copia de seguridad del volumen X: en $recursoCompartido2"
if (-not (Test-Path $recursoCompartido2)) {
    Mostrar-MensajeError "El recurso compartido $recursoCompartido2 no existe."
} else {
    wbadmin start backup -backupTarget:\\WSERVER-PROFE\compartir -include:X:\DAW1\SI\Act-ps3.txt -user:prova -password:1234QWERasdf -quiet 
}

# 10. Crear un fichero X:\DAW1\SI\Act-ps3.txt
New-Item -Path "X:\DAW1\SI\Act-ps3.txt" -ItemType File -Force

# 11. Actualizar la copia de seguridad en red realizada
Mostrar-MensajeExito "Actualizando copia de seguridad en $recursoCompartido2"
wbadmin start backup -backupTarget:$recursoCompartido2 

# 12. Borrar X:\DAW1 yrecuperar usando la copia de seguridad

Mostrar-MensajeExito "Borrando X:\DAW1 y recuperando desde la copia de seguridad en $recursoCompartido2"
Remove-Item -Path X:\DAW1 -Recurse -Force
$ultimaVersion = (wbadmin get versions -backupTarget:$recursoCompartido2 -machine:Escarti)
wbadmin start recovery -version $ultimaVersion -backupTarget $recursoCompartido2 -itemType Volume -items X:\
# Coger la fecha y hora del identificador y recuperamos la copia
wbadmin start recovery -version:02/20/2024-14:58 -backupTarget:\\WSERVER-PROFE\compartir -machine:Escarti -items:X: -itemype:Volume -quiet



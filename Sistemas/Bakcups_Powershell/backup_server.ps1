Función para mostrar mensajes de error
function Mostrar-MensajeError {
    param([string]$mensaje)
    Write-Host "ERROR: $mensaje" -ForegroundColor Red
}

# Función para mostrar mensajes de éxito
function Mostrar-MensajeExito {
    param([string]$mensaje)
    Write-Host "Éxito: $mensaje" -ForegroundColor Green
}

# 1. Crear una copia de seguridad de el contenido de “usuarios” del sistema y de X:\DAW1 y guardar la copia de seguridad en el volumen F:
Mostrar-MensajeExito "Creando copia de seguridad en F:"
if (-not (Test-Path F:\)) {
    Mostrar-MensajeError "El volumen F: no existe."
} else {
    wbadmin start backup -backupTarget:F: -include:C:\usuarios,X:\DAW1
}

# 2. Crear la siguiente estructura de carpetas
$carpetas = @("X:\DAW1\SI\Act-ps1.txt", "X:\DAW1\BBDD", "X:\DAW1\FOL")
foreach ($carpeta in $carpetas) {
    New-Item -Path $carpeta -ItemType Directory -Force
}

# 3. Actualizar la copia de seguridad
Mostrar-MensajeExito "Actualizando copia de seguridad en F:"
if (-not (Test-Path F:\)) {
    Mostrar-MensajeError "El volumen F: no existe."
} else {
    wbadmin start backup -backupTarget:F:
}

# 4. Borrar X:\DAW1 y recuperar de copia de seguridad
Mostrar-MensajeExito "Borrando X:\DAW1 y recuperando desde la copia de seguridad en F:"
Remove-Item -Path X:\DAW1 -Recurse -Force
wbadmin start recovery -version:$(wbadmin get versions -backupTarget:F: | Select-Object -Last 1)

# 5. Realizar una copia de seguridad de el volumen X: en un recurso compartido por red de un compañero
$recursoCompartido = "\\nombre_del_equipo\recurso_compartido"
Mostrar-MensajeExito "Realizando copia de seguridad del volumen X: en $recursoCompartido"
if (-not (Test-Path $recursoCompartido)) {
    Mostrar-MensajeError "El recurso compartido $recursoCompartido no existe."
} else {
    wbadmin start backup -backupTarget:$recursoCompartido -include:X:\
}

# 6. Crear un fichero X:\DAW1\SI\Act-ps2.txt
New-Item -Path "X:\DAW1\SI\Act-ps2.txt" -ItemType File -Force

# 7. Actualizar la copia de seguridad en red realizada
Mostrar-MensajeExito "Actualizando copia de seguridad en $recursoCompartido"
wbadmin start backup -backupTarget:$recursoCompartido -allCritical

# 8. Borrar X:\DAW1 y recuperar usando la copia de seguridad
Mostrar-MensajeExito "Borrando X:\DAW1 y recuperando desde la copia de seguridad en $recursoCompartido"
Remove-Item -Path X:\DAW1 -Recurse -Force
wbadmin start recovery -version:$(wbadmin get versions -backupTarget:$recursoCompartido | Select-Object -Last 1)

# 9. Realizar una copia de seguridad de la unidad X: en \\WSERVER-PROFE\COMPARTIR
$recursoCompartido2 = "\\WSERVER-PROFE\compartir"
Mostrar-MensajeExito "Realizando copia de seguridad del volumen X: en $recursoCompartido2"
if (-not (Test-Path $recursoCompartido2)) {
    Mostrar-MensajeError "El recurso compartido $recursoCompartido2 no existe."
} else {
    wbadmin start backup -backupTarget:\\WSERVER-PROFE\Compartir -include:X:\DAW1\SI\Act-ps3.txt -user:prova -password:1234QWERasdf -quiet 
}

# 10. Crear un fichero X:\DAW1\SI\Act-ps3.txt
New-Item -Path "X:\DAW1\SI\Act-ps3.txt" -ItemType File -Force

# 11. Actualizar la copia de seguridad en red realizada
Mostrar-MensajeExito "Actualizando copia de seguridad en $recursoCompartido2"
wbadmin start backup -backupTarget:$recursoCompartido2 

# 12. Borrar X:\DAW1 y recuperar usando la copia de seguridad
Mostrar-MensajeExito "Borrando X:\DAW1 y recuperando desde la copia de seguridad en $recursoCompartido2"
Remove-Item -Path X:\DAW1 -Recurse -Force
$ultimaVersion = (wbadmin get versions -backupTarget:$recursoCompartido2 | Select-Object -Last 1).backupTime
wbadmin start recovery -version:$ultimaVersion -backupTarget:$recursoCompartido2 -itemType:Volume -items:X:\

## PROGRAMAR UNA TAREA QUE COPIA MI VOLUMEN X: 
wbadmin enable backup -addTarget:\\WSERVER-PROFE\compartir -include:X: -schedule:22:00 -user:prova -password:1234QWERasdf

wbadmin enable backup -addTarget:\\WSERVER-PROFE\compartir -include:X: -schedule:22:00 -user:prova -password:1234QWERasdf 








$ruta = "C:\Users\Administrador\Desktop\Apuntes\*"

# Obtener la fecha en el formato deseado (AAAA-MM-DD)
$fecha = Get-Date -Format "yyyy-MM-dd"

# Nombre del archivo ZIP con la fecha en el formato especificado
$nombreArchivoZip = "$fecha-CopiaSeguridad-tot.zip"

# Ruta de destino para la copia de seguridad
$rutaBackup = "F:\BACKUP\"

# Ruta completa del archivo ZIP
$rutaArchivoZip = Join-Path -Path $rutaBackup -ChildPath $nombreArchivoZip

# Comprimir solo los archivos modificados en un archivo ZIP
Compress-Archive -Path $ruta -DestinationPath $rutaArchivoZip -Force

#Borro del Escritorio
Remove-Item "C:\Users\Administrador\Desktop\Apuntes\*"

#Descomprimir
Expand-Archive -Path $rutaBackup$nombreArchivoZip -DestinationPath "C:\Users\Administrador\Desktop\Apuntes"
Write-Host "Se ha copiado correctamente"





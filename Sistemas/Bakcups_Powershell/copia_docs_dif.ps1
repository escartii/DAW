﻿# Ruta de origen
$sourcePath = "C:\Users\Administrador\Desktop\APUNTES"

# Ruta de destino para el backup
$backupPath = "F:\BACKUP"

# Obtener la fecha actual
$currentDate = Get-Date -Format "yyyy-MM-dd"

# Crear la carpeta de respaldo con la fecha actual si no existe
$backupFolder = Join-Path -Path $backupPath -ChildPath $currentDate
New-Item -ItemType Directory -Path $backupFolder -Force

# Obtener el nombre del último archivo de respaldo "-tot.zip" si existe
$lastBackupFile = Get-ChildItem -Path $backupPath -Filter "*-tot.zip" | Sort-Object LastWriteTime -Descending | Select-Object -First 1

if ($lastBackupFile -eq $null) {
    # Si es la primera copia o no hay copias "-tot.zip", copiar todos los archivos
    Copy-Item -Path "$sourcePath\*" -Destination $backupFolder -Recurse -Force
} else {
    # Copiar solo los archivos modificados desde la última copia "-tot.zip"
    $lastBackupDate = $lastBackupFile.LastWriteTime
    $filesToCopy = Get-ChildItem -Path $sourcePath | Where-Object { $_.LastWriteTime -gt $lastBackupDate }
    Copy-Item -Path $filesToCopy.FullName -Destination $backupFolder -Recurse -Force
}

# Comprimir la carpeta de respaldo en un archivo zip
$zipFileName = "$currentDate-docs_dif.zip"
$zipFilePath = Join-Path -Path $backupPath -ChildPath $zipFileName
Compress-Archive -Path $backupFolder\* -DestinationPath $zipFilePath -Force

# Verificar si el archivo zip no existe antes de crearlo
if (-not (Test-Path $zipFilePath)) {
    # Comprimir la carpeta de respaldo en un archivo zip
    Compress-Archive -Path $backupFolder\* -DestinationPath $zipFilePath -Force
    Write-Host "Archivo de copia de seguridad creado en: $zipFilePath"
} else {
    Write-Host "El archivo de copia de seguridad ya existe en la ruta: $zipFilePath. No se ha creado otro archivo."
}

# Eliminar los archivos originales, excluyendo el archivo zip
Remove-Item -Recurse -Exclude *.zip -Path F:\BACKUP\*

Write-Host "Copia de seguridad incremental completada. Archivo creado: $zipFilePath"



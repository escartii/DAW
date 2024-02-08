# Nombre del script: copia_docs_inc.ps1

# Variables para las rutas de origen y destino
$source = "$HOME\Desktop\APUNTES2"
$destination = "C:\BACKUP\"

# Obtener la fecha actual en el formato deseado para poder construir el nombre del fichero
$date = Get-Date -Format "yyyy-MM-dd"

# Crear el nombre del archivo zip (nombre y ruta: ejemplo C:\BACKUP\2024-02-08-docs_inc.zip)
$zipfile = $destination + $date + "-docs_inc.zip"

# Obtener la fecha de ayer
$lastDay = (Get-Date).AddDays(-1)

# Obtener los archivos modificados desde la fecha de ayer
$lastDayFiles = Get-ChildItem -Path $source -Recurse | Where-Object { $_.LastWriteTime -gt  $lastDay }

# Comprobar si existen ficheros modificados en el último día y copiarlos a una carpeta temporal
if ($lastDayFiles -ne $null) {
    # Crear una carpeta temporal para almacenar los archivos modificados con su estructura de directorios
    ### $tempFolder = Join-Path -Path $destination -ChildPath "temp"   --> otra forma de concatenar 2 path
    $tempFolder = $destination + "temp"
    # Crea una carpeta temporal, no importa que ya existiera porque es algo temporal
    New-Item -ItemType Directory -Force -Path $tempFolder

    # Copiar los archivos que han sido modificados a la carpeta temporal
    foreach ($file in $lastDayFiles) {
        $destinationFile = $file.FullName.Replace($source, $tempFolder)
        # Creo los directorios necesarios
        New-Item -ItemType Directory -Force -Path (Split-Path -Path $destinationFile -Parent)
        # copio el fichero
        Copy-Item -Path $file.FullName -Destination $destinationFile
    }

    # Creamos el archivo comprimido .zip con los ficheros modificados
    Compress-Archive -Path (Join-Path -Path $tempFolder -ChildPath "*") -DestinationPath $zipfile
    
    # Eliminamos la carpeta temporal
    Remove-Item -Path $tempFolder -Recurse -Force

    Write-Host "Copia de seguridad incremental creada en $zipfile"
} else {
    Write-Host "No hay archivos modificados en el último día."
}
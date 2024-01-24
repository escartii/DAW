$archivo = "C:\Users\escartii\Desktop\recortar.ps1"

if (Test-Path $archivo) {
    Write-Host "El archivo $archivo existe."
} else {
    Write-Host "El archivo $archivo no existe."
    New-Item -ItemType File -Path $archivo -Force
    Write-Host "Archivo $archivo creado exitosamente."
}



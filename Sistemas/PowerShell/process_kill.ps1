# Solicitar al usuario el ID del proceso a terminar
$idProceso = Read-Host "Ingrese el ID del proceso a terminar"

# Buscar el proceso por ID
$proceso = Get-Process -Id $idProceso -ErrorAction SilentlyContinue

if ($proceso -ne $null) {
    # Terminar el proceso
    Stop-Process -Id $idProceso -Force
    Write-Host "El proceso con ID $idProceso ha sido terminado."
} else {
    Write-Host "No se encontró ningún proceso con el ID $idProceso en ejecución."
}

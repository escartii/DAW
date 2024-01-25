#$alvaro = "Alvaro"
#$recortar = $alvaro.Substring(0,3)

#Write-Host $recortar

# Ruta al archivo CSV
$rutaCSV = "C:\Users\escartii\Desktop\senia.csv"

# Importar el CSV
$datos = Import-Csv $rutaCSV

# Filtrar las filas deseadas
$filasDeseadas = $datos | Where-Object { $_.grupo -eq 'DAW' }

# Iterar sobre las filas deseadas y mostrar las primeras tres letras por columna
foreach ($fila in $filasDeseadas) {
    $sumaNombre = $fila.Nombre.Substring(0,3)
    $sumaApellido1 = $fila.Apellido1.Substring(0,3)
    $sumaApellido2 = $fila.Apellido2.Substring(0,3)

    # Mostrar el resultado para cada fila
    #Write-Host "Nombre: $sumaNombre, Apellido1: $sumaApellido1, Apellido2: $sumaApellido2"
    # Resultado Final para el login
    Write-Host $sumaNombre$sumaApellido1$sumaApellido2
}



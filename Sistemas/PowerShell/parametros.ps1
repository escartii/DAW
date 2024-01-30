Param(
    [Parameter(Mandatory=$true)]
    [string] $Primero,
    [string] $Segundo = "valor por defecto",
    [switch] $Tercero = $false,
    [bool] $Cuarto,
    [int] $Quinto
)

#a Funcionalidad:

# cuando ejecutes el script debes poner como parametro: -primero hola, y 
# "hola" será el primer parametro
Write-Host $Primero
Write-Host $Segundo
Write-Host $Tercero
Write-Host $Cuarto
Write-Host $Quintos
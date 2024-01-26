function Procesos {
    param ([String]$procesos)
    #empezamos el proceso
    Start-Process $procesos
}

while ($true) {
    #Creo el menu
    Write-Host "Menu: "
    Write-Host "A. Listar los procesos "
    Write-Host "B. Iniciar los proceso "
    Write-Host "C. Parar un proceso "
    Write-Host "D. Fin programa"
    $opcion =  Read-Host "Que opcion quieres"
    switch ($opcion) {
        "A" {
            Get-Process
        }
        "B" {
            $comenzarProceso = Read-Host "elige el proceso que quieres iniciar: "
            iniciar_Process $comenzarProceso
        }
        "C" {
            $numiD = Read-Host "Ingrese el ID del proceso a terminar"
            Stop-Process -id $numID -Force
        }
        "D" {
            Write-Host "Salir"
            exit
        }
        default {
            Write-Host "Introduce un numero valido: (1-4)"
            Pause
        }
    }
}
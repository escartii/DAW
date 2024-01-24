param (
    [string]$nombre = $1
)
#Nombre del menu que se pasa como parametro
Write-Host "*******************" $nombre "*******************"

﻿do {
    Clear-Host
    Write-Host "MENÚ"
    Write-Host "1. Crear recurso compartido"
    Write-Host "2. Mostrar información de los recursos compartidos"
    Write-Host "3. Mostrar información detallada de un recurso"
    Write-Host "4. Modificar recurso"
    Write-Host "5. Eliminar recurso compartido"
    Write-Host "6. Añadir permiso de un usuario a un recurso"
    Write-Host "7. Eliminar permiso a un usuario"
    Write-Host "8. Denegar acceso de un usuario a un recurso"
    Write-Host "9. Desbloquear accceso a recurso"
    Write-Host "10. Salir"
    $opcion = Read-Host "Ingrese el número de la opción"
    switch ($opcion) {
        1 { 
            Get-LocalUser 
        }
        2 {
            $nombreUsuario = Read-Host "Ingrese el nombre del nuevo usuario"
            New-LocalUser -Name $nombreUsuario -Password (Read-Host -AsSecureString "Ingrese la contraseña")
        }
        3 {
            $nombreUsuario = Read-Host "Ingrese el nombre del usuario"
            $nuevaContraseña = Read-Host -AsSecureString "Ingrese la nueva contraseña"
            Set-LocalUser -Name $nombreUsuario -Password $nuevaContraseña
        }
        4 {
            $nombreUsuario = Read-Host "Ingrese el nombre del usuario"
            Disable-LocalUser -Name $nombreUsuario
        }
        5 {
            $nombreUsuario = Read-Host "Ingrese el nombre del usuario"
            Remove-LocalUser -Name $nombreUsuario
        }
        6 { 
            Get-LocalGroup
        }
        7 {
            $nombreGrupo = Read-Host "Ingrese el nombre del grupo"
            Get-LocalGroupMember -Group $nombreGrupo
        }
        8 {
            $nombreGrupo = Read-Host "Ingrese el nombre del nuevo grupo"
            New-LocalGroup -Name $nombreGrupo
        }
        9 {
            $nombreGrupo = Read-Host "Ingrese el nombre del grupo a borrar"
            Remove-LocalGroup -Name $nombreGrupo
        }
        10 {
            exit
        }
        default { 
            Write-Host "Opción no válida. Inténtelo de nuevo." 
        }
        
    }
    Pause
} while ($true)
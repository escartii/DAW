﻿do {
    Clear-Host
    Write-Host "MENÚ"
    Write-Host "1. Listar los usuarios del sistema"
    Write-Host "2. Crear usuario"
    Write-Host "3. Cambiar contraseña de un usuario"
    Write-Host "4. Desactivar usuario"
    Write-Host "5. Borrar usuario"
    Write-Host "6. Listar los grupos de usuarios del sistema"
    Write-Host "7. Listar miembros de un grupo"
    Write-Host "8. Crear grupo"
    Write-Host "9. Borrar grupo"
    Write-Host "10. Añadir usuario a grupo"
    Write-Host "11. Borrar usuario de un grupo"
    Write-Host "12. Salir"
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
            $nombreUsuario = Read-Host "Ingrese el nombre del usuario"
            $nombreGrupo = Read-Host "Ingrese el nombre del grupo"
            Add-LocalGroupMember -Group $nombreGrupo -Member $nombreUsuario
        }
        11 {
            $nombreUsuario = Read-Host "Ingrese el nombre del usuario"
            $nombreGrupo = Read-Host "Ingrese el nombre del grupo"
            Remove-LocalGroupMember -Group $nombreGrupo -Member $nombreUsuario
        }
        12 { 
            exit
        }
        default { 
            Write-Host "Opción no válida. Inténtelo de nuevo." 
        }
        
    }
    Pause
} while ($true)


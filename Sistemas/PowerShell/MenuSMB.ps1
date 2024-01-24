param (
    [string]$nombre = $1
)

do {
    Clear-Host
    Write-Host "*******************" $nombre "*******************"
    Write-Host "MENÚ"
    Write-Host "1. Crear recurso compartido"
    Write-Host "2. Mostrar información de los recursos compartidos"
    Write-Host "3. Mostrar información detallada de un recurso"
    Write-Host "4. Modificar recurso"
    Write-Host "5. Eliminar recurso compartido"
    Write-Host "6. Añadir permiso de un usuario a un recurso"
    Write-Host "7. Eliminar permiso a un usuario"
    Write-Host "8. Denegar acceso de un usuario a un recurso"
    Write-Host "9. Desbloquear acceso a recurso"
    Write-Host "10. Salir"
    $opcion = Read-Host "Ingrese el número de la opción"
    
    switch ($opcion) {
        1 { 
           $nombreRecurso = Read-Host "Dime el nombre del recurso: "
           $ruta = Read-Host "Dime la ruta: "
           New-SmbShare -Name $nombreRecurso -Path $ruta -FullAccess "Usuarios"
        }
        2 {
            # Obtener información de todos los recursos compartidos
            Get-SmbShare
        }
        3 {
            $nombreRecurso = Read-Host "Dime el nombre del recurso: "
            Get-SmbShare -Name $nombreRecurso

        }
        4 {
            $nombreRecurso = Read-Host "Ingrese el nombre del recurso a modificar: " 
            # Obtener información actual del recurso compartido
            $recursoExistente = Get-SmbShare -Name $nombreRecurso -ErrorAction SilentlyContinue

            if ($recursoExistente) {
                $nuevaDescripcion = Read-Host "Ingrese la nueva descripción: "
                # Modificar la descripción del recurso compartido
                Set-SmbShare -Name $nombreRecurso -Description $nuevaDescripcion
                Write-Host "Recurso compartido modificado correctamente."
            } else {
                Write-Host "El recurso compartido '$nombreRecurso' no existe."
            }
        }
        5 {
            $nombreRecurso = Read-Host "Ingrese el nombre del recurso compartido a eliminar: "
            # Verificar si el recurso compartido existe
            $recursoExistente = Get-SmbShare -Name $nombreRecurso -ErrorAction SilentlyContinue
            if ($recursoExistente) {
                # Eliminar el recurso compartido
                Remove-SmbShare -Name $nombreRecurso -Force
                Write-Host "Recurso compartido '$nombreRecurso' eliminado correctamente."
            } else {
                Write-Host "El recurso compartido '$nombreRecurso' no existe."
            }
        }
        6 {
            $nombreRecurso = Read-Host "Ingrese el nombre del recurso compartido: "
            # Verificar si el recurso compartido existe
            $recursoExistente = Get-SmbShare -Name $nombreRecurso -ErrorAction SilentlyContinue
            if ($recursoExistente) {
                $nombreUsuario = Read-Host "Ingrese el nombre del usuario al que desea añadir permisos: "
                $permiso = Read-Host "Ingrese el permiso (Full, Change, Read): "
                # Añadir permisos al recurso compartido para el usuario especificado
                Grant-SmbShareAccess -Name $nombreRecurso -AccountName $nombreUsuario -AccessRight $permiso
                Write-Host "Permisos añadidos correctamente para el usuario '$nombreUsuario' en el recurso compartido '$nombreRecurso'."
            } else {
                Write-Host "El recurso compartido '$nombreRecurso' no existe."
            }
        }
        7 {
            $nombreRecurso = Read-Host "Ingrese el nombre del recurso compartido: "
            
            # Verificar si el recurso compartido existe
            $recursoExistente = Get-SmbShare -Name $nombreRecurso -ErrorAction SilentlyContinue
        
            if ($recursoExistente) {
                $nombreUsuario = Read-Host "Ingrese el nombre del usuario al que desea revocar permisos: "
                
                # Verificar si el usuario tiene permisos en el recurso compartido
                $permisosUsuario = Get-SmbShareAccess -Name $nombreRecurso -AccountName $nombreUsuario -ErrorAction SilentlyContinue
        
                if ($permisosUsuario) {
                    # Revocar permisos del usuario en el recurso compartido
                    Revoke-SmbShareAccess -Name $nombreRecurso -AccountName $nombreUsuario -Force
        
                    Write-Host "Permisos revocados correctamente para el usuario '$nombreUsuario' en el recurso compartido '$nombreRecurso'."
                } else {
                    Write-Host "El usuario '$nombreUsuario' no tiene permisos en el recurso compartido '$nombreRecurso'."
                }
            } else {
                Write-Host "El recurso compartido '$nombreRecurso' no existe."
            }
        }
        8 {
            $nombreRecurso = Read-Host "Ingrese el nombre del recurso compartido: "
            
            # Verificar si el recurso compartido existe
            $recursoExistente = Get-SmbShare -Name $nombreRecurso -ErrorAction SilentlyContinue
        
            if ($recursoExistente) {
                $nombreUsuario = Read-Host "Ingrese el nombre del usuario al que desea denegar acceso: "
                
                # Verificar si el usuario tiene permisos en el recurso compartido
                $permisosUsuario = Get-SmbShareAccess -Name $nombreRecurso -AccountName $nombreUsuario -ErrorAction SilentlyContinue
        
                if ($permisosUsuario) {
                    # Denegar acceso del usuario al recurso compartido
                    Block-SmbShareAccess -Name $nombreRecurso -AccountName $nombreUsuario -Force
        
                    Write-Host "Acceso denegado correctamente para el usuario '$nombreUsuario' en el recurso compartido '$nombreRecurso'."
                } else {
                    Write-Host "El usuario '$nombreUsuario' no tiene permisos en el recurso compartido '$nombreRecurso'."
                }
            } else {
                Write-Host "El recurso compartido '$nombreRecurso' no existe."
            }
        }
        9 {
            $nombreRecurso = Read-Host "Ingrese el nombre del recurso compartido: "
            
            # Verificar si el recurso compartido existe
            $recursoExistente = Get-SmbShare -Name $nombreRecurso -ErrorAction SilentlyContinue
        
            if ($recursoExistente) {
                $nombreUsuario = Read-Host "Ingrese el nombre del usuario al que desea desbloquear acceso: "
                
                # Verificar si el usuario tiene permisos en el recurso compartido
                $permisosUsuario = Get-SmbShareAccess -Name $nombreRecurso -AccountName $nombreUsuario -ErrorAction SilentlyContinue
        
                if ($permisosUsuario) {
                    # Otorgar acceso al usuario al recurso compartido
                    Grant-SmbShareAccess -Name $nombreRecurso -AccountName $nombreUsuario -AccessRight Full
                    Write-Host "Acceso desbloqueado correctamente para el usuario '$nombreUsuario' en el recurso compartido '$nombreRecurso'."
                } else {
                    Write-Host "El usuario '$nombreUsuario' no tiene bloqueo de acceso en el recurso compartido '$nombreRecurso'."
                }
            } else {
                Write-Host "El recurso compartido '$nombreRecurso' no existe."
            }
        }
          
        default { 
            Write-Host "Opción no válida. Inténtelo de nuevo." 
        }
        
    }
 
    Pause
} while ($true)

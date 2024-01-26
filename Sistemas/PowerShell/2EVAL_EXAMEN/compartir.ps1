# Nombre del recurso compartido
$nombreRecurso = Read-Host "Dime el nombre del recurso"

# Ruta del directorio a compartir
$rutaDirectorio = Read-Host "Dime la ruta del directorio que quieres compartir"

# Verificar si el recurso compartido ya existe
$recursoExistente = Get-SmbShare -Name $nombreRecurso -ErrorAction SilentlyContinue

if ($recursoExistente) {
    Write-Host "El recurso compartido $nombreRecurso ya existe."
} else {
    # Crear el recurso compartido
    $user = Read-Host "Dime que usuario quieres compartir"
    New-LocalUser $user -NoPassword -AccountNeverExpires
    # Lo añado al grupo usuarios para poder hacer la comprobacion
    Add-LocalGroupMember -Group Usuarios -Member $user


    # Permisos -ChangeAccess Permisos de Escritura
    #Permisos -FullControl Todos los permisos
    #Permisos -ReadAccess Permisos solo de Lectura
    
    Write-Host "1. Permiso de Lectura"
    Write-Host "2. Permiso de Escritura"
    Write-Host "3. Todos los Permisos"
    $respuesta = Read-Host "Elige una opcion"
  
     if ($respuesta = 1){
        New-SmbShare -Name $nombreRecurso -Path $rutaDirectorio -ReadAccess $user 
     }

     if ($respuesta = 2){
        New-SmbShare -Name $nombreRecurso -Path $rutaDirectorio -ChangeAccess $user 
     }

     if ($respuesta = 3){
        New-SmbShare -Name $nombreRecurso -Path $rutaDirectorio -FullAccess $user 
     }

    Write-Host "Recurso compartido $nombreRecurso creado exitosamente."
}

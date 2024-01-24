# Nombre del recurso compartido
$nombreRecurso = "APUNTES"

# Ruta del directorio a compartir
$rutaDirectorio = "C:\Users\escartii\Desktop\APUNTES"

# Verificar si el recurso compartido ya existe
$recursoExistente = Get-SmbShare -Name $nombreRecurso -ErrorAction SilentlyContinue

if ($recursoExistente) {
    Write-Host "El recurso compartido $nombreRecurso ya existe."
} else {
    # Crear el recurso compartido
    New-LocalUser Miguel -NoPassword -AccountNeverExpires
    New-LocalUser Sara -NoPassword -AccountNeverExpires
    Add-LocalGroupMember -Group Usuarios -Member Miguel
    Add-LocalGroupMember -Group Usuarios -Member Sara
    # Permisos -ChangeAccess Permisos de Escritura
    #Permisos -FullControl Todos los permisos
    #Permisos -ReadAccess Permisos solo de Lectura
    New-SmbShare -Name $nombreRecurso -Path $rutaDirectorio -ChangeAccess "Miguel" -ReadAccess "Sara"
    Write-Host "Recurso compartido $nombreRecurso creado exitosamente."
}

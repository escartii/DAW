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
    New-SmbShare -Name $nombreRecurso -Path $rutaDirectorio -ChangeAccess "Miguel" -ReadAccess "Sara"
    Write-Host "Recurso compartido $nombreRecurso creado exitosamente."
}

# Mostrar información detallada del recurso compartido
Get-SmbShare -Name $nombreRecurso

# También puedes agregar más lógica según tus necesidades, como configurar permisos NTFS, etc.

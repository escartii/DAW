#Creacion de usuarios de forma masiva

$usuarios = Import-Csv -Path C:\Users\escartii\Desktop\senia.csv

foreach ($usuario in $usuarios) {
    # Recortamos las 3 primeras letras del nombre, apellido, apelli2
    $sumaNombre = $usuario.Nombre.Substring(0, 3)
    $sumaApellido1 = $usuario.Apellido1.Substring(0, 3)
    $sumaApellido2 = $usuario.Apellido2.Substring(0, 3)
    
    # Construir el login
    $nombreUsuario = $sumaNombre + $sumaApellido1 + $sumaApellido2
    $nombreGrupo = $usuario.grupo

    # Crear usuario con la contraseña NIA del usuario
    $clave = ConvertTo-SecureString $usuario.nia -AsPlainText -Force
    New-LocalUser -Name $nombreUsuario -Password $clave

    # Crear grupo si no existe
    if (-not (Get-LocalGroup -Name $nombreGrupo -ErrorAction SilentlyContinue)) {
        New-LocalGroup -Name $nombreGrupo
    }

    # Agregar usuario al grupo
    Add-LocalGroupMember -Group $nombreGrupo -Member $nombreUsuario

    # Mostrar el nombre de usuario
    Write-Host "Usuario creado: ($nombreusuario) y añadido al grupo ($nombreGrupo)"
}
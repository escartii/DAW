param (
# Le pasamos la ruta 
    [string]$rutaCSV = $1
)

# Validar la existencia del archivo CSV
if (-not (Test-Path $rutaCSV)) {
    Write-Host "Error: El archivo CSV no existe en la ruta proporcionada."
    exit
}

# Creación de usuarios de forma masiva
$usuarios = Import-Csv -Path $rutaCSV

foreach ($usuario in $usuarios) {
    
    # Construir el login
    $nombreUsuario = $usuario.USUARIO
    $nombreGrupo = $usuario.GRUPO

    if (Get-LocalUser $nombreUsuario -ErrorAction SilentlyContinue){
        Write-Host "El usuario ya existe"

    }else{
        # Crear usuario y contraseña al grupo al que pertenece
        $clave = ConvertTo-SecureString $usuario.USUARIO -AsPlainText -Force
        New-LocalUser -Name $nombreUsuario -Password $clave 
    }

    # Crear grupo si no existe
    if (-not (Get-LocalGroup -Name $nombreGrupo -ErrorAction SilentlyContinue)) {
        New-LocalGroup -Name $nombreGrupo
    }

    # Agregar usuario al grupo
    Add-LocalGroupMember -Group $nombreGrupo -Member $nombreUsuario
    # Lo añado al grupo usuarios para poder iniciar sesión y hacer las comprobaciones
    Add-LocalGroupMember -Group Usuarios -Member $nombreUsuario

    # Mostrar el nombre de usuario
    Write-Host "Usuario creado: ($nombreusuario) y añadido al grupo ($nombreGrupo)"
}
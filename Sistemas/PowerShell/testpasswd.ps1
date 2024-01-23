function Test-Passwd {
    param (
        [String]$password
    )

    # Comprueba si la contraseña cumple con los requisitos
    if ($password -cmatch "^(?=.*[A-Z])(?=.*[a-z])(?=.*\d)(?=.*[!@#\$%^&*()-=_+{}[\]:;,.<>?\/\\|]).{8,}$") {
        Write-Host "La contraseña cumple con los requisitos de complejidad."
        return $true
    } else {
        Write-Host "La contraseña no cumple con los requisitos de complejidad."
        return $false
    }
}

# Ejemplo de uso:
$passwordUsuario = Read-Host "Introduce la contraseña"
$resultado = Test-Passwd -password $passwordUsuario
if ($resultado) {
    Write-Host "Contraseña válida."
} else {
    Write-Host "Contraseña no válida."
}

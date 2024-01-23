function Test-Passwd {
    param (
        [String]$password
    )

    # Comprueba si la contrase�a cumple con los requisitos
    if ($password -cmatch "^(?=.*[A-Z])(?=.*[a-z])(?=.*\d)(?=.*[!@#\$%^&*()-=_+{}[\]:;,.<>?\/\\|]).{8,}$") {
        Write-Host "La contrase�a cumple con los requisitos de complejidad."
        return $true
    } else {
        Write-Host "La contrase�a no cumple con los requisitos de complejidad."
        return $false
    }
}

# Ejemplo de uso:
$passwordUsuario = Read-Host "Introduce la contrase�a"
$resultado = Test-Passwd -password $passwordUsuario
if ($resultado) {
    Write-Host "Contrase�a v�lida."
} else {
    Write-Host "Contrase�a no v�lida."
}

# Create two local users
$consultaUser = New-LocalUser -Name "Consulta" -Password (ConvertTo-SecureString "Password123" -AsPlainText -Force)
$modificaUser = New-LocalUser -Name "Modifica" -Password (ConvertTo-SecureString "Password123" -AsPlainText -Force)

# Create a shared folder
New-Item -Path "C:\COMPARTIR" -ItemType Directory

# Share the folder with appropriate permissions
New-SmbShare -Name "DATOS" -Path "C:\COMPARTIR" -FullAccess "Modifica" -ReadAccess "Consulta"

# Allow access from any IP (optional)
Set-SmbServerConfiguration -EnableSMB1Protocol $true

# Mount the shared folder on the client computer
$credential = Get-Credential -UserName "Consulta" -Message "Enter the password for the 'Consulta' user"
New-PSDrive -Name "W" -PSProvider "FileSystem" -Root "\\ServerName\DATOS" -Credential $credential -Persist

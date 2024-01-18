# Create two local users
$consultaUser = New-LocalUser -Name "Consulta" 
$modificaUser = New-LocalUser -Name "Modifica" 

# Create a shared folder
New-Item -Path "C:\COMPARTIR" -ItemType Directory

# Share the folder with appropriate permissions
New-SmbShare -Name "DATOS" -Path "C:\COMPARTIR" -FullAccess "Modifica" -ReadAccess "Consulta"

# Allow access from any IP (optional)
#Set-SmbServerConfiguration -EnableSMB1Protocol $true



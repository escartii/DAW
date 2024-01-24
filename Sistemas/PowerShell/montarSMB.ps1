# Definir la ruta del recurso compartido y la letra de unidad
$recursoCompartido = "\\nombre-del-servidor\nombre-del-recurso"
$letraUnidad = "W:"

# Obtener credenciales del usuario
$credenciales = Get-Credential -UserName "consulta" -Message "Ingrese la contraseña para el usuario consulta"

# Montar el recurso compartido
New-PSDrive -Name $letraUnidad -PSProvider FileSystem -Root $recursoCompartido -Persist -Credential $credenciales

# Puedes utilizar el siguiente comando para ver la unidad mapeada
Get-PSDrive

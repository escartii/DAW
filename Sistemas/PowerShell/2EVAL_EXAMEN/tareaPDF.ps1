if (Get-LocalUser -Name vicent){
    Write-Host "el usuario ya existe"
   
}else{
    New-LocalUser -Name vicent -NoPassword -AccountNeverExpires
    $ruta = "C:\DAW-SI"
    New-LocalGroup -Name alumnes
    #Añado vicent al grupo de Usuarios para poder iniciar sesión y comprobar que funciona
    Add-LocalGroupMember -Group Usuarios -Member vicent

    if (Test-Path $ruta){
        Write-Host "ya existe"

    }else{
        New-Item -ItemType Directory -Path $ruta -Force
        Copy-Item -Path C:\Users\vicent\Desktop\*.pdf -Destination C:\DAW-SI
    }
}

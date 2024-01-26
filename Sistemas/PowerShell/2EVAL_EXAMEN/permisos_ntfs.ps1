if (Get-LocalUser -Name vicent){
    Write-Host "el usuario ya existe"
   
}else{
    New-LocalUser -Name vicent
    $ruta = "C:\DAW-SI"
    New-LocalGroup -Name alumnes
    #Añado vicent al grupo de Usuarios para poder iniciar sesión y comprobar que funciona
    Add-LocalGroupMember -Group Usuarios -Member vicent

    if (Test-Path $ruta){
        Write-Host "ya existe"

    }else{
        New-Item -ItemType Directory -Path $ruta -Force
        #DOY PERMISOS A LA CARPETA DAW-SI a vicent 
        $acl = Get-Acl C:\DAW-SI
        $AccessRule = New-Object System.Security.AccessControl.FileSystemAccessRule("vicent","FullControl","Allow")
        $acl.SetAccessRule($AccessRule)
        $acl | Set-Acl C:\DAW-SI

        # PERMISOS PARA EL GRUPO ALUMNES
        #SENIA
        $acl = Get-Acl C:\DAW-SI
        $AccessRule = New-Object System.Security.AccessControl.FileSystemAccessRule("alumnes","Read","Allow")
        $acl.SetAccessRule($AccessRule)
        $acl | Set-Acl C:\DAW-SI
    }
}
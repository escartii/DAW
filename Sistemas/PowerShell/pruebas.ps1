if (Get-LocalUser -Name vicent){
    Write-Host "el usuario ya existe"
   
}else{
    New-LocalUser -Name vicent
    $ruta = "C:\DAW-SI"

    if (Test-Path $ruta){
        Write-Host "ya existe"

    }else{
        New-Item -ItemType Directory -Path $ruta -Force
    }

}
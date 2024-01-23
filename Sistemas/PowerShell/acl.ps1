New-LocalUser -Name Jaime -NoPassword -AccountNeverExpires
New-LocalUser -Name Belén -NoPassword -AccountNeverExpires
New-LocalUser -Name Marta -NoPassword -AccountNeverExpires
New-LocalUser -Name Luis -NoPassword -AccountNeverExpires
New-LocalUser -Name Carlos -NoPassword -AccountNeverExpires
New-LocalUser -Name Juan -NoPassword -AccountNeverExpires

New-LocalGroup -Name IES
New-LocalGroup -Name DAW
New-LocalGroup -Name DAM

Add-LocalGroupMember -Group IES -Member Luis
Add-LocalGroupMember -Group DAW -Member Luis
Add-LocalGroupMember -Group IES -Member Carlos
Add-LocalGroupMember -Group DAW -Member Carlos
Add-LocalGroupMember -Group IES -Member Belén
Add-LocalGroupMember -Group DAM -Member Belén
Add-LocalGroupMember -Group IES -Member Marta
Add-LocalGroupMember -Group DAM -Member Marta
Add-LocalGroupMember -Group IES -Member Jaime
Add-LocalGroupMember -Group IES -Member Juan

New-Item -ItemType Directory -Path "C:\Users\jcastro\Desktop\SENIA"
New-Item -ItemType Directory -Path "C:\Users\jcastro\Desktop\SENIA\APUNTES"
New-Item -ItemType Directory -Path "C:\Users\jcastro\Desktop\SENIA\APUNTES\DAW"
New-Item -ItemType Directory -Path "C:\Users\jcastro\Desktop\SENIA\APUNTES\DAM"

#SENIA
$acl = Get-Acl C:\Users\jcastro\Desktop\SENIA
$AccessRule = New-Object System.Security.AccessControl.FileSystemAccessRule("IES","Read","Allow")
$acl.SetAccessRule($AccessRule)
$acl | Set-Acl C:\Users\jcastro\Desktop\SENIA

#SENIA\APUNTES
$acl = Get-Acl C:\Users\jcastro\Desktop\SENIA\APUNTES
$AccessRule = New-Object System.Security.AccessControl.FileSystemAccessRule("Juan","FullControl","Allow")
$acl.SetAccessRule($AccessRule)
$acl | Set-Acl C:\Users\jcastro\Desktop\SENIA\APUNTES

#SENIA\APUNTES\DAW (DAW)
$acl = Get-Acl C:\Users\jcastro\Desktop\SENIA\APUNTES\DAW
$AccessRule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAW", "Read","Allow")
$AccessRule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAW", "Write","Allow")
$AccessRule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAW", "ReadAndExecute","Allow")
$acl.SetAccessRule($AccessRule)
$acl | Set-Acl C:\Users\jcastro\Desktop\SENIA\APUNTES\DAW

#SENIA\APUNTES\DAW (DAM)
$acl = Get-Acl C:\Users\jcastro\Desktop\SENIA\APUNTES\DAW
$AccessRule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAM", "Read","Deny")
$AccessRule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAM", "Write","Deny")
$AccessRule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAM", "ReadAndExecute","Deny")
$acl.SetAccessRule($AccessRule)
$acl | Set-Acl C:\Users\jcastro\Desktop\SENIA\APUNTES\DAW

#SENIA\APUNTES\DAM (DAM)
$acl = Get-Acl C:\Users\jcastro\Desktop\SENIA\APUNTES\DAM
$AccessRule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAM", "Read","Allow")
$AccessRule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAM", "Write","Allow")
$AccessRule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAM", "ReadAndExecute","Allow")
$acl.SetAccessRule($AccessRule)
$acl | Set-Acl C:\Users\jcastro\Desktop\SENIA\APUNTES\DAM

#SENIA\APUNTES\DAM (DAW)
$acl = Get-Acl C:\Users\jcastro\Desktop\SENIA\APUNTES\DAM
$AccessRule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAW", "Read","Deny")
$AccessRule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAW", "Write","Deny")
$AccessRule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAW", "ReadAndExecute","Deny")
$acl.SetAccessRule($AccessRule)
$acl | Set-Acl C:\Users\jcastro\Desktop\SENIA\APUNTES\DAM
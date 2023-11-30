@echo off

set /p edad="Introduce una edad: "

set /p edad2="Introduce la otra edad: "

set /a resultado=%edad% + %edad2%

echo La suma de las dos edades es: %resultado%

set /a media=%resultado% / 2

echo La media de la edad es: %media%
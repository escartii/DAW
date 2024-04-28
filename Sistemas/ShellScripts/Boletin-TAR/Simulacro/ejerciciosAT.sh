#!/bin/bash

#Ejercicio 1
echo "email -s 'Recordatorio de reunión' cliente@ejemplo.com" | at 9:00 AM next monday
#Ejercicio 2
echo "mysqldump -u usuario -pcontraseña basedatos > backup.sql" | at 2:00 AM tomorrow
#Ejercicio 3
echo "/ruta/al/script_de_limpieza.sh" | at 11:00 PM friday
#Ejercicio 4
echo "reboot" | at midnight tomorrow
#Ejercicio 5
echo "wget -O archivo_descargado.txt http://ejemplo.com/archivo" | at 6:30 AM every day
#Ejercicio 6
echo "/ruta/al/script_de_procesamiento.sh" | at 3:00 AM 1st day of the month
#Ejercicio 7
echo "notify-send 'Pagar facturas'" | at 10:00 AM 15th day of every month
#Ejercicio 8
echo "enviar_sms 'Recordatorio de reunión' 1234567890" | at 8:00 AM monday,tuesday,wednesday,thursday,friday
#Ejercicio 9
echo "/ruta/al/script_de_compilacion.sh" | at 2:00 AM last day of the month
#Ejercicio 10
echo "/ruta/al/script_de_copia_de_seguridad_incremental.sh" | at 11:00 PM friday
#Ejercicio 11
echo "/ruta/al/script_de_informe_de_ventas.sh" | at 9:00 AM every monday
#Ejercicio 12
echo "/ruta/al/script_de_analisis_de_rendimiento.sh" | at 3:00 AM 1st day of january,april,july,october
#Ejercicio 13
echo "/ruta/al/script_de_escaneo_de_vulnerabilidades.sh" | at 12:00 AM last saturday of every month














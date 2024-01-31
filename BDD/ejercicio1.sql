# Ejercicio1 Fotos del usuario con ID36
Select idFoto
From fotos,usuarios
where fotos.idUsuario = usuarios.idUsuario
AND fotos.idUsuario = 36;

#Otro ejemplo:

select * from instagram_low_cost.fotos f1
where f1.idUsuario=36

#Ejercicio2:	 	 	 	
#Fotos del usuario con ID36 tomadas en enero del2023

select * from instagram_low_cost.fotos f1
where YEAR(f1.fechaCreacion) = 2024  
AND MONTH(f1.fechacreacion) = 01
AND f1.idUsuario=33;


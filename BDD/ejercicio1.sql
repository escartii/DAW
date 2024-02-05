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

#Ejercicio3:
#Comentarios del usuario36 sobre la foto12 del usuario11
select * from comentarios,fotos
WHERE comentarios.idUsuario = 36
AND fotos.idFoto = 12
AND fotos.idUsuario = 11;

#Sacar los comentarios del usuario4
select * from comentarios
where comentarios.idUsuario=4;

#Sacar el nombre y la URL del Ejercicio2
SELECT fotos.url,usuarios.nombre FROM fotos,usuarios
where YEAR(fechaCreacion) = 2024  
AND MONTH(fechacreacion) = 01
AND fotos.idUsuario = 33
AND fotos.idUsuario = usuarios.idUsuario;
###

SELECT usuarios.nombre,comentarios.comentario,fotos.url
	FROM comentarios,fotos,usuarios, comentariosFotos
    WHERE fotos.idUsuario = 11
        AND usuarios.idUsuario = 36
        AND usuarios.idUsuario = comentarios.idUsuario
        AND comentariosFotos.idFoto = fotos.idFoto
        AND fotos.idUsuario = 11
        AND comentarios.idComentario = comentariosFotos.idComentario;




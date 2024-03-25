SELECT Genre.Name AS "Nombre del genero", COUNT(Track.TrackId) AS "total de canciones"
FROM Track
JOIN Genre ON Track.GenreId = Genre.GenreId
GROUP BY Genre.name;
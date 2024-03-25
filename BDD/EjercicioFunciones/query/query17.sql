SELECT Album.AlbumID, Album.Title AS "nombre album", COUNT(Track.TrackID) AS "total"
FROM Album
JOIN Track ON Album.AlbumID = Track.AlbumID
GROUP BY Album.AlbumID
ORDER BY total DESC;
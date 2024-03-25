USE Chinook;

SELECT Artist.name, Album.title
FROM Artist
JOIN Album
ON Artist.ArtistId=Album.ArtistId;
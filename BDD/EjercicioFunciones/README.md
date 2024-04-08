# EjercicioFunciones

**[Enlace a mi repositorio](https://gitlab.com/escartii/bases-de-datos/)**

## Query 1:

Voy a hacer un SELECT de toda la tabla Customer y voy a filtrar donde "Country" sea igual a "France"

```sql
SELECT * FROM Customer
WHERE Country LIKE "France"
```
**[Enlace el archivo de la consulta 1](./query/query1.sql)**

## Query 2:

Hago un SELECT de toda la tabla  Invoice, filtro la fecha que sea 2024 y filtro por los meses (Enero,febrero,marzo)

```sql
SELECT *
FROM Invoice
WHERE YEAR(InvoiceDate) = 2024
AND MONTH(InvoiceDate) IN (1, 2, 3);
```
**[Enlace el archivo de la consulta 2](./query/query2.sql)**

## Query 3:

Hago un SELECT de toda la tabla Track, y filtro donde el compositor sea "AC/DC"

```sql
SELECT * FROM Track
WHERE COMPOSER LIKE "AC/DC"
```
**[Enlace el archivo de la consulta 3](./query/query3.sql)**

## Query 4:

Selecciono el nombre y el tamaño en bytes de las 10 pistas más grandes de la tabla "Track", ordenadas por tamaño de bytes de manera descendente.

```sql
SELECT NAME, Bytes
FROM Track
ORDER BY Bytes DESC
LIMIT 10;
```
**[Enlace el archivo de la consulta 4](./query/query4.sql)**

## Query 5:

Selecciono los países únicos de la tabla "Customer", los ordeno alfabéticamente.

```sql
SELECT DISTINCT C.Country
FROM Customer AS C
ORDER BY C.Country ASC;

```
**[Enlace el archivo de la consulta 5](./query/query5.sql)**

## Query 6:

Selecciono los nombres únicos de géneros de la tabla "Genre", los ordena alfabéticamente.

```sql
SELECT DISTINCT NAME
FROM Genre
ORDER BY NAME ASC;

```
**[Enlace el archivo de la consulta 6](./query/query6.sql)**

## Query 7:

Selecciono los nombres de los artistas y los títulos de los álbumes de la tabla "Artist" y "Album" respectivamente, y los combina basándose en el ID del artista en ambas tablas.

```sql
SELECT Artist.name, Album.title
FROM Artist
JOIN Album
ON Artist.ArtistId=Album.ArtistId;
```
**[Enlace el archivo de la consulta 7](./query/query7.sql)**

## Query 8:

Busco los cinco empleados más jóvenes segun su fecha de nacimiento y devuelve su nombre y apellido

```sql
SELECT e1.FirstName, e1.LastName
FROM Employee AS e1
LEFT JOIN Employee AS e2 
ON e1.EmployeeId = e2.ReportsTo
GROUP BY e1.EmployeeId
ORDER BY e1.BirthDate DESC
LIMIT 5;
```
**[Enlace el archivo de la consulta 8](./query/query8.sql)**

## Query 9:

Busco ñas facturas en el sistema, luego las une con la información del cliente para obtener detalles como nombres y direcciones. Finalmente, filtra los resultados para incluir solo aquellos clientes que residen en Berlín.

```sql
SELECT Chinook.Invoice.InvoiceDate, FirstName, LastName, BillingAddress, PostalCode, Country, Total
FROM Chinook.Customer
JOIN Chinook.Invoice
ON Chinook.Customer.CustomerId = Chinook.Invoice.CustomerId
AND Chinook.Customer.City LIKE "Berlin";

```
**[Enlace el archivo de la consulta 9](./query/query9.sql)**

## Query 10:

Busco las canciones en las listas de reproducción con la letra "C" y lo que haya detrás, luego las uno con la información de las canciones y álbumes para obtener detalles completos.

```sql
SELECT Chinook.Playlist.Name, Track.Name, Album.Title, Track.Milliseconds
FROM Chinook.Playlist
JOIN Chinook.PlaylistTrack
ON Chinook.Playlist.PlaylistId = Chinook.PlaylistTrack.PlaylistId
JOIN Chinook.Track
ON Chinook.PlaylistTrack.TrackId = Chinook.Track.TrackId
JOIN Chinook.Album
ON Chinook.Track.AlbumId = Chinook.Album.AlbumId
AND Chinook.Playlist.Name LIKE 'C%'
GROUP BY Chinook.Album.Title
ORDER BY Chinook.Track.Milliseconds;

```
**[Enlace el archivo de la consulta 10](./query/query10.sql)**

## Query 11:

Busco los nombres y apellidos de los clientes que han realizado compras por un total superior a 10 en la tabla "Customer" e "Invoice". Luego, ordena los resultados por apellido en orden descendente.

```sql
SELECT FirstName AS "Nombre", LastName AS "Apellido"
FROM Customer C
JOIN Invoice I
ON C.CustomerId = I.CustomerId
WHERE I.Total > '10'
ORDER BY C.LastName DESC;

```
**[Enlace el archivo de la consulta 11](./query/query11.sql)**

## Query 12:

Selecciono la tabla invocide los campos total y con la funcion MIN,MAX,AVG saco el minimo,maximo y media.

```sql
SELECT
    MIN(Chinook.Invoice.Total) AS "MIN",
    MAX(Chinook.Invoice.Total) AS "MAX",
    AVG(Chinook.Invoice.Total) AS "MED"
FROM Chinook.Invoice;

```
**[Enlace el archivo de la consulta 12](./query/query12.sql)**

## Query 13:

Selecciono la tabla Artistas y con la función COUNT, obtenemos el numero total de artistas.

```sql
SELECT COUNT(*) 
AS "ARTISTAS TOTALES"
FROM ARTIST;
```
**[Enlace el archivo de la consulta 13](./query/query13.sql)**

## Query 14:

Lo que hacemos es contar el numero de canciones del album Out Of Time que uniremos las dos tablas con un join sobre el AlbumId.

```sql
SELECT COUNT(T.Name) AS "Num canciones"
FROM Track T
JOIN Album A
ON T.AlbumId = A.AlbumId
WHERE A.Title = "Out of time";

```
**[Enlace el archivo de la consulta 14](./query/query14.sql)**

## Query 15:

Cuento el numero de paises encontrados en la tabla "Customer" y devuelve el resultado con la etiqueta "Número de Paises".

```sql
SELECT COUNT(DISTINCT C.Country) AS "Número de Paises"
FROM Customer AS C;

```
**[Enlace el archivo de la consulta 15](./query/query15.sql)**

## Query 16:

Cuento todas las canciones por género musical en la tabla "Track", y luego los presenta junto con el nombre del género.

```sql
SELECT Genre.Name AS "Nombre del genero", COUNT(Track.TrackId) AS "total de canciones"
FROM Track
JOIN Genre ON Track.GenreId = Genre.GenreId
GROUP BY Genre.name;
```
**[Enlace el archivo de la consulta 16](./query/query16.sql)**

## Query 17:

Cuento todas las canciones por álbum en la tabla "Track", y luego presenta el ID del álbum, el nombre del álbum y el número total de canciones. Después ordeno descendentemente.

```sql
SELECT Album.AlbumID, Album.Title AS "nombre album", COUNT(Track.TrackID) AS "total"
FROM Album
JOIN Track ON Album.AlbumID = Track.AlbumID
GROUP BY Album.AlbumID
ORDER BY total DESC;
```
**[Enlace el archivo de la consulta 17](./query/query17.sql)**

## Query 18:

```sql
SELECT G.Name AS "Género", COUNT(T.TrackId) AS "Número canciones"
FROM Genre G
JOIN Track T
ON G.GenreId = T.GenreId
JOIN InvoiceLine INV
ON T.TrackId = INV.TrackId
GROUP BY G.GenreId;

```
**[Enlace el archivo de la consulta 18](./query/query18.sql)**

## Query 19:

Cuento el número de compras por álbum, ordeno los resultados por el número de compras de forma descendente y limito los resultados a los 6 albumes que mas se han comprado.

```sql
SELECT A.Title, COUNT(INV.TrackId) AS "Numero de Compras"
FROM Track AS T
JOIN Album AS A
ON T.AlbumId = A.AlbumId
JOIN InvoiceLine AS INV
ON T.TrackId = INV.TrackId
GROUP BY A.Title
ORDER BY COUNT(INV.TrackId) DESC
LIMIT 6;

```
**[Enlace el archivo de la consulta 19](./query/query19.sql)**

## Query 20:

Cuento con la función COUNT el número de clientes agrupados por país en la tabla "Customer". Luego, filtra los resultados para incluir solo aquellos países que tengan al menos 5 clientes. 

```sql
SELECT Country, COUNT(*) AS "Número clientes"
FROM Customer C
GROUP BY Country
HAVING COUNT(C.Country) >= 5;

```
**[Enlace el archivo de la consulta 20](./query/query20.sql)**


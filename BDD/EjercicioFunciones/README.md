# EjercicioFunciones

## Query 1:

```sql
SELECT * FROM Customer
WHERE Country LIKE "France"
```
**[Enlace el archivo de la consulta 1](./query/query1.sql)**

## Query 2:

```sql
SELECT *
FROM Invoice
WHERE YEAR(InvoiceDate) = 2024
AND MONTH(InvoiceDate) IN (1, 2, 3);
```
**[Enlace el archivo de la consulta 2](./query/query2.sql)**

## Query 3:

```sql
SELECT * FROM Track
WHERE COMPOSER LIKE "AC/DC"
```
**[Enlace el archivo de la consulta 3](./query/query3.sql)**

## Query 4:

```sql
SELECT NAME, Bytes
FROM Track
ORDER BY Bytes DESC
LIMIT 10;
```
**[Enlace el archivo de la consulta 4](./query/query4.sql)**

## Query 5:

```sql

```
**[Enlace el archivo de la consulta 5](./query/query5.sql)**

## Query 6:

```sql

```
**[Enlace el archivo de la consulta 6](./query/query6.sql)**

## Query 7:

```sql
USE Chinook;

SELECT Artist.name, Album.title
FROM Artist
JOIN Album
ON Artist.ArtistId=Album.ArtistId;
```
**[Enlace el archivo de la consulta 7](./query/query7.sql)**

## Query 8:

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

```sql

```
**[Enlace el archivo de la consulta 9](./query/query9.sql)**

## Query 10:

```sql

```
**[Enlace el archivo de la consulta 10](./query/query10.sql)**

## Query 11:

```sql

```
**[Enlace el archivo de la consulta 11](./query/query11.sql)**

## Query 12:

```sql
SELECT MIN(Total)
AS "Importe minimo" 
FROM Invoice;

SELECT MAX(Total)
AS "Importe maximo"
FROM Invoice;

SELECT AVG(Total)
AS "Importe medio"
FROM Invoice;
```
**[Enlace el archivo de la consulta 12](./query/query12.sql)**

## Query 13:

```sql
SELECT COUNT(*) 
AS "ARTISTAS TOTALES"
FROM ARTIST;
```
**[Enlace el archivo de la consulta 13](./query/query13.sql)**

## Query 14:

```sql

```
**[Enlace el archivo de la consulta 14](./query/query14.sql)**

## Query 15:

```sql

```
**[Enlace el archivo de la consulta 15](./query/query15.sql)**

## Query 16:

```sql
SELECT Genre.Name AS "Nombre del genero", COUNT(Track.TrackId) AS "total de canciones"
FROM Track
JOIN Genre ON Track.GenreId = Genre.GenreId
GROUP BY Genre.name;
```
**[Enlace el archivo de la consulta 16](./query/query16.sql)**

## Query 17:

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

```
**[Enlace el archivo de la consulta 18](./query/query18.sql)**

## Query 19:

```sql

```
**[Enlace el archivo de la consulta 19](./query/query19.sql)**

## Query 20:

```sql

```
**[Enlace el archivo de la consulta 20](./query/query20.sql)**


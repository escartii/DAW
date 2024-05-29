## Obtener el nombre y correo electronico de los profesores que imparten mas de 3 asignaturas:

```sql
SELECT nombre, email 
FROM profesor 
WHERE idProfesor IN (
    SELECT idProfesor 
    FROM impartir 
    GROUP BY idProfesor 
    HAVING COUNT(idAsignatura) > 3
);
```

## Listar los alumnos con la nota mas alta en cada asignatura
```sql
SELECT a.idAsignatura, m.idAlumno, m.nota
FROM matricula m
JOIN asignatura a ON m.idAsignatura = a.idAsignatura
WHERE m.nota = (
    SELECT MAX(m2.nota)
    FROM matricula m2
    WHERE m2.idAsignatura = m.idAsignatura
);
```

## Obtener los cursos que tienen más de 10 asignaturas
```sql
SELECT nombreDescriptivo 
FROM curso 
WHERE idCurso IN (
    SELECT curso 
    FROM asignatura 
    GROUP BY curso 
    HAVING COUNT(idAsignatura) > 10
);
```

## Listar los alumnos que no están matriculados en ninguna asignatura
```sql
SELECT idAlumno, nombre 
FROM alumno 
WHERE idAlumno NOT IN (
    SELECT DISTINCT idAlumno 
    FROM matricula
);
```

## Obtener el nombre y la direccion de los alumnos que viven en el mismo municipo que el profesor con id
```sql
SELECT nombre, direccion 
FROM alumno 
WHERE municipio = (
    SELECT municipio 
    FROM profesor 
    WHERE idProfesor = 'P001'
);

```

## Listar los nombres de las asignaturas y sus coordinadores cuyos creditos sean mayores que el promedio de creditos de todas las asignaturas
```sql
SELECT nombre, coordinador 
FROM asignatura 
WHERE creditos > (
    SELECT AVG(creditos) 
    FROM asignatura
);
```
## Obtener los profesores que no tienen ningun telefono de contacto registrado
```sql
SELECT idProfesor, nombre 
FROM profesor 
WHERE idProfesor NOT IN (
    SELECT idProfesor 
    FROM tlfContactoProf
);
```

## Listar los alumnos que tienen al menos una asignatura en el primer cuatrimestre y otra en el segundo cuatrimestre:
```sql
SELECT idAlumno, nombre 
FROM alumno 
WHERE idAlumno IN (
    SELECT m1.idAlumno 
    FROM matricula m1
    JOIN asignatura a1 ON m1.idAsignatura = a1.idAsignatura
    WHERE a1.cuatrimestre = '1'
) AND idAlumno IN (
    SELECT m2.idAlumno 
    FROM matricula m2
    JOIN asignatura a2 ON m2.idAsignatura = a2.idAsignatura
    WHERE a2.cuatrimestre = '2'
);

```


## Obtener el nombre de los cursos y el número de asignaturas que tienen, solo si tienen más de 5 asignaturas:
```sql
SELECT c.nombreDescriptivo, 
       (SELECT COUNT(*) 
        FROM asignatura a 
        WHERE a.curso = c.idCurso) AS numeroAsignaturas
FROM curso c
HAVING numeroAsignaturas > 5;
```


## Listar los alumnos cuyo promedio de notas sea superior al promedio de todos los alumnos
```sql
SELECT idAlumno, nombre 
FROM alumno 
WHERE (SELECT AVG(nota) 
       FROM matricula 
       WHERE idAlumno = alumno.idAlumno) > (
       SELECT AVG(nota) 
       FROM matricula
);
```

## Obtener los nombres de los profesores que no imparten ninguna asignatura en el primer cuatrimestre:
```sql
SELECT nombre 
FROM profesor 
WHERE idProfesor NOT IN (
    SELECT idProfesor 
    FROM impartir 
    WHERE idAsignatura IN (
        SELECT idAsignatura 
        FROM asignatura 
        WHERE cuatrimestre = '1'
    )
);

```

## Listar los nombres de los alumnos que tienen beca y están matriculados en más de 2 asignaturas:

```sql
SELECT nombre 
FROM alumno 
WHERE beca IS NOT NULL 
AND idAlumno IN (
    SELECT idAlumno 
    FROM matricula 
    GROUP BY idAlumno 
    HAVING COUNT(idAsignatura) > 2
);

```

## Obtener el nombre y apellido de los alumnos que están en un curso con menos de 5 asignaturas:

```sql
SELECT nombre, apellido1, apellido2 
FROM alumno 
WHERE idAlumno IN (
    SELECT m.idAlumno 
    FROM matricula m
    JOIN asignatura a ON m.idAsignatura = a.idAsignatura
    WHERE a.curso IN (
        SELECT idCurso 
        FROM curso 
        WHERE (SELECT COUNT(*) 
               FROM asignatura 
               WHERE curso = idCurso) < 5
    )
);

```

## Obtener los nombres y apellidos de los alumnos que tienen una nota superior a la media en al menos una asignatura:

```sql
SELECT al.nombre, al.apellido1, al.apellido2
FROM alumno al
WHERE EXISTS (
    SELECT 1
    FROM matricula m
    WHERE m.idAlumno = al.idAlumno
    AND m.nota > (SELECT AVG(nota) FROM matricula)
);

```

## Listar los profesores que coordinan asignaturas en cursos con más de 50 alumnos matriculados:

```sql
SELECT p.nombre, p.apellido1, p.apellido2
FROM profesor p
WHERE p.idProfesor IN (
    SELECT a.coordinador
    FROM asignatura a
    WHERE a.curso IN (
        SELECT m.idCurso
        FROM matricula m
        GROUP BY m.idCurso
        HAVING COUNT(m.idAlumno) > 50
    )
);

```

## Obtener los nombres de los alumnos que no han tomado ninguna asignatura en el segundo cuatrimestre:

```sql
SELECT al.nombre, al.apellido1, al.apellido2
FROM alumno al
WHERE NOT EXISTS (
    SELECT 1
    FROM matricula m
    JOIN asignatura a ON m.idAsignatura = a.idAsignatura
    WHERE m.idAlumno = al.idAlumno
    AND a.cuatrimestre = '2'
);

```

## Listar las asignaturas que tienen menos de 10 alumnos matriculados:

```sql
SELECT nombre
FROM asignatura
WHERE idAsignatura IN (
    SELECT idAsignatura
    FROM matricula
    GROUP BY idAsignatura
    HAVING COUNT(idAlumno) < 10
);
```

## Obtener el nombre y apellido de los alumnos que han obtenido la nota máxima en alguna asignatura:
```sql
SELECT nombreDescriptivo
FROM curso
WHERE idCurso NOT IN (
    SELECT DISTINCT curso
    FROM asignatura
    WHERE coordinador IS NOT NULL
);

```

## Obtener los nombres de los profesores que imparten asignaturas en más de un cuatrimestre:

```sql
SELECT p.nombre, p.apellido1, p.apellido2
FROM profesor p
WHERE p.idProfesor IN (
    SELECT i.idProfesor
    FROM impartir i
    JOIN asignatura a ON i.idAsignatura = a.idAsignatura
    GROUP BY i.idProfesor
    HAVING COUNT(DISTINCT a.cuatrimestre) > 1
);

```

## Listar los alumnos cuyo promedio de notas en las asignaturas de segundo cuatrimestre sea mayor que el promedio general de notas:

```sql
SELECT al.nombre, al.apellido1, al.apellido2
FROM alumno al
WHERE (SELECT AVG(m.nota)
       FROM matricula m
       JOIN asignatura a ON m.idAsignatura = a.idAsignatura
       WHERE m.idAlumno = al.idAlumno
       AND a.cuatrimestre = '2') > (SELECT AVG(nota) FROM matricula);

```

## Obtener los nombres y apellidos de los alumnos que tienen más de 3 teléfonos de contacto:

```sql
SELECT al.nombre, al.apellido1, al.apellido2
FROM alumno al
WHERE (SELECT COUNT(*)
       FROM tlfContactoProf t
       WHERE t.idProfesor = al.idAlumno) > 3;

```

## Obtener los nombres y apellidos de los alumnos que tienen una beca y cuyo promedio de notas es superior al promedio de los alumnos sin beca:

```sql
SELECT al.nombre, al.apellido1, al.apellido2
FROM alumno al
WHERE al.beca IS NOT NULL
AND (SELECT AVG(m.nota)
     FROM matricula m
     WHERE m.idAlumno = al.idAlumno) > (SELECT AVG(m2.nota)
                                        FROM matricula m2
                                        JOIN alumno a2 ON m2.idAlumno = a2.idAlumno
                                        WHERE a2.beca IS NULL);

```

## Listar los profesores que tienen más de un teléfono de contacto registrado:

```sql
SELECT p.nombre, p.apellido1, p.apellido2
FROM profesor p
WHERE (SELECT COUNT(*)
       FROM tlfContactoProf t
       WHERE t.idProfesor = p.idProfesor) > 1;

```


## Obtener los nombres y apellidos de los alumnos que no están matriculados en ninguna asignatura del primer cuatrimestre:
```sql
SELECT al.nombre, al.apellido1, al.apellido2
FROM alumno al
WHERE al.idAlumno NOT IN (
    SELECT m.idAlumno
    FROM matricula m
    JOIN asignatura a ON m.idAsignatura = a.idAsignatura
    WHERE a.cuatrimestre = '1'
);

```

## Obtener los nombres de los cursos que tienen asignaturas en ambos cuatrimestres:

```sql
SELECT nombreDescriptivo
FROM curso
WHERE idCurso IN (
    SELECT curso
    FROM asignatura
    WHERE cuatrimestre = '1'
) AND idCurso IN (
    SELECT curso
    FROM asignatura
    WHERE cuatrimestre = '2'
);

```

## Obtener los nombres de los cursos que tienen menos de 3 asignaturas:

```sql
SELECT nombreDescriptivo
FROM curso
WHERE idCurso IN (
    SELECT curso
    FROM asignatura
    GROUP BY curso
    HAVING COUNT(idAsignatura) < 3
);
```

## Obtener los nombres de los cursos que tienen menos de 3 asignaturas:

```sql
SELECT nombreDescriptivo
FROM curso
WHERE idCurso IN (
    SELECT curso
    FROM asignatura
    GROUP BY curso
    HAVING COUNT(idAsignatura) < 3
);
```
## Listar los nombres y apellidos de los alumnos que están matriculados en todas las asignaturas de un curso específico (por ejemplo, curso con id 'C001'):
```sql
SELECT al.nombre, al.apellido1, al.apellido2
FROM alumno al
WHERE NOT EXISTS (
    SELECT a.idAsignatura
    FROM asignatura a
    WHERE a.curso = 'C001'
    AND NOT EXISTS (
        SELECT m.idAlumno
        FROM matricula m
        WHERE m.idAlumno = al.idAlumno
        AND m.idAsignatura = a.idAsignatura
    )
);

```

## Obtener los nombres y apellidos de los alumnos cuyo promedio de notas es mayor que el promedio de las notas de los alumnos que tienen una beca específica (por ejemplo, 'B001'):
```sql
SELECT al.nombre, al.apellido1, al.apellido2
FROM alumno al
WHERE (SELECT AVG(m.nota)
       FROM matricula m
       WHERE m.idAlumno = al.idAlumno) > (
       SELECT AVG(m2.nota)
       FROM matricula m2
       JOIN alumno a2 ON m2.idAlumno = a2.idAlumno
       WHERE a2.beca = 'B001'
);

```

## Listar los nombres de los alumnos que no han recibido una nota mayor a 5 en ninguna asignatura:

```sql
SELECT nombre, apellido1, apellido2
FROM alumno
WHERE idAlumno NOT IN (
    SELECT idAlumno
    FROM matricula
    WHERE nota > 5
);

```

## Obtener los nombres de las asignaturas que son impartidas por más de dos profesores:

```sql
SELECT nombre
FROM asignatura
WHERE idAsignatura IN (
    SELECT idAsignatura
    FROM impartir
    GROUP BY idAsignatura
    HAVING COUNT(idProfesor) > 2
);

```

## Listar los profesores que imparten asignaturas en cursos con más de 20 alumnos matriculados:

```sql
SELECT p.nombre, p.apellido1, p.apellido2
FROM profesor p
WHERE p.idProfesor IN (
    SELECT i.idProfesor
    FROM impartir i
    JOIN asignatura a ON i.idAsignatura = a.idAsignatura
    WHERE a.curso IN (
        SELECT m.idCurso
        FROM matricula m
        GROUP BY m.idCurso
        HAVING COUNT(m.idAlumno) > 20
    )
);

```

## Obtener los nombres y apellidos de los alumnos que han tomado todas las asignaturas de un profesor específico (por ejemplo, 'P001'):

```sql
SELECT al.nombre, al.apellido1, al.apellido2
FROM alumno al
WHERE NOT EXISTS (
    SELECT a.idAsignatura
    FROM asignatura a
    WHERE a.idAsignatura IN (
        SELECT i.idAsignatura
        FROM impartir i
        WHERE i.idProfesor = 'P001'
    )
    AND NOT EXISTS (
        SELECT m.idAlumno
        FROM matricula m
        WHERE m.idAlumno = al.idAlumno
        AND m.idAsignatura = a.idAsignatura
    )
);

```

## Obtener los nombres de los cursos que tienen asignaturas impartidas por un profesor con categoría 'Titular':

```sql
SELECT DISTINCT c.nombreDescriptivo
FROM curso c
JOIN asignatura a ON c.idCurso = a.curso
WHERE a.idAsignatura IN (
    SELECT i.idAsignatura
    FROM impartir i
    JOIN profesor p ON i.idProfesor = p.idProfesor
    WHERE p.categoria = 'Titular'
);

```

## Listar los nombres y apellidos de los alumnos que han tomado más de 3 asignaturas impartidas por el mismo profesor:

```sql
SELECT al.nombre, al.apellido1, al.apellido2
FROM alumno al
WHERE al.idAlumno IN (
    SELECT m.idAlumno
    FROM matricula m
    WHERE m.idAsignatura IN (
        SELECT i.idAsignatura
        FROM impartir i
        GROUP BY i.idProfesor, m.idAlumno
        HAVING COUNT(i.idAsignatura) > 3
    )
);

```

## Listar los nombres y apellidos de los alumnos que han obtenido una nota superior a la media en todas las asignaturas del primer cuatrimestre:
```sql
SELECT al.nombre, al.apellido1, al.apellido2
FROM alumno al
WHERE NOT EXISTS (
    SELECT a.idAsignatura
    FROM asignatura a
    WHERE a.cuatrimestre = '1'
    AND NOT EXISTS (
        SELECT m.nota
        FROM matricula m
        WHERE m.idAlumno = al.idAlumno
        AND m.idAsignatura = a.idAsignatura
        AND m.nota > (
            SELECT AVG(nota)
            FROM matricula
        )
    )
);
```
## Obtener los nombres y apellidos de los alumnos que no tienen ninguna asignatura coordinada por el profesor 'P003':
```sql
SELECT al.nombre, al.apellido1, al.apellido2
FROM alumno al
WHERE al.idAlumno NOT IN (
    SELECT m.idAlumno
    FROM matricula m
    JOIN asignatura a ON m.idAsignatura = a.idAsignatura
    WHERE a.coordinador = 'P003'
);
```
## Listar los nombres y apellidos de los alumnos que tienen al menos una asignatura con nota inferior a 3:
```sql
SELECT al.nombre, al.apellido1, al.apellido2
FROM alumno al
WHERE EXISTS (
    SELECT 1
    FROM matricula m
    WHERE m.idAlumno = al.idAlumno
    AND m.nota < 3
);
```
## Obtener los nombres de los cursos que tienen asignaturas con más de 5 créditos:
```sql
SELECT DISTINCT c.nombreDescriptivo
FROM curso c
JOIN asignatura a ON c.idCurso = a.curso
WHERE a.creditos > 5;

```
## Obtener el nombre y apellido de los alumnos que tienen la nota máxima en alguna asignatura:
```sql
SELECT al.nombre, al.apellido1, al.apellido2
FROM alumno al
WHERE al.idAlumno IN (
    SELECT idAlumno
    FROM matricula
    WHERE nota = (SELECT MAX(nota) FROM matricula)
);
```
## Listar los nombres de los cursos y el número de asignaturas que tienen, solo si tienen más de 5 asignaturas:
```sql
SELECT c.nombreDescriptivo, 
       (SELECT COUNT(*) 
        FROM asignatura a 
        WHERE a.curso = c.idCurso) AS numeroAsignaturas
FROM curso c
HAVING numeroAsignaturas > 5;

```
## Obtener los nombres y apellidos de los alumnos cuyo promedio de notas es mayor que el promedio de todas las notas:
```sql
SELECT al.nombre, al.apellido1, al.apellido2
FROM alumno al
WHERE (SELECT AVG(m.nota)
       FROM matricula m
       WHERE m.idAlumno = al.idAlumno) > (SELECT AVG(nota) FROM matricula);

```
## Listar los nombres de los alumnos que tienen al menos una asignatura con una nota superior a la nota media de todas las asignaturas:
```sql
SELECT nombre, apellido1, apellido2
FROM alumno
WHERE idAlumno IN (
    SELECT idAlumno
    FROM matricula
    WHERE nota > (SELECT AVG(nota) FROM matricula)
);

```
## Obtener los nombres de los cursos que tienen asignaturas con más de 10 créditos:
```sql
SELECT DISTINCT c.nombreDescriptivo
FROM curso c
JOIN asignatura a ON c.idCurso = a.curso
WHERE a.creditos > 10;

```
## Listar los nombres de las asignaturas cuyo promedio de notas es superior al promedio general de notas de todas las asignaturas:
```sql
SELECT nombre
FROM asignatura
WHERE (SELECT AVG(m.nota)
       FROM matricula m
       WHERE m.idAsignatura = asignatura.idAsignatura) > (SELECT AVG(nota) FROM matricula);

```
## Listar los nombres y apellidos de los alumnos que tienen un total de créditos mayor que el promedio de créditos de todos los alumnos:
```sql
SELECT al.nombre, al.apellido1, al.apellido2
FROM alumno al
WHERE (SELECT SUM(a.creditos)
       FROM matricula m
       JOIN asignatura a ON m.idAsignatura = a.idAsignatura
       WHERE m.idAlumno = al.idAlumno) > (SELECT AVG(totalCreditos)
                                          FROM (SELECT SUM(a.creditos) AS totalCreditos
                                                FROM matricula m
                                                JOIN asignatura a ON m.idAsignatura = a.idAsignatura
                                                GROUP BY m.idAlumno) AS sub);

```
## Obtener los nombres de los cursos con el promedio de notas más alto entre sus asignaturas:
```sql
SELECT c.nombreDescriptivo
FROM curso c
WHERE (SELECT AVG(m.nota)
       FROM matricula m
       JOIN asignatura a ON m.idAsignatura = a.idAsignatura
       WHERE a.curso = c.idCurso) > (SELECT AVG(m2.nota)
                                     FROM matricula m2
                                     JOIN asignatura a2 ON m2.idAsignatura = a2.idAsignatura);

```
## Obtener los nombres de las asignaturas con el mayor número de alumnos matriculados:
```sql
SELECT nombre
FROM asignatura
WHERE idAsignatura IN (
    SELECT idAsignatura
    FROM matricula
    GROUP BY idAsignatura
    HAVING COUNT(idAlumno) = (SELECT MAX(numAlumnos)
                              FROM (SELECT COUNT(*) AS numAlumnos
                                    FROM matricula
                                    GROUP BY idAsignatura) AS sub)
);

```

```sql

```

```sql

```

```sql

```

```sql

```

```sql

```

```sql

```


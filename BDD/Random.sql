# Crea la columna KB en la tabla fotos
ALTER TABLE `instagram_low_cost`.`fotos` 
ADD COLUMN `KB` INT NOT NULL AFTER `fechaCreacion`;


# Le da un valor aleatorio a la columna KB de la tabla fotos
UPDATE `instagram_low_cost`.`fotos`
SET KB = FLOOR(128 + RAND() * (999 - 128))
WHERE idfoto BETWEEN 1 AND 200;
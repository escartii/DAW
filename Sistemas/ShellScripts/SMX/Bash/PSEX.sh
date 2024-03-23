#!/bin/bash

#ALvaro Escarti :))

# Inicializar contadores en 0
horas=0
minutos=0
lineas=0

# Ejecutar el comando ps -ex y procesar cada línea del resultado
# (suponiendo que el tiempo de ejecución está en el cuarto campo de cada línea)
while read lines; do
     if [ $lineas -eq 1 ]; then
          tiempo_ejecucion=$(echo "$lines" | awk '{print $4}')

          # Extraer horas y minutos del tiempo de ejecución y sumarlos a los contadores
          horas_proceso=$(echo "$tiempo_ejecucion" | cut -d: -f1)
          horas=$(echo "$horas + $horas_proceso" | bc)
          minutos_proceso=$(echo "$tiempo_ejecucion" | cut -d: -f2)
          minutos=$(echo "$minutos + $minutos_proceso" | bc)

          # Si los minutos son 59 o más, sumar 1 hora al contador de horas
          if ((minutos >= 59)); then
              horas=$((horas + 1))
              minutos=$((minutos - 59))
          fi
     fi
     lineas=1
done <<< "$(ps -ex)"

echo "Tiempo total de ejecución: $horas horas y $minutos minutos"

exit 0

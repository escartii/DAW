#!/bin/bash

# Ruta a la carpeta Descargas
descargas_path="$HOME/Downloads"

# Eliminar archivos con extensión .pdf
find "$descargas_path" -name "*.pdf" -type f -delete

echo "Se han eliminado todos los archivos PDF en Descargas."

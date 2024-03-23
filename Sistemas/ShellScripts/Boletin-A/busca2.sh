#!/bin/bash

# Ask for user input
read -p "introduce el usuario: " LOGIN

# Check if the user is logged in
if who | grep -q "$LOGIN"; then
  echo "El usuario $LOGIN está conectado."
else
  echo "EL usuario $LOGIN no está conectado."
fi

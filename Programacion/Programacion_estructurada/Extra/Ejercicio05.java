package Programacion_estructurada.Extra;

import java.util.Scanner;

class Ejercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define the questions and answers
        String[][] preguntas = {
            {"¿Cuál es el lenguaje de programación que se utiliza en este curso?", "Java", "Python", "C++", "JavaScript"},
            {"¿Qué es HTML?", "Un lenguaje de marcado", "Un lenguaje de programación", "Un sistema operativo", "Un navegador web"},
            {"¿Qué es CSS?", "Un lenguaje de estilos", "Un lenguaje de programación", "Un sistema operativo", "Un navegador web"},
            {"¿Qué es JavaScript?", "Un lenguaje de programación", "Un lenguaje de marcado", "Un sistema operativo", "Un navegador web"},
            {"¿Qué es Git?", "Un sistema de control de versiones", "Un lenguaje de programación", "Un sistema operativo", "Un navegador web"},
            {"¿Qué es GitHub?", "Una plataforma de alojamiento de código", "Un lenguaje de programación", "Un sistema operativo", "Un navegador web"},
            {"¿Qué es un IDE?", "Un entorno de desarrollo integrado", "Un lenguaje de programación", "Un sistema operativo", "Un navegador web"},
            {"¿Qué es un compilador?", "Un programa que traduce código fuente a código objeto", "Un programa que ejecuta código fuente", "Un programa que depura código fuente", "Un programa que edita código fuente"},
            {"¿Qué es un depurador?", "Un programa que ayuda a encontrar errores en el código", "Un programa que ejecuta código fuente", "Un programa que traduce código fuente a código objeto", "Un programa que edita código fuente"},
            {"¿Qué es un algoritmo?", "Un conjunto de instrucciones para resolver un problema", "Un lenguaje de programación", "Un sistema operativo", "Un navegador web"}
        };

        int resultado = 0;

        // Bucle para todas las preguntas
        for (int i = 0; i < preguntas.length; i++) {
            String[] pregunta = preguntas[i];

            // Muestra la pregunta y sus posibles respuestas
            System.out.println(pregunta[0]);
            for (int j = 1; j < pregunta.length; j++) {
                System.out.println(j + ". " + pregunta[j]);
            }

            // Pregunta al usuario por la respuesta
            System.out.print("Respuesta: ");
            int respuesta = input.nextInt();

            // Comprueba si la respuesta es correcta 
            if (respuesta == 1) {
                resultado++;
            }
            System.out.println();
        }
        // Muestra el resultado obtenido
        System.out.println("Tu puntuación final es: " + resultado + "/" + preguntas.length);
    }
}



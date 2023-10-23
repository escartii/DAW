package Programacion_estructurada.Extra;

public class Ejercicio01 {

    public static void main(String[] args) {
        
        int numeroAleatorio;
        int numeroAleatorio2;
        int numeroAleatorio3;
        String resultadoCadena = "";
    
        System.out.println("Lanzamiento de dados");

        numeroAleatorio = (int) (Math.random()*3+1);
        numeroAleatorio2 = (int) (Math.random()*3+1);
        numeroAleatorio3 = (int) (Math.random()*3+1);

        String str = String.valueOf(numeroAleatorio) + "\n";
        String str2 = String.valueOf(numeroAleatorio2) + "\n";
        String str3 = String.valueOf(numeroAleatorio3) + "\n";

        resultadoCadena = str + str2 + str3;
        System.out.print(resultadoCadena);
        
        System.out.print("La suma de los dados es: ");
        System.out.print(numeroAleatorio
        +numeroAleatorio2
        +numeroAleatorio3
        );
        
    }   
}

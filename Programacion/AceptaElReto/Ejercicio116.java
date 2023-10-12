import java.util.Scanner;

public class Ejercicio116 {
     public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  // Creamos el objeto 
        int parametro = myObj.nextInt();
        int contador = 0;
        if ( parametro > 5 ) {
            //System.out.println("El parametro es mayor que 5");
        }else{
            while ( contador < parametro ){
                System.out.println("Hola Mundo");
                contador++;
            }
        }
    }
}
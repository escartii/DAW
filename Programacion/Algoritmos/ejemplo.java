import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        int num1,num2,num3;
        Scanner calcularNumeros = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        num1=myObj.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2=myObj.nextInt();
        System.out.println("Introduce el tercer numero: ");
        num3=myObj.nextInt();

        if (num1 == num2){
            if (num2 == num3){
               System.out.println("Todos los numeros son iguales");
            }else{
                System.out.println(num1 + " Es igual a: " +num2);
            }
        }else{
            if (num2 == num3){
                System.out.println(num2 + " Es igual a " +num3);
            }    
        }

        if ( num1 > num2 ){
            if ( num1 > num3 ){
                System.out.println("El numero más grande es: " +num1);
            } 
        }else{
            if ( num2 > num3){
                System.out.println("El numero más grande es: " +num2);
            }else{
                if ( num3 > num1){
                    System.out.println("El numero más grande es: " +num3);
                }
            }
        }
    }
}
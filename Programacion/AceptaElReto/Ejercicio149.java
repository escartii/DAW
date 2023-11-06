import java.util.Scanner;



    public class Ejercicio149 {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);  // Creamos el objeto
            int numToros = 0;
            int velocidad = 0;
            int toroMasRapido = 0;
            int velocidadMasRapida = 0;
            int numeroVeces;

            numeroVeces = sc.nextInt();

            for (int i = 0; i < numeroVeces; i++ ){
                System.out.println("Numero de toros: " + numToros);
                numToros = sc.nextInt();
                for (int j = 0; j < numToros; j++){
                    velocidad = sc.nextInt();
                    if ( velocidad > velocidadMasRapida ){
                        velocidadMasRapida = velocidad;
                        toroMasRapido = j;
                    }
                }

            }


            

        }
    }


public class Ejercicio5 {  
public static void main(String args[]){  


    String s1="Alvaro Escarti Lamolda ";  
    int index1=s1.indexOf(" "); // Buscamos el primer espacio 
    int index2=s1.indexOf(" ", index1 +1); // 
    String nombre = s1.substring(0,index1); // recorre desde el caracter 0 hasta index 1 que es 6
    String apellido1 = s1.substring(index1 +1,index2); // recorre desde el caracter 6 + 1, que es el espacio hasta el sigueinte espacio
    String apellido2 = s1.substring(index2 +1); // 
    System.out.println(nombre);
    System.out.println(apellido1);
    System.out.println(apellido2);


    }
}
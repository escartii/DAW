package Programacion_Dinamica;
import java.util.Stack;

public class pruebaspila {

    public static void main(String[] args) {

        Stack myStack = new Stack<>();

        System.out.println("Esta vacia la pila? " + myStack.empty());
        // pushing elements into stack
        myStack.push("Bola Naranja");
        myStack.push("Bola Violeta");
        myStack.push("Bola Verde");

        // prints elements of the stack
        System.out.println("Elementos en el Stack (Pila): " + myStack);
        System.out.println("Está vacia la pila? " + myStack.empty());
        while (!myStack.isEmpty()) {
            myStack.pop();
            System.out.println("Elementos en el Stack (Pila): " + myStack);
            System.out.println("Está vacia la pila? " + myStack.empty());
        }
    }
}

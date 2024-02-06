package lib_objetos;

public class Herencia {
    public static void main(String[] args) {
        Hijo1 hijo1 = new Hijo1();
        Hijo2 hijo2 = new Hijo2();
        
        hijo1.printMessage(); // Output: This is Child1
        hijo2.printMessage(); // Output: This is Child2
    }
}

class Padre {
    public void printMessage() {
        System.out.println("Esta es la clase Padre");
    }
}

class Hijo1 extends Padre {
    @Override
    public void printMessage() {
        super.printMessage();
        System.out.println("Esta es la clase extendida de hijo1");
    }
}

class Hijo2 extends Padre {
    @Override
    public void printMessage() {
        super.printMessage();
        System.out.println("Esta es la clase extendida de hijo2");
    }
    
}

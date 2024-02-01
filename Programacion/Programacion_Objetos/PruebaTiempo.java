import lib_objetos.Tiempo;

public class PruebaTiempo {
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(10, 59, 3);
        Tiempo t2 = new Tiempo();
        Tiempo t3 = new Tiempo();

        System.out.println("-----------------------------------");
        System.out.print("Total sumar las horas: ");
        Tiempo.sumar(t1, t2, t3);
        System.out.println("-----------------------------------");
        System.out.print("Total restar las horas: " );
        Tiempo.restar(t1, t2, t3);
        System.out.println("-----------------------------------");

    }
}

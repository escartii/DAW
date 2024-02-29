
public class Mainpieza {
    public static void main(String[] args) {

        try {

            Pieza p1 = new Pieza("cuadrado", "rojo");
            Pieza p2 = new Pieza("cuadrado", "rojo");

            @SuppressWarnings("removal")
            Double d = new Double(1.0);
            String k = "Hola";
            boolean b1 = p1.equals(p2);
            System.out.println(b1);
            boolean b2 = d.equals(k);
            System.out.println(b2);
            boolean b3 = k.equals(p2);
            System.out.println(b3);
            boolean b4 = p1.equals(d);
            System.out.println(b4);

        } catch (ClassCastException e) {
            System.out.println("No puedo comparar un double con una Pieza");
        }
    }
}

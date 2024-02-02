import lib_objetos.Tiempo;
import java.util.ArrayList;
import java.util.List;

public class PruebaTiempo {

    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(02, 59, 3);
        Tiempo t2 = new Tiempo(01, 59, 3);
        Tiempo t3 = new Tiempo();
        Tiempo t4 = new Tiempo(05, 4, 3);
        Tiempo t5 = new Tiempo(01, 4, 0);
        Tiempo t6 = new Tiempo(02, 0, 0);
        Tiempo t7 = new Tiempo(12, 0, 0);
        Tiempo t8 = new Tiempo(03, 3, 0);
        Tiempo t9 = new Tiempo(04, 0, 0);
        Tiempo t10 = new Tiempo(00, 5, 0);

        System.out.println("-----------------------------------");
        System.out.print("Total sumar las horas: ");
        Tiempo.sumar(t1, t2, t3);
        System.out.println("-----------------------------------");
        System.out.print("Total restar las horas: ");
        Tiempo.restar(t1, t2, t3);
        System.out.println("-----------------------------------");

        List<String> miLista = new ArrayList<String>();
        miLista.add(t1.toString());
        miLista.add(t2.toString());
        miLista.add(t3.toString());
        miLista.add(t4.toString());
        miLista.add(t5.toString());
        miLista.add(t6.toString());
        miLista.add(t7.toString());
        miLista.add(t8.toString());
        miLista.add(t9.toString());
        miLista.add(t10.toString());
      
        ordenarLista(miLista);
        System.out.println("Lista ordenada: ");
        for (String horas : miLista) {
            System.out.println(horas);
        }
        System.out.println("-----------------------------------");
    }

    

    public static void ordenarLista(List<String> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista.get(j).compareTo(lista.get(j + 1)) > 0) {
                    String temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }
}

        
    


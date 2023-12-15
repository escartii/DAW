import java.util.Scanner;
public class organigrama2 {

    public static String Organigrama(String[][] array, String empleado, String nivelJ) {
        String result = "  ";
        for (int i = 0; i < array.length; i++)
            if (array[i][0].equals(empleado)) {
                if (array[i][2].equals(nivelJ)) {
                    result = array[i][0];
                    result += " ";
                    result += array [i][1];
                } else {
                    result = Organigrama(array, array[i][3],nivelJ);
                }
            }
        return result;
    };

    public static String nombreEmpleado(String[][] array, String empleado, String nivelJ) {
        String nombreEmpleado = "";
        for (int i = 0; i < array.length; i++)
            if (array[i][0].equals(empleado)) {
                nombreEmpleado += array [i][1];
                nombreEmpleado += " ";
            }
        return nombreEmpleado;
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el codigo del empleado: ");
        String codEmpl = sc.nextLine();
        System.out.print("Introduce el nivel del jefe: ");
        String nivelJ = sc.nextLine();

        String[][] Organigrama = {
            {"1025", "Angel", "0", "0"},
            {"1066", "Victor", "2", "1749"},
            {"1077", "Samuel", "1", "1025"},
            {"1088", "Raul", "3", "1861"},
            {"1106", "Hugo", "3", "1517"},
            {"1125", "Oliver", "4", "1873"},
            {"1193", "Sofia", "4", "1217"},
            {"1207", "Fatima", "3", "1319"},
            {"1217", "Flora", "3", "1861"},
            {"1238", "Verena", "3", "1912"},
            {"1249", "Zigor", "3", "1298"},
            {"1258", "Helena", "3", "1912"},
            {"1283", "Diana", "2", "1425"},
            {"1296", "Lluc", "4", "1918"},
            {"1298", "Ines", "2", "1749"},
            {"1319", "Teresa", "2", "1077"},
            {"1325", "Ismael", "2", "1749"},
            {"1329", "Bruno", "3", "1066"},
            {"1394", "Jairo", "3", "1517"},
            {"1396", "Walter", "3", "1534"},
            {"1422", "Diego", "3", "1319"},
            {"1425", "Carla", "1", "1025"},
            {"1443", "Hector", "3", "1325"},
            {"1465", "Tomas", "3", "1283"},
            {"1489", "Noelia", "3", "1283"},
            {"1517", "Yago", "2", "1077"},
            {"1534", "Olga", "2", "1425"},
            {"1551", "Javier", "3", "1861"},
            {"1555", "Gisela", "3", "1517"},
            {"1564", "Karla", "3", "1298"},
            {"1577", "Tania", "4", "1564"},
            {"1591", "Nerea", "4", "1873"},
            {"1634", "Kevin", "3", "1912"},
            {"1635", "Ivan", "3", "1517"},
            {"1743", "Ainhoa", "3", "1066"},
            {"1747", "Ximena", "3", "1325"},
            {"1749", "Belen", "1", "1025"},
            {"1787", "Patricia", "4", "1465"},
            {"1817", "Pablo", "3", "1283"},
            {"1821", "Martin", "4", "1555"},
            {"1861", "Ursula", "2", "1425"},
            {"1869", "Ruben", "4", "1634"},
            {"1873", "Nicolas", "3", "1298"},
            {"1912", "Luciano", "2", "1425"},
            {"1918", "Eloy", "3", "1319"},
            {"1947", "Paula", "3", "1534"},
            {"1962", "Kaira", "4", "1918"},
            {"1973", "Quico", "4", "1465"},
            {"1986", "Carmen", "3", "1066"},
            {"1997", "Oscar", "3", "1861"}
        };
        System.out.print(nombreEmpleado(Organigrama, codEmpl, nivelJ));
        System.out.println(Organigrama(Organigrama, codEmpl, nivelJ));
    }
}

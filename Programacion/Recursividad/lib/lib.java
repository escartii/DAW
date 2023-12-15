package lib;

public class lib {
    public static String nombreEmpleado(String[][] array, String empleado, String nivelJ) {
        String nombreEmpleado = "";
        for (int i = 0; i < array.length; i++)
            if (array[i][0].equals(empleado)) {
                nombreEmpleado += array [i][1];
                nombreEmpleado += " ";
            }
        return nombreEmpleado;
    };

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
}

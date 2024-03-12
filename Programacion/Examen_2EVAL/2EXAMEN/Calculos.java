import java.util.ArrayList;

public class Calculos {
    static int m3 = 1;
    String referencia = "";
    static int ancho = 1;
    static int alto = 1;
    static int largo = 1;

    
    public static ArrayList<String> todo(String referencia, int m3) throws Exception {
        ArrayList<String> resultados = new ArrayList<String>();
        
        int unidades = (m3 * 100000000) / (ancho * alto * largo);
        int precioporm3 = (unidades / m3);
        int preciototal = unidades * precioporm3;
        
        resultados.add("Precio total: " + preciototal);
        resultados.add("Unidades necesarias: " + unidades);
        resultados.add("Precio por m3: " + precioporm3);
        
        return resultados;
        

    }


}

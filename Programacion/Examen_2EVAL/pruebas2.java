import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<String, Tablon> catalogo;

    public Inventario() {
        catalogo = new HashMap<>();
        catalogo.put("U1", new Tablon("U1", 1000, 500, 20, 100));
        catalogo.put("U2", new Tablon("U2", 1500, 750, 25, 150));
        catalogo.put("U3", new Tablon("U3", 2000, 1000, 30, 200));
    }

    public double calcularPrecioTotal(String referencia, double volumen) throws Exception {
        Tablon tablon = obtenerTablon(referencia);
        double unidadesNecesarias = calcularUnidadesNecesarias(referencia, volumen);
        return unidadesNecesarias * tablon.getPrecio();
    }

    public double calcularUnidadesNecesarias(String referencia, double volumen) throws Exception {
        Tablon tablon = obtenerTablon(referencia);
        double area = tablon.getAncho() * tablon.getAlto();
        double unidadesNecesarias = volumen / (area * tablon.getLargo());
        if (unidadesNecesarias < 1) {
            throw new Exception("No se pueden vender menos de una unidad.");
        }
        return Math.ceil(unidadesNecesarias);
    }

    public double calcularPrecioPorM3(String referencia, double volumen) throws Exception {
        Tablon tablon = obtenerTablon(referencia);
        double unidadesNecesarias = calcularUnidadesNecesarias(referencia, volumen);
        return calcularPrecioTotal(referencia, volumen) / unidadesNecesarias;
    }

    private Tablon obtenerTablon(String referencia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerTablon'");
    }
}
   
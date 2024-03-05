public class LanzarExcepciones {
    public void metodo(){
        try {
            int resultado = 10 / 0;
        } catch (Exception e) {
            ManejadorExcepciones.LanzarExcepcion(e);
        }
    }

    public class ManejadorExcepciones  {
        public static void lanzarExcepcion(Exception e) throws MiExcepcion {
            throw new MiExcepion("Error no se puede dividir por 0", e);
        }
    }

    public class MiExcepcion extends Exception {
        public MiExcepcion (String mensaje, Throwable causa) {
            super (mensaje, causa);
        }
    }
}

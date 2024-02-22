class Formulario {
    // Inicializo el contador en 1 porque es PE1 el primero
    private static int cont = 1;
    private String id = "";
    private String cliente = "";

    // Constructor de formulario con parametros id y cliente.
    public Formulario(String id, String cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }
    
    // Generamos el ID
    public static String generarId(String tipo) {
        return tipo 
        + cont++;
    }

    // Metodo que imprime los datos
    public void imprimirDatos() {
        System.out.println("ID: " + id);
        System.out.println("Cliente: " + cliente);
        
    }
}


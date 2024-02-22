class Reclamacion extends Formulario {
    private String texto;
    private boolean cerrar;

    public Reclamacion(String id, String cliente, String texto) {
        super(id, cliente);
        this.texto = texto;
        this.cerrar = false;
    }

    public String getTexto() {
        return texto;
    }

    public boolean cerrada() {
        return cerrar;
    }

    public void cerrarReclamacion() {
        cerrar = true;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Texto de la reclamación: " + texto);
        // Devuelvo con un "if" si está cerrada la reclamación o abierta
        System.out.println("Estado: " + (cerrar ? "Cerrada" : "Abierta"));
    }
}
package lib_objetos;

public class Mesa {
    // Atributos cosas que tiene el objeto
    private String color;
    private int numPatas;
    private int ancho;
    private int largo;
    private String material;

    // Constructor es darle forma al objeto
    public Mesa() {
        this.color = "Blanco";
        this.numPatas = 4;
        this.ancho = 100;
        this.largo = 100;
        this.material = "Madera";
    }
    // Constructor con parametros
    public Mesa(String a_color, int a_nPatas, int a_ancho, int a_largo, String a_material) {
        this.color = a_color;
        this.numPatas = a_nPatas;
        this.ancho = a_ancho;
        this.largo = a_largo;
        this.material = a_material;

    }

    public int area(){
        return this.ancho * this.largo;
    }

    // setters
    public void setColor(String a_color){
        // Cambiamos el color de la mesa
        this.color = a_color;
    }

    // getters
    public String getColor() {
        // Devolvemos el color
        return this.color;
    }

    public String getMaterial() {
        return this.material;
    }
}

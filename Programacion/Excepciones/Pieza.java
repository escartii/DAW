public class Pieza {
    private String nombre;
    private String color;
    
    public Pieza (){

    }
    public Pieza(String nombre, String color){
        this.nombre = nombre;
        this.color = color;
    }

    public double area(){
        return 25;
    }

    public boolean equals(Object o) {
        Pieza p = (Pieza) o;
        return this.color.equals(p.color) &&
        this.nombre.equals(p.nombre) &&
        this.area() == p.area();
    }
}

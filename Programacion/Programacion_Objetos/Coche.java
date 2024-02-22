public class Coche extends Vehiculos {
    
    public Coche(){
        /*El código que estás viendo es una definición de clase en Java. La clase se llama "Coche" y extiende la clase "Vehiculos".

        En la línea 3, se declara el constructor de la clase "Coche". Un constructor es un método especial que se llama automáticamente 
        cuando se crea un objeto de esa clase. En este caso, el constructor de "Coche" no tiene ningún parámetro, lo que significa que 
        no se requiere ninguna información adicional para crear un objeto "Coche".

        Dentro del constructor, en la línea 6, se llama al constructor de la clase padre utilizando la palabra clave "super()". 
        La palabra clave "super" se utiliza para llamar a un constructor de la clase padre. En este caso, "super()" se utiliza 
        para llamar al constructor de la clase "Vehiculos". Esto es útil cuando la clase hija necesita inicializar 
        los miembros heredados de la clase padre antes de realizar cualquier otra operación específica de la clase hija. */
        super();
    }
}

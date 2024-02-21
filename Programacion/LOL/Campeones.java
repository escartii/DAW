package LOL;

public class Campeones {
    private String campeon;

    public Campeones(String campeon) {
        this.campeon = campeon;
        if (campeon == "Vayne") {
            this.campeon = "está roto tu personaje";
        }
    }

    // Constructor que que si no elige personaje, le avise
    public Campeones() {
        if (campeon == null) {
            this.campeon = "Campeón no seleccionado";
        }

    }

    // Implemento Getters y Setters

    public String getCampeon() {
        return campeon;
    }

    public void setCampeon(String campeon) {
        this.campeon = campeon;
    }

    @Override
    public String toString() {
        return "Campeones [campeon=" + campeon + "]";
    }
    
}

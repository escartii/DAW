package LOL;
import java.util.ArrayList;

public class Pruebas {
    
    /**
     * The main method is the entry point of the program.
     * It creates an ArrayList of Campeones objects and adds some instances to it.
     * Then, it iterates over the ArrayList and prints each Campeones object.
     */
    public static void main(String[] args) {
        
        ArrayList<Campeones> champs = new ArrayList<Campeones>();
        
        champs.add(new Campeones());
        champs.add(new Campeones("Vayne"));
        champs.add(new Campeones("Garen"));
        champs.add(new Campeones("Fiora"));

        for (Campeones campeones : champs) {
            System.out.println(campeones);
        }
    }
    
}

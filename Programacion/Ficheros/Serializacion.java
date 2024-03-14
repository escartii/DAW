import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializacion {
    
    public static void main(String[] args) {
        File f = new File("amigos.txt");
        try {
            FileOutputStream fs = new FileOutputStream(f);
            // para grabar los datos
            ObjectOutputStream oos  = new ObjectOutputStream(fs);

            Amigo a = new Amigo ("Javier Puertas" , "620567133");
            oos.writeObject(a);

            Amigo b = new Amigo ("Alvaro Escarti" , "620567133");
            oos.writeObject(b);
            oos.close();
            fs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

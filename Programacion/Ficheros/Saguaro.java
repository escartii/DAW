import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Saguaro {
    public static void main(String[] args) {

        try {
            File f = new File("Consultar.TXT");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            try {
                FileOutputStream fs = new FileOutputStream("SAC.bin");
                ObjectOutputStream oos = new ObjectOutputStream(fs);

                while (linea != null) {
                    String[] palabras = linea.split(",");
                    String Object = palabras[0].replaceAll("\"", "").replaceAll("\\s", "");
                    String CON = palabras[3].replaceAll("\"", "").replaceAll("\\s", "");
                    String RA = palabras[4].replaceAll("\"", "").replaceAll("\\s", "");
                    String DEC = palabras[5].replaceAll("\"", "").replaceAll("\\s", "");
                    String MAG = palabras[6].replaceAll("\"", "").replaceAll("\\s", "");
                    if (palabras[2].equals("\"GALXY\"")) {
                        Galaxias galaxia = new Galaxias(Object,CON, RA, DEC, MAG);
                        oos.writeObject(galaxia);
                    }
                    linea = br.readLine();
                }

                oos.close();
                fs.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
                       
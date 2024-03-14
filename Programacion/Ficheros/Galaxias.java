import java.io.Serializable;

public class Galaxias implements Serializable {
    private String Object;
    private String CON;
    private String RA;
    private String DEC;
    private String MAG;

    // Constructor para el objeto
    public Galaxias(String Object, String CON, String RA, String DEC, String MAG) {
        this.Object = Object;
        this.CON = CON;
        this.RA = RA;
        this.DEC = DEC;
        this.MAG = MAG;
    }

}
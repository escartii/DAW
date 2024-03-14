import java.io.Serializable;

public class Galaxias implements Serializable {
    String Object;
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

    public String getObject() {
        return Object;
    }

    public void setObject(String object) {
        Object = object;
    }

    public String getCON() {
        return CON;
    }

    public void setCON(String cON) {
        CON = cON;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String rA) {
        RA = rA;
    }

    public String getDEC() {
        return DEC;
    }

    public void setDEC(String dEC) {
        DEC = dEC;
    }

    public String getMAG() {
        return MAG;
    }

    public void setMAG(String mAG) {
        MAG = mAG;
    }

}
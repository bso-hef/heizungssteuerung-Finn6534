public class Heizung {
    private  boolean eingeschaltet;
    private Raum raum;

    public Heizung(Raum raum) {
        this.raum = raum;
    }

    public void schalteEin() {
        eingeschaltet = true;
    }

    public void schalteAus() {
        eingeschaltet = false;
    }

    public boolean isEingeschalte() {
        return eingeschaltet;
    }
}
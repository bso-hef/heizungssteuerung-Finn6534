public class Fenster {
    private boolean offen;

    private Raum raum;

    public Fenster(Raum raum, boolean offen) {
        this.raum = raum;
        this.offen = offen;
    }

    public void oeffneFenster() {
        offen = true;
    }

    public void schliesseFenster() {
        offen = false;
    }

    public boolean isOffen() {
        return offen;
    }

    public Raum getRaum() {
        return raum;
    }
}

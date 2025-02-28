import java.util.ArrayList;
import java.util.List;

public class Temperaturmanager {

    private List<Raum> raeume = new ArrayList<>();

     public void regeleTemperatur() {
        for (Raum raum : raeume) {
            raum.regeleTemperatur();
        }
     }

    public void erstelleRaeume() {
        raeume.add(new Raum(4, 20));
    }
}
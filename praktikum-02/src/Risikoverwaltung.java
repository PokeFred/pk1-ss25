import java.util.ArrayList;
import java.util.Collection;

public class Risikoverwaltung {
    private Collection<Risiko> risiken;

    public Risikoverwaltung() {
        this.risiken = new ArrayList<>();
    }

    public void aufnehmen(Risiko risiko) {
        this.risiken.add(risiko);
    }

    public void zeigeRisiken() {
        for (Risiko element : this.risiken) element.druckeDaten();
    }

    public void sucheRisikoMitMaxRueckstellung() {
        if (this.risiken.isEmpty()) return;

        Risiko result = null;
        for (Risiko element : this.risiken) {
            if (result == null) {
                result = element;
            } else {
                if (element.ermittleRueckstellung() > result.ermittleRueckstellung()) result = element;
            }
        }

        result.druckeDaten();
    }

    public float berechneSummeRueckstellungen() {
        float result = 0;
        for (Risiko element : this.risiken) result += element.ermittleRueckstellung();

        return result;
    }
}

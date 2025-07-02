import java.time.LocalDate;

public abstract class Risiko {
    private static int id;
    private final int risikoId;
    private final String bezeichnung;
    private final float eintrittswahrscheinlichkeit;
    private final float kostenImSchadensfall;
    private final LocalDate erstellungsdatum;

    public Risiko(String bezeichnung, float eintrittswahrscheinlichkeit, float kostenImSchadensfall) {
        this.risikoId = Risiko.id;
        Risiko.id++;

        this.bezeichnung = bezeichnung;
        this.eintrittswahrscheinlichkeit = eintrittswahrscheinlichkeit;
        this.kostenImSchadensfall = kostenImSchadensfall;
        this.erstellungsdatum = LocalDate.now();
    }

    public int getId() {
        return this.risikoId;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public float getEintrittswahrscheinlichkeit() {
        return this.eintrittswahrscheinlichkeit;
    }

    public float getKostenImSchadensfall() {
        return this.kostenImSchadensfall;
    }

    public LocalDate getErstellungsdatum() {
        return this.erstellungsdatum;
    }

    public float berechneRisikowert() {
        return this.getEintrittswahrscheinlichkeit() * this.getKostenImSchadensfall();
    }

    public abstract float ermittleRueckstellung();
    public abstract void druckeDaten();
}

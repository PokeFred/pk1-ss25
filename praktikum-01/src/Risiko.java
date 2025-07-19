import java.time.LocalDate;

public abstract class Risiko {
    private static int ID = 0;
    private final int id;
    private String bezeichnung;
    private float eintrittswahrscheinlichkeit;
    private float kostenImSchadensfall;
    private final LocalDate erstellungsDatum;

    public Risiko(String bezeichnung, float eintrittswahrscheinlichkeit, float kostenImSchadensfall) {
        this.id = Risiko.ID;
        Risiko.ID++;

        this.bezeichnung = bezeichnung;
        this.eintrittswahrscheinlichkeit = eintrittswahrscheinlichkeit;
        this.kostenImSchadensfall = kostenImSchadensfall;
        this.erstellungsDatum = LocalDate.now();
    }

    public int getId() {
        return this.id;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public float getEintrittswahrscheinlichkeit() {
        return this.eintrittswahrscheinlichkeit;
    }

    public void setEintrittswahrscheinlichkeit(float eintrittswahrscheinlichkeit) {
        this.eintrittswahrscheinlichkeit = eintrittswahrscheinlichkeit;
    }

    public float getKostenImSchadensfall() {
        return this.kostenImSchadensfall;
    }

    public void setKostenImSchadensfall(float kostenImSchadensfall) {
        this.kostenImSchadensfall = kostenImSchadensfall;
    }

    public LocalDate getErstellungsDatum() {
        return this.erstellungsDatum;
    }

    public float berechneRisikowert() {
        return this.eintrittswahrscheinlichkeit * this.kostenImSchadensfall;
    }

    public abstract float ermittleRueckstellung();
    public abstract void druckeDaten();
}

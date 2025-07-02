import java.time.LocalDate;
import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Risiko risiko = (Risiko) obj;
        if (!this.getBezeichnung().equals(risiko.getBezeichnung())) return false;
        if (this.getEintrittswahrscheinlichkeit() != risiko.getEintrittswahrscheinlichkeit()) return false;
        if (this.getKostenImSchadensfall() != risiko.getKostenImSchadensfall()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(risikoId, bezeichnung, eintrittswahrscheinlichkeit, kostenImSchadensfall, erstellungsdatum);
    }

    public abstract float ermittleRueckstellung();
    public abstract void druckeDaten();
}

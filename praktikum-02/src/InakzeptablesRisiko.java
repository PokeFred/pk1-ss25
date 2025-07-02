import java.util.Objects;

public class InakzeptablesRisiko extends Risiko {
    private final String massnahme;

    public InakzeptablesRisiko(String bezeichnung, float eintrittswahrscheinlichkeit, float kostenImSchadensfall, String massnahme) {
        super(bezeichnung, eintrittswahrscheinlichkeit, kostenImSchadensfall);

        this.massnahme = massnahme;
    }

    public String getMassnahme() {
        return this.massnahme;
    }

    @Override
    public float ermittleRueckstellung() {
        return super.berechneRisikowert();
    }

    @Override
    public void druckeDaten() {
        System.out.printf("Id %d Inakzeptables Risiko \"%s\" aus %d/%d; Risikowert: %.2f€; Rückstellung: %.2f€; Massnahme: \"%s\"\n", super.getId(), super.getBezeichnung(), super.getErstellungsdatum().getMonth().getValue(), super.getErstellungsdatum().getYear(), super.getKostenImSchadensfall(), this.ermittleRueckstellung(), this.getMassnahme());
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;

        InakzeptablesRisiko risiko = (InakzeptablesRisiko) obj;
        return this.getMassnahme().equals(risiko.getMassnahme());
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(this.getMassnahme());
    }
}

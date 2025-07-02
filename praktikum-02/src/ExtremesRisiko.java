import java.util.Objects;

public class ExtremesRisiko extends InakzeptablesRisiko {
    private final float versicherungsbeitrag;

    public ExtremesRisiko(String bezeichnung, float eintrittswahrscheinlichkeit, float kostenImSchadensfall, float versicherungsbeitrag, String massnahme) {
        super(bezeichnung, eintrittswahrscheinlichkeit, kostenImSchadensfall, massnahme);
        this.versicherungsbeitrag = versicherungsbeitrag;
    }

    public float getVersicherungsbeitrag() {
        return this.versicherungsbeitrag;
    }

    @Override
    public void druckeDaten() {
        System.out.printf("Id %d Extremes Risiko \"%s\" aus %d/%d; Versicherungsbeitrag: %.2f€; Maßnahme: \"%s\"\n", super.getId(), super.getBezeichnung(), super.getErstellungsdatum().getMonth().getValue(), super.getErstellungsdatum().getYear(), this.getVersicherungsbeitrag(), super.getMassnahme());
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;

        ExtremesRisiko risiko = (ExtremesRisiko) obj;
        return this.getVersicherungsbeitrag() == risiko.getVersicherungsbeitrag();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(this.getVersicherungsbeitrag());
    }
}

public class ExtremesRisiko extends InakzeptablesRisiko {
    private float versicherungsbeitrag;

    public ExtremesRisiko(String bezeichnung, float eintrittswahrscheinlichkeit, float kostenImSchadensfall, String massnahme, float versicherungsbeitrag) {
        super(bezeichnung, eintrittswahrscheinlichkeit, kostenImSchadensfall, massnahme);
        this.versicherungsbeitrag = versicherungsbeitrag;
    }

    public float getVersicherungsbeitrag() {
        return this.versicherungsbeitrag;
    }

    public void setVersicherungsbeitrag(float versicherungsbeitrag) {
        this.versicherungsbeitrag = versicherungsbeitrag;
    }

    @Override
    public float ermittleRueckstellung() {
        return this.versicherungsbeitrag;
    }

    @Override
    public void druckeDaten() {
        System.out.printf("Id %d Extremes Risiko \"%s\" aus %d/%d; Versicherungsbeitrag %.2f; Maßnahme: \"%s\"\n", super.getId(), super.getBezeichnung(), super.getErstellungsDatum().getMonthValue(), super.getErstellungsDatum().getYear(), this.getVersicherungsbeitrag(), this.getMassnahme());
    }
}

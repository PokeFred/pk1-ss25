public class InakzeptablesRisiko extends Risiko {
    private String massnahme;

    public InakzeptablesRisiko(String bezeichnung, float eintrittswahrscheinlichkeit, float kostenImSchadensfall, String massnahme) {
        super(bezeichnung, eintrittswahrscheinlichkeit, kostenImSchadensfall);
        this.massnahme = massnahme;
    }

    public String getMassnahme() {
        return this.massnahme;
    }

    public void setMassnahme(String massnahme) {
        this.massnahme = massnahme;
    }

    @Override public float ermittleRueckstellung() {
        return super.berechneRisikowert();
    }

    @Override public void druckeDaten() {
        System.out.printf("Id %d Inakzeptables Risiko \"%s\" aus %d/%d; Risikowert %.2f; Rückstellung %.2f; Maßnahme: \"%s\"\n", super.getId(), super.getBezeichnung(), super.getErstellungsDatum().getMonthValue(), super.getErstellungsDatum().getYear(), super.berechneRisikowert(), this.ermittleRueckstellung(), this.getMassnahme());
    }
}

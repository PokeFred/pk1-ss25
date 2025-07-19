public class AkzeptablesRisiko extends Risiko {
    public AkzeptablesRisiko(String bezeichnung, float eintrittswahrscheinlichkeit, float kostenImSchadensfall) {
        super(bezeichnung, eintrittswahrscheinlichkeit, kostenImSchadensfall);
    }

    @Override
    public float ermittleRueckstellung() {
        return 0.0f;
    }

    @Override
    public void druckeDaten() {
        System.out.printf("Id %d Akzeptables Risiko \"%s\" aus %d/%d; Risikowert %.2f; Rückstellung %.2f\n", super.getId(), super.getBezeichnung(), super.getErstellungsDatum().getMonthValue(), super.getErstellungsDatum().getYear(), super.berechneRisikowert(), this.ermittleRueckstellung());
    }
}

public class Main {
    public static void main(String[] args) {
        AkzeptablesRisiko r1 = new AkzeptablesRisiko("Lizenzkosten der IDE steigt", 1, 4000);
        ExtremesRisiko r2 = new ExtremesRisiko("Hauptauftraggeber meldet Insolvenz an", 0, 0, "Versicherung abschließen",50000);
        InakzeptablesRisiko r3 = new InakzeptablesRisiko("DB Experte verl¨asst das Projekt", 1, 16000, "Ersatz bei Dienstleister reservieren");

        r1.druckeDaten();
        r2.druckeDaten();
        r3.druckeDaten();
    }
}

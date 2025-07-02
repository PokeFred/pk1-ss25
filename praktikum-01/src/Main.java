public class Main {
    public static void main(String[] args) {
        AkzeptablesRisiko risiko1 = new AkzeptablesRisiko("Lizenzkosten der IDE steigt", 1, 4000);
        ExtremesRisiko risiko2 = new ExtremesRisiko("Hauptauftraggeber meldet Insolvenz an", 0, 0, 50000, "Versicherung abschließen");
        InakzeptablesRisiko risiko3 = new InakzeptablesRisiko("DB Experte verlässt das Projekt", 1, 16000, "Ersatz bei Dienstleister reservieren");

        risiko1.druckeDaten();
        System.out.println();
        risiko2.druckeDaten();
        System.out.println();
        risiko3.druckeDaten();
        System.out.println();
    }
}

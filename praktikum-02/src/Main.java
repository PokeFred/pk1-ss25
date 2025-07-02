public class Main {
    public static void main(String[] args) {
        AkzeptablesRisiko risiko1 = new AkzeptablesRisiko("Lizenzkosten der IDE steigt", 1, 4000);
        ExtremesRisiko risiko2 = new ExtremesRisiko("Hauptauftraggeber meldet Insolvenz an", 0, 0, 50000, "Versicherung abschließen");
        InakzeptablesRisiko risiko3 = new InakzeptablesRisiko("DB Experte verlässt das Projekt", 1, 16000, "Ersatz bei Dienstleister reservieren");

        /* Aufgabe 02 */
        System.out.printf("Die Objekte mit Id %d und Id %d sind (fachlich) gleich\n", risiko1.getId(), risiko3.getId());
        System.out.printf("Die gleichen Objekte haben den Hashcode %d\n", risiko1.hashCode());
        System.out.printf("Die Objekte mit Id %d und Id %d sind nicht gleich\n", risiko1.getId(), risiko2.getId());
        System.out.printf("Die unterschiedlichen Objekte haben die Hashcodes %d und %d\n", risiko1.hashCode(), risiko2.hashCode());

        System.out.println();

        /* Aufgabe 04 */
        Risikoverwaltung verwaltung = new Risikoverwaltung();
        System.out.printf("Rückstellung am Anfang: %.2f\n", verwaltung.berechneSummeRueckstellungen());
        verwaltung.aufnehmen(risiko1);
        verwaltung.aufnehmen(risiko2);
        verwaltung.aufnehmen(risiko3);
        System.out.printf("Rückstellung am Ende: %.2f\n", verwaltung.berechneSummeRueckstellungen());
        System.out.println("Risiken:");
        verwaltung.zeigeRisiken();
        System.out.println("Risiko mit höchster Rückstellung:");
        verwaltung.sucheRisikoMitMaxRueckstellung();
    }
}

import javax.swing.*;

public class Zeitansage {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Timer timer = new Timer(() -> System.out.println(((System.currentTimeMillis() - start) / 1000) + " Sekunden seit Start"));
        timer.start();

        JOptionPane.showConfirmDialog(null, "Zeitansage stoppen", "Message", JOptionPane.DEFAULT_OPTION);
        System.exit(1);
    }
}

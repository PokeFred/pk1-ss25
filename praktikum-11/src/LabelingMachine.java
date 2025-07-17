public class LabelingMachine implements Runnable {
    private final Conveyor conveyor;

    public LabelingMachine(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Bottle bottle = this.conveyor.withdraw();
                if (bottle != null) {
                    bottle.stick("Bier", 2026);
                    bottle.printLable();
                }

                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

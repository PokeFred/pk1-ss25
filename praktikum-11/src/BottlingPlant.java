public class BottlingPlant implements Runnable {
    private final Conveyor conveyor;

    public BottlingPlant(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Bottle bottle = new Bottle();
                conveyor.load(bottle);
                System.out.println("Abfuellanlage: Neue Flasche abgefuellt");

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

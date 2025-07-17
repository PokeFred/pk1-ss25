public class Main {
    public static void main(String[] args) {
        Conveyor conveyor = new Conveyor();

        Thread plant = new Thread(new BottlingPlant(conveyor));
        Thread machine = new Thread(new LabelingMachine(conveyor));

        plant.start();
        machine.start();
    }
}

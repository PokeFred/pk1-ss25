public class Bottle {
    private Lable lable;

    public Bottle() {
        this.lable = null;
    }

    public void stick(String type, int bestBefore) {
        this.lable = new Lable(type, bestBefore);
    }

    public void printLable() {
        System.out.println("Etikettiermaschine: " + this.lable.getType() + " mindestens haltbar bis " + this.lable.getBestBefore());
    }
}

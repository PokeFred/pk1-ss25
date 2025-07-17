public class Lable {
    private final String type;
    private final int bestBefore;

    public Lable(String type, int bestBefore) {
        this.type = type;
        this.bestBefore = bestBefore;
    }

    public String getType() {
        return this.type;
    }

    public int getBestBefore() {
        return this.bestBefore;
    }
}

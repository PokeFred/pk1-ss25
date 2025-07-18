import java.util.ArrayList;
import java.util.List;

public class Conveyor {
    private final List<Bottle> bottles;

    public Conveyor() {
        this.bottles = new ArrayList<>();
    }

    public void load(Bottle bottle) {
        if (this.isOverloaded()) return;

        bottles.add(bottle);
    }

    public Bottle withdraw() {
        if (this.isEmpty()) return null;

        return bottles.removeFirst();
    }

    public boolean isEmpty() {
        return this.bottles.isEmpty();
    }

    public boolean isOverloaded() {
        return this.bottles.size() >= 50;
    }
}

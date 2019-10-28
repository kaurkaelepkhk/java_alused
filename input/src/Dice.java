import java.util.*;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll() {
        int roll = this.random.nextInt(numberOfSides);
        roll++;
        return roll;
    }
}

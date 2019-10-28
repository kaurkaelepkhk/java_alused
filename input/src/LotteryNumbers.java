import java.util.*;
public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        this.drawNumbers();
    }
    public ArrayList<Integer> numbers() {
        return this.numbers;
    }
    public void drawNumbers() {
        Random rand = new Random();
        int a = 0;
        int buffer;
        while (a < 7) {
        buffer = rand.nextInt(39) + 1;
            if(!this.containsNumber(buffer)){
                this.numbers.add(buffer);
            }
            a++;
        }
    }
    public boolean containsNumber(int number) {
        if(this.numbers.contains(number)){
            return true;
        } else {
            return false;
        }
    }
}

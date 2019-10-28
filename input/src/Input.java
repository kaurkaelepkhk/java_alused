import java.util.*;

public class Input {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers");
        int input = 0;
        while (input != -1) {
            stats.addNumber(input);
            input = reader.nextInt();
        }
        System.out.println("sum: " + stats.sum());
    }
}
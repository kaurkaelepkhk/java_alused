import java.util.*;

public class Input {
    public static void main(String[] args) {
        NumberStatistics sum = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers");
        int input = 0;
        while (input != -1) {
            input = reader.nextInt();
            if(input != -1) {
                sum.addNumber(input);
                if(input % 2 == 0) {
                    even.addNumber(input);
                } else {
                    odd.addNumber(input);
                }
            }
        }
        System.out.println("sum: " + sum.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
    }
}
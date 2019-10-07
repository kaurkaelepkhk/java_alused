import java.util.Scanner;

public class Input {
    public static double average(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        return sum / 4.0;
    }
    public static void main(String[] args) {
        double answer = average(4, 3, 6, 1);
        System.out.println("average: " + answer);
    }
}

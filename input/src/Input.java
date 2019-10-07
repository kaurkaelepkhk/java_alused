import java.util.Scanner;

public class Input {
    public static int sum(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        return sum;
    }
    public static void main(String[] args) {
        int answer = sum(4, 3, 6, 1);
        System.out.println("sum: " + answer);
    }
}

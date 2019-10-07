import java.util.Scanner;

public class Input {
    public static int least(int a, int b) {
        return Math.min(a, b);
    }
    public static void main(String[] args) {
        int answer = least(2, 7);
        System.out.println("Least: " + answer);
    }
}

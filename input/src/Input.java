import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number");
        int value = Integer.parseInt(reader.nextLine());
        int result = (int)Math.pow(2, value);
        System.out.println("The result is " + (result * 2 - 1));
    }
}

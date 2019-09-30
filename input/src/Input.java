import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number");
        int value = Integer.parseInt(reader.nextLine());
        int result = 1;
        int i = 0;
        while (i < value) {
            i++;
            result *= i;
        }
        System.out.println("The result is: " + result);
    }
}

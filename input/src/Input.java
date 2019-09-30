import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.println("Type the first number:");
        sum = sum + Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number:");
        sum = sum + Integer.parseInt(reader.nextLine());
        System.out.println("Type the third number:");
        sum = sum + Integer.parseInt(reader.nextLine());
        System.out.println("The sum is " + sum);
    }
}

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Type a number");
        Scanner reader = new Scanner(System.in);
        int firstValue = Integer.parseInt(reader.nextLine());
        System.out.println("Type a second number");
        int secondValue = Integer.parseInt(reader.nextLine());
        int sum = Math.max(firstValue, secondValue);
        System.out.println("The bigger number is: " + sum);
    }
}

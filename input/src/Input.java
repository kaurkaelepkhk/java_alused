import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int value = 0;
        int sum = 0;
        int amount = 0;
        int even = 0;
        int odd = 0;
        while (value != -1) {
            System.out.println("Type a number");
            value = Integer.parseInt(reader.nextLine());
            sum += value;
            amount++;
            if (value % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Thank you");
        System.out.println("The sum is " + (sum + 1));
        System.out.println("You typed a number " + (amount - 1) + " times");
        System.out.println("Average: " + (sum + 1) / ( amount -1 ));
        System.out.println("Amount of even numbers: " + even);
        System.out.println("Amount of odd numbers: " + odd);
    }
}

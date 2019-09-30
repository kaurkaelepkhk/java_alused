import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 50);
        System.out.println(randomNumber);
        int value = 0;
        int guesses = 0;
        while (value != randomNumber) {
            System.out.println("Guess a number");
            value = Integer.parseInt(reader.nextLine());
            if (value < randomNumber) {
                guesses++;
                System.out.println("The number is greater");
            } else if (value > randomNumber) {
                guesses++;
                System.out.println("The number is lesser");
            } else {
                System.out.println("You guessed correctly. The number was " + randomNumber);
                System.out.println("It took you " + (guesses + 1) + " guesses to get the correct number");
                break;
            }
        }
    }
}

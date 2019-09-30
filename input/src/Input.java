import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Type the points [0-60]");
        Scanner reader = new Scanner(System.in);
        int value = Integer.parseInt(reader.nextLine());
        if (value >= 0 && value <= 29) {
            System.out.println("Grade: failed");
        } else if (value >= 30 && value <= 34) {
            System.out.println("Grade: 1");
        } else if (value >= 35 && value <= 39) {
            System.out.println("Grade: 2");
        } else if (value >= 40 && value <= 44) {
            System.out.println("Grade: 3");
        } else if (value >= 45 && value <= 49) {
            System.out.println("Grade: 4");
        } else if (value >= 50 && value <= 60) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Enter a valid number within the scope");
        }
    }
}

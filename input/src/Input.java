import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Enter a year");
        Scanner reader = new Scanner(System.in);
        int value = Integer.parseInt(reader.nextLine());
        if (value % 4 == 0) {
            System.out.println("The year is a leap year");
        } else if ((value % 100) == 0 && (value % 400) == 0) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year");
        }
    }
}

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int value = 0;
        while (value != -1) {
            System.out.println("Type a number");
            value = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Thank you");
    }
}

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number?");
        int value = Integer.parseInt(reader.nextLine());
        int number = 1;
        while (number <= value) {
            System.out.println(number);
            number++;
        }
    }
}

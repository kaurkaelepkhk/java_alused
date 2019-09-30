import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First");
        int value = Integer.parseInt(reader.nextLine());
        System.out.println("Second");
        int value1 = Integer.parseInt(reader.nextLine());
        int result = 0;
        int i = value;
        while (i <= value1) {
            result += i;
            i++;
        }
        System.out.println("The result is: " + result);
    }
}

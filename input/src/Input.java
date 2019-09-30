import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First");
        int value1 = Integer.parseInt(reader.nextLine());
        System.out.println("Second");
        int value2 = Integer.parseInt(reader.nextLine());
        while (value1 <= value2) {
            if (value1 > value2) {
                break;
            }
            System.out.println(value1);
            value1++;
        }
    }
}

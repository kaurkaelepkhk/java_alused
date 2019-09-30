import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
        int value1 = Integer.parseInt(reader.nextLine());
        int result = 0;
        int i = 0;
        while (i < value1) {
            i++;
            result += i;
        }
        System.out.println("The result is: " + result);
    }
}

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name");
        String value = reader.nextLine();
        String reverse = "";
        int i;
        for (i = value.length() - 1; i >= 0; i--) {
            reverse = reverse + value.charAt(i);
        }
        System.out.println("In reverse order: " + reverse);
    }
}

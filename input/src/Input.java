import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name");
        String value = reader.nextLine();
        int i;
        for (i = 0; i < value.length(); i++) {
            System.out.println((i + 1) + ". character: " + value.charAt(i));
        }
    }
}

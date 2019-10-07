import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name");
        String value = reader.nextLine();
        System.out.println("Last character: " + value.charAt(value.length() - 1));
    }
}

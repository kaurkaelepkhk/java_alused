import java.util.Scanner;

public class Input {
    public static String reverse(String text) {
        int i;
        String reversed = "";
        for (i = text.length() - 1; i >= 0; i--) {
            reversed+=text.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String output = reader.nextLine();
        System.out.println("In reverse order: " + reverse(output));
    }
}
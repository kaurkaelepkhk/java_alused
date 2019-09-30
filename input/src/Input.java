import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner reader = new Scanner(System.in);
        int value = Integer.parseInt(reader.nextLine());
        String output = (value >= 0 && value <= 120) ? "OK" : "Impossible";
        System.out.println(output);
    }
}

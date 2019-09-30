import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Type a number");
        Scanner reader = new Scanner(System.in);
        int arv = Integer.parseInt(reader.nextLine());
        String arvCalc = (arv >= 0) ? "positive" : "negative";
        System.out.println("The number is " + arvCalc);
    }
}

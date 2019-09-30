import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Type your age");
        Scanner reader = new Scanner(System.in);
        int arv = Integer.parseInt(reader.nextLine());
        String arvCalc = (arv >= 18) ? "have" : "have not";
        System.out.println("You " + arvCalc + " reached the age of majority");
    }
}

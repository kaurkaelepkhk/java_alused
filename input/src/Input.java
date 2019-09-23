import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Type your name");
        Scanner reader = new Scanner(System.in);
        String firstName = reader.nextLine();
        System.out.println("Type your age");
        int firstAge = Integer.parseInt(reader.nextLine());
        System.out.println("Type your name");
        String secondName = reader.nextLine();
        System.out.println("Type your age");
        int secondAge = Integer.parseInt(reader.nextLine());
        int sum = firstAge + secondAge;
        System.out.println(firstName + " and " + secondName + " are " + sum + " years old in total");
    }
}

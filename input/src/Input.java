import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter your password");
            Scanner reader = new Scanner(System.in);
            String password = reader.nextLine();
            if( password.equals("carrot")) {
                System.out.println("Right");
                System.out.println("Secret is: Secret");
                break;
            } else if (!password.equals("carrot")) {
                System.out.println("Wrong");
            }
        }
    }
}

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Enter username");
        Scanner reader = new Scanner(System.in);
        String username = reader.nextLine();
        System.out.println("Enter password");
        String password = reader.nextLine();
        if( username.equals("alex") && password.equals("mightyducks")) {
            System.out.println("Hello Alex, you're now logged in");
        } else if ( username.equals("emily") && password.equals("cat")) {
            System.out.println("Hello Emily, you're now logged in");
        } else {
            System.out.println("Username or password was invalid!");
        }
    }
}

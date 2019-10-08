import java.util.*;

public class Input {
    public static void main(String[] args) {
        Account account = new Account("Kaur",100);
        account.deposit(20);
        System.out.println(account.toString());
    }
}
import java.util.*;

public class Input {
    public static void main(String[] args) {
        Account MattAccount = new Account("Matt's account",1000);
        Account MyAccount = new Account("My account",0);
        MattAccount.withdrawal(100);
        MyAccount.deposit(20);
        System.out.println(MattAccount.toString());
        System.out.println(MyAccount.toString());
    }
}
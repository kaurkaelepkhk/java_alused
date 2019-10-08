import java.util.*;

public class Input {
    public static void main(String[] args) {
        Account accountA = new Account("A",100);
        Account accountB = new Account("B",0);
        Account accountC = new Account("C",0);
        accountA.transfer(accountA, accountB, 50);
        accountB.transfer(accountB, accountC, 25);
        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);
    }
}
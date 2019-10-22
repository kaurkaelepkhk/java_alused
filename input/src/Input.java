import java.util.*;

public class Input {
    public static void main(String[] args) {
        LyyraCard card = new LyyraCard(10);
        System.out.println(card);

        card.loadMoney(15);
        System.out.println(card);

        card.loadMoney(10);
        System.out.println(card);

        card.loadMoney(200);
        System.out.println(card);
    }
}
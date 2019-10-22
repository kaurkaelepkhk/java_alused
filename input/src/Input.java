import java.util.*;

public class Input {
    public static void main(String[] args) {
        LyyraCard card = new LyyraCard(5);
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);
    }
}
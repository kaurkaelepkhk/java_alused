import java.util.*;

public class Input {
    public static void main(String[] args) {
        Menu item = new Menu();
        item.addMeal("Hamburger");
        item.addMeal("Fish'n'Chips");
        item.addMeal("Sauerkraut");
        item.addMeal("Hamburger");
        item.printMeals();
    }
}
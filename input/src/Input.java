import java.util.*;

public class Input {
    public static int greatest(ArrayList<Integer> list) {
        int biggest = list.get(0);
        for (int i : list) {
            if (i > biggest) {
                biggest = i;
            }
        }
        return biggest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }
}
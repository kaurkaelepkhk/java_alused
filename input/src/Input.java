import java.util.*;
import java.util.Scanner;

public class Input {
    public static void print(ArrayList<String> printed) {
        for (String word : printed) {
            System.out.println( word );
        }
    }
    public static int countItems(ArrayList<String> list) {
        int i = 0;
        for (String word : list) {
            i++;
        }
        return i;
    }
    public static void removeFirst(ArrayList<String> list) {
        list.remove(0);
    }
    public static void removeLast(ArrayList<String> list) {
        list.remove(countItems(list) - 1);
    }
    public static void main(String[] args) {
        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("brothers:");
        System.out.println(brothers);
// sorting brothers
        Collections.sort(brothers);

// removing the last item
        removeLast(brothers);

        System.out.println(brothers);
    }
}
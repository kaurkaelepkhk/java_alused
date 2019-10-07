import java.util.*;
import java.util.Scanner;

public class Input {
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengthList = new ArrayList<Integer>();
        int num = 0;
        for (String a : list) {
            num = a.length();
            lengthList.add(num);
        }
        return lengthList;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);
    }

}
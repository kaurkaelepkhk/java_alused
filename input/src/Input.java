import java.util.*;
import java.util.Scanner;

public class Input {
    public static double average(ArrayList<Integer> list) {
        double sum = 0;
        double divideBy = list.size();
        for (Integer a : list) {
            sum+=a;
        }
        return sum / divideBy;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }


}
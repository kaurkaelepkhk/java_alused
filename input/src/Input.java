import java.util.*;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (!words.contains("")) {
            System.out.print("Type a word: ");
            String output = reader.nextLine();
            words.add(output);
        }
        System.out.println("You typed the following words: ");
        Collections.sort(words);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
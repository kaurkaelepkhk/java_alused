import java.util.*;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String theWord = "";
        while (theWord.isEmpty()) {
            System.out.print("Type a word: ");
            String output = reader.nextLine();
            if(words.contains(output)) {
                theWord += output;
            }
            words.add(output);
        }
        System.out.println("You typed the word " + theWord + " twice");
    }
}
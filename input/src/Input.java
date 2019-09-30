import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many times");
        int value = Integer.parseInt(reader.nextLine());
        int i = 0;
        while (i < value) {
            i++;
            printText();
        }
    }
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java." + "\n");
    }
}

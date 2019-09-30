import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.println("How many times");
//        int value = Integer.parseInt(reader.nextLine());
//        printSquare(4);
//        printSquare(4);
//        printSquare(4);
//        printRectangle(17, 3);
        printTriangle(4);
    }
    public static void printStars(int amountOfStars) {
            System.out.print("*");
    }
    public static void printSquare(int amount) {
        int i = 0;
        while (i < amount) {
            i++;
            printStars(amount);
        }
        System.out.print("\r\n");
    }
    public static void printRectangle(int width, int height) {
        int i, j;
        for(i = 1; i <= height; i++)
        {
            for(j = 1; j <= width; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void printTriangle(int size) {
        int i, j;
        for (i = 0; i <= size; i = i + 1) {
            for (j = 0; j < i; j++) {
                printStars(size);
            }
            System.out.println();
        }
    }
}

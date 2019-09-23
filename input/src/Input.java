import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Type a radius");
        Scanner reader = new Scanner(System.in);
        int radius = Integer.parseInt(reader.nextLine());
        int sum = (int) (2 * Math.PI * radius);
        System.out.println("Circumference of the circle: " + sum);
    }
}

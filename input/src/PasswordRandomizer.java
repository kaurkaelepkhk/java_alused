import java.util.*;

public class PasswordRandomizer {
    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        String buffer = "";
        for(int i=0; i<this.length;i++){
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26));
            buffer += symbol;
        }

        return buffer;
    }
}

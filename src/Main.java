import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is Lessley's favorite animal?\n" +
                            "Zebra\n" +
                            "Llama\n" +
                            "Horse\n");
        Scanner input = new Scanner(System.in);

        if (input.next().toLowerCase(Locale.ROOT).equals("llama")) {
            System.out.println("Wow! You got it dude.");
        }
        else {
            System.out.println("WRONG! Better luck next time.");
        }
    }
}

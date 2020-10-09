import java.util.Scanner;

public class Opgave4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an ASCII code");
        char ch = input.next().charAt(0);

        // Print ascii with char
        System.out.println("ASCII equivalent is: " + (int)ch);
    }

}

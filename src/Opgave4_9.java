import java.util.Scanner;

public class Opgave4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Unicode");
        char ch = input.next().charAt(0);

        // Print ascii with char
        System.out.println("Unicode equivalent is: " + (int)ch);
    }

}

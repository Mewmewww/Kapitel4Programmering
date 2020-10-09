import java.util.Scanner;

public class Opgave4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of sides");
        double n = input.nextDouble();
        System.out.println("Enter the sides");
        double s = input.nextDouble();

        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/n));

        System.out.println("The area of the polygon is : " + area);
    }
}

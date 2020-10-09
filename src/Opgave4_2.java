import java.util.Scanner;

public class Opgave4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double radius = 6371.01;

        System.out.print("Enter point 1 in degrees");
        double x1 = Math.toRadians(input.nextDouble());
        double y1 = Math.toRadians(input.nextDouble());
        System.out.println("Enter point 2 in degrees");
        double x2 = Math.toRadians(input.nextDouble());;
        double y2 = Math.toRadians(input.nextDouble());;

        double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) *
                Math.cos(y1-y2));

        System.out.println("The distance between two points are : " + d + " KM");



    }
}

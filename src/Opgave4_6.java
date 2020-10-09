import java.util.Random;

public class Opgave4_6 {
    public static void main(String[] args) {
        testAngle();
    }
    public static void testAngle() {
        final int radius = 40;

        // Generating angles that are random between 0 and 2pi
        double angle_1 = (Math.random() * (2 * Math.PI));
        double angle_2 = (Math.random() * (2 * Math.PI));
        double angle_3 = (Math.random() * (2 * Math.PI));

        // x and y values
        double x1 = radius * Math.cos(angle_1);
        double y1 = radius * Math.sin(angle_1);
        double x2 = radius * Math.cos(angle_2);
        double y2 = radius * Math.sin(angle_2);
        double x3 = radius * Math.cos(angle_3);
        double y3 = radius * Math.sin(angle_3);

        // Compute three sides - editors note - use your Math.pow as well.

        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        // compute three angles

        double A = Math.toDegrees(Math.acos((a * a -  b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b -  a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c -  b * b - a * a) / (-2 * a * b)));

        // Display results
        System.out.println("The three angles are: " + Math.round(A * 100) / 100.0 + " " + Math.round(B * 100) / 100.0 + " " +
                Math.round(C * 100) / 100);
    }

}

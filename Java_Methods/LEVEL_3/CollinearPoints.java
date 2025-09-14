
import java.util.Scanner;

public class CollinearPoints {

    static boolean checkBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    static boolean checkByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        System.out.print("Enter x3 y3: ");
        double x3 = sc.nextDouble(), y3 = sc.nextDouble();

        if (checkBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Collinear (By Slope Method)"); 
        }else {
            System.out.println("Not Collinear (By Slope Method)");
        }

        if (checkByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Collinear (By Area Method)"); 
        }else {
            System.out.println("Not Collinear (By Area Method)");
        }
    }
}

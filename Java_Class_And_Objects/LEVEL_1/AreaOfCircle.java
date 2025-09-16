
public class AreaOfCircle {

    double radius;

    AreaOfCircle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("The area of the circle is : " + calculateArea());
        System.out.println("The circumference of the circle is : " + calculateCircumference());
    }

    public static void main(String[] args) {
        AreaOfCircle obj = new AreaOfCircle(10);
        obj.display();
    }
}

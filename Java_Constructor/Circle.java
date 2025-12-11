
class Circle {

    double radius;

    Circle() {
        this(1.0); // -> using chaining of constructot 
    }

    Circle(double r) {
        this.radius = r;
    }

    void show() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.show();

        Circle c2 = new Circle(5.5);
        c2.show();
    }
}

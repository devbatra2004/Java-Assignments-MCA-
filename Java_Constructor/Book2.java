
public class Book2 {

    String title;
    String author;
    double price;
    boolean available;

    Book2(String t, String a, double p, boolean av) {
        title = t;
        author = a;
        price = p;
        available = av;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed.");
        } else {
            System.out.println(title + " not available.");
        }
    }

    public static void main(String[] args) {
        Book2 b1 = new Book2("Java Basics", "dev", 450, true);

        b1.borrowBook();
        b1.borrowBook();
    }
}

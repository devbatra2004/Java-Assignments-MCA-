
public class Book {

    private static String libraryName = "new Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void displayBookDetails() {

        System.out.println("Library: " + libraryName);
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}

class LibrarySystem {

    public static void main(String[] args) {
        Book book1 = new Book("1", "Java", "dev");
        Book book2 = new Book("2", "java script", "arman");

        book1.displayBookDetails();
        book2.displayBookDetails();
        Book.displayLibraryName();
    }
}


import java.util.ArrayList;

class Book {

    private String title, author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}

class Library {

    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Books in " + name + ":");
        for (Book b : books) {
            System.out.println(" - " + b);
        }
    }
}

public class LibraryManagement {

    public static void main(String[] args) {
        Book b1 = new Book("1901", "shahrukh khan");
        Book b2 = new Book("lawrence bishnoi", "salman khan");
        Book b3 = new Book("level sabke niklenge", "hemraj singh");

        Library collageLibrary = new Library("Collage Library");
        Library schoolLibrary = new Library("School Library");
        collageLibrary.addBook(b1);
        collageLibrary.addBook(b2);

        schoolLibrary.addBook(b2);
        schoolLibrary.addBook(b3);
        collageLibrary.showBooks();
        System.out.println();
        schoolLibrary.showBooks();
    }
}

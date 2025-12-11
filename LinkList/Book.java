
class Book {

    String title;
    String author;
    String genre;
    int id;
    String status;
    Book next;
    Book prev;

    Book(String title, String author, String genre, int id, String status) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.status = status;
        this.next = null;
        this.prev = null;
    }
}

class Main {

    static Book head = null;
    static Book tail = null;

    static void addAtBeginning(String title, String author, String genre, int id, String status) {
        Book newBook = new Book(title, author, genre, id, status);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    static void addAtEnd(String title, String author, String genre, int id, String status) {
        Book newBook = new Book(title, author, genre, id, status);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    static void countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("\nTotal number of books in library: " + count);
    }

    static void displayBooks() {
        if (head == null) {
            System.out.println("No books in library!");
            return;
        }
        System.out.println("\nBooks in Library:");
        Book temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Title: " + temp.title + ", Author: " + temp.author
                    + ", Genre: " + temp.genre + ", Status: " + temp.status);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        addAtBeginning("Mahabharata", "Vyasa", "Epic", 101, "Available");
        addAtEnd("Ramayana", "Valmiki", "Epic", 102, "Issued");
        addAtPosition("Bhagavad Gita", "Krishna", "Spiritual", 103, "Available", 2);

        displayBooks();
        countBooks();
    }
}

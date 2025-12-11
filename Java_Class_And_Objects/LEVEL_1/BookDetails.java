// Program to Handle Book Details
// Problem Statement: Write a program to create a Book class with attributes title, author, and price. 
// Add a method to display the book details.

public class BookDetails {

    String title;
    String author;
    double price;

    public BookDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("the author of the book is : " + author);
        System.out.println("the title of the book is : " + title);
        System.out.println("the price of the book is : " + price);
    }

    public static void main(String[] args) {
        BookDetails obj = new BookDetails("PSCHYLOGY", "DEV", 10000);
        obj.display();
    }
}

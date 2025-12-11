
interface Reservable {

    void reserveItem(String borrowerName);

    void checkAvailability();
}

abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;
    private String borrower;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public void getItemDetails() {
        System.out.println(itemId + " - " + title + " by " + author);
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getBorrower() {
        return borrower;
    }

    abstract int getLoanDuration();

    public static void main(String[] args) {
        LibraryItem item = new Book(1, "Ramayana", "Valmiki");

        item.getItemDetails();
        System.out.println("Loan: " + item.getLoanDuration() + " days");
        ((Reservable) item).checkAvailability();
        ((Reservable) item).reserveItem("Dev");
        ((Reservable) item).checkAvailability();
    }
}

class Book extends LibraryItem implements Reservable {

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem(String borrowerName) {
        setBorrower(borrowerName);
        System.out.println("Reserved by " + borrowerName);
    }

    public void checkAvailability() {
        if (getBorrower() == null) {
            System.out.println("Available");
        } else {
            System.out.println("Borrowed by " + getBorrower());
        }
    }
}

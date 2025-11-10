
class Item {

    String name;
    int id;
    int quantity;
    double price;
    Item next;

    Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Main {

    static Item head = null;

    static void addAtBeginning(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    static void addAtEnd(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    static void addAtPosition(String name, int id, int quantity, double price, int pos) {
        Item newItem = new Item(name, id, quantity, price);
        if (pos == 1) {
            newItem.next = head;
            head = newItem;
            return;
        }

        Item temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range!");
        } else {
            newItem.next = temp.next;
            temp.next = newItem;
        }
    }

    // Display all items
    static void displayItems() {
        if (head == null) {
            System.out.println("No items in inventory!");
            return;
        }

        System.out.println("\nInventory List:");
        Item temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.id + " | Name: " + temp.name + " | Qty: " + temp.quantity + " | Price: " + temp.price);
            temp = temp.next;
        }
    }

    static void totalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("\nTotal Inventory Value: " + total);
    }

    public static void main(String[] args) {
        addAtBeginning("Pen", 101, 50, 10);
        addAtEnd("Notebook", 102, 30, 40);
        addAtEnd("Pencil", 103, 100, 5);
        addAtPosition("Marker", 104, 20, 25, 2);

        displayItems();
        totalValue();

        removeByID(102);
        displayItems();
        totalValue();
    }
}

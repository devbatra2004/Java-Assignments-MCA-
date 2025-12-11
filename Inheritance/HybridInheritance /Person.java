
class Person {

    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {
        Chef chef1 = new Chef("Ravi", 101, "Italian");
        Waiter waiter1 = new Waiter("Ankit", 201, 5);

        chef1.displayDetails();
        chef1.performDuties();

        waiter1.displayDetails();
        waiter1.performDuties();
    }
}

class Chef extends Person {

    String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    void performDuties() {
        System.out.println(name + " is cooking delicious " + specialty + " dishes.");
    }
}

class Waiter extends Person {

    int tableNumber;

    public Waiter(String name, int id, int tableNumber) {
        super(name, id);
        this.tableNumber = tableNumber;
    }

    void performDuties() {
        System.out.println(name + " is serving food at table " + tableNumber + ".");
    }
}

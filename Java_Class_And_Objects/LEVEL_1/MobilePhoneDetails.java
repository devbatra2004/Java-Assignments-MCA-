
public class MobilePhoneDetails {

    String brand;
    String model;
    double price;

    MobilePhoneDetails(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        MobilePhoneDetails phone1 = new MobilePhoneDetails("Samsung", "Galaxy S25", 80000);
        MobilePhoneDetails phone2 = new MobilePhoneDetails("Apple", "iPhone 16", 120000);

        System.out.println("Phone 1 Details:");
        phone1.displayDetails();

        System.out.println("\nPhone 2 Details:");
        phone2.displayDetails();
    }
}


class CarRental {

    String customerName;
    String carModel;
    int rentalDays;

    CarRental(String name, String model, int days) {
        customerName = name;
        carModel = model;
        rentalDays = days;
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental("Dev", "Honda City", 5);

        int costPerDay = 1000;
        int total = r1.rentalDays * costPerDay;

        System.out.println("Customer: " + r1.customerName);
        System.out.println("Car Model: " + r1.carModel);
        System.out.println("Rental Days: " + r1.rentalDays);
        System.out.println("Total Cost: ₹" + total);
    }
}


interface Insurable {

    double calculateInsurance();

    String getInsuranceDetails();
}

abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rate per day: " + rentalRate);
    }
}

class Car extends Vehicle implements Insurable {

    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Car Insurance Policy";
    }
}

class Bike extends Vehicle implements Insurable {

    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 200;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance Policy";
    }
}

class Truck extends Vehicle implements Insurable {

    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 1000;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance Policy";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("C101", 1000);
        Bike bike = new Bike("B202", 500);
        Truck truck = new Truck("T303", 2000);

        car.displayDetails();
        System.out.println("5 days Rent: " + car.calculateRentalCost(5));
        System.out.println("Insurance: " + car.calculateInsurance());
        System.out.println(car.getInsuranceDetails());
        System.out.println("-----------------");

        bike.displayDetails();
        System.out.println("5 days Rent: " + bike.calculateRentalCost(5));
        System.out.println("Insurance: " + bike.calculateInsurance());
        System.out.println(bike.getInsuranceDetails());
        System.out.println("-----------------");

        truck.displayDetails();
        System.out.println("5 days Rent: " + truck.calculateRentalCost(5));
        System.out.println("Insurance: " + truck.calculateInsurance());
        System.out.println(truck.getInsuranceDetails());
    }
}

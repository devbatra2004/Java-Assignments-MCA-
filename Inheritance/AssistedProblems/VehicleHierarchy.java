
class Vehicle {

    double vehicleno;
    double maxSpeed;
    String fuelType;

    Vehicle(double vehicleno, double maxSpeed, String fuelType) {
        this.vehicleno = vehicleno;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Vehicle No: " + vehicleno);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {

    int seatCapacity;

    Car(double vehicleno, double maxSpeed, String fuelType, int seatCapacity) {
        super(vehicleno, maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {

    double loadCapacity;

    Truck(double vehicleno, double maxSpeed, String fuelType, double loadCapacity) {
        super(vehicleno, maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {

    String type;

    Motorcycle(double vehicleno, double maxSpeed, String fuelType, String type) {
        super(vehicleno, maxSpeed, fuelType);
        this.type = type;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Motorcycle Type: " + type);
    }
}

public class VehicleHierarchy {

    public static void main(String[] args) {
        Car car = new Car(101, 180, "Petrol", 5);
        Truck truck = new Truck(202, 120, "Diesel", 10);
        Motorcycle bike = new Motorcycle(303, 220, "Petrol", "Sports");

        car.displayInfo();

        truck.displayInfo();

        bike.displayInfo();
    }
}

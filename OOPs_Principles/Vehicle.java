
abstract class Vehicle {

    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per KM: " + ratePerKm);
    }

    abstract double calculateFare(double distance);

    public double getRatePerKm() {
        return ratePerKm;
    }

    public static void main(String[] args) {
        Car car = new Car(101, "Ravi", 15);
        Bike bike = new Bike(102, "Amit", 10);
        Auto auto = new Auto(103, "Suresh", 12);

        car.getVehicleDetails();
        bike.getVehicleDetails();
        auto.getVehicleDetails();

        System.out.println("Car fare for 10 km: " + car.calculateFare(10));
        System.out.println("Bike fare for 10 km: " + bike.calculateFare(10));
        System.out.println("Auto fare for 10 km: " + auto.calculateFare(10));

        car.getCurrentLocation();
        car.updateLocation("City Center");
        bike.updateLocation("Mall");
        auto.updateLocation("Station");
    }
}

interface GPS {

    void getCurrentLocation();

    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {

    private String location;

    public Car(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        location = "Garage";
    }

    @Override
    double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public void getCurrentLocation() {
        System.out.println("Car current location: " + location);
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
        System.out.println("Car location updated to: " + location);
    }
}

class Bike extends Vehicle implements GPS {

    private String location;

    public Bike(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        location = "Garage";
    }

    @Override
    double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public void getCurrentLocation() {
        System.out.println("Bike current location: " + location);
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
        System.out.println("Bike location updated to: " + location);
    }
}

class Auto extends Vehicle implements GPS {

    private String location;

    public Auto(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        location = "Garage";
    }

    @Override
    double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public void getCurrentLocation() {
        System.out.println("Auto current location: " + location);
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
        System.out.println("Auto location updated to: " + location);
    }
}

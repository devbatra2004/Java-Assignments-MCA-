
class Vehicle {

    private static double registrationFee = 1500;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {

        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: Rs." + registrationFee);
    }
}

public class VehicleSystem {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("XYZ12345", "dev", "Car");
        Vehicle vehicle2 = new Vehicle("AB78912", "aayush", "Motorcycle");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}

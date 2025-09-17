
class Vehicle {

    String ownerName;
    String vehicleType;
    static int registrationFee = 5000;

    Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Dev", "Car");
        Vehicle v2 = new Vehicle("Aman", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(7000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

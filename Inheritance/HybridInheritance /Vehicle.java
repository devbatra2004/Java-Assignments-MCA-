
class Vehicle {

    String model;
    double maxSpeed;

    public Vehicle(String model, double maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }

    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 250, 75);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180, 40);

        ev.displayInfo();
        ev.charge();
        pv.displayInfo();
        pv.refuel();
    }
}

class ElectricVehicle extends Vehicle {

    double batteryCapacity;

    public ElectricVehicle(String model, double maxSpeed, double batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println(model + " is charging. Battery capacity: " + batteryCapacity + " kWh.");
    }
}

class PetrolVehicle extends Vehicle {

    double fuelCapacity;

    public PetrolVehicle(String model, double maxSpeed, double fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    void refuel() {
        System.out.println(model + " is refueling. Fuel capacity: " + fuelCapacity + " liters.");
    }
}

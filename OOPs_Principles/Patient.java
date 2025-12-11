
interface MedicalRecord {

    void addRecord(String record);

    void viewRecord();
}

abstract class Patient implements MedicalRecord {

    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private String record;

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
    }

    public void addRecord(String record) {
        this.record = record;
    }

    public void viewRecord() {
        System.out.println("Medical Record: " + record);
    }

    public abstract double calculateBill();

    public static void main(String[] args) {
        Patient p1 = new InPatient(101, "Rahul", 30, "Fever", 5, 2000);
        Patient p2 = new OutPatient(102, "Anita", 25, "Headache", 3, 500);

        p1.getPatientDetails();
        System.out.println("Bill: " + p1.calculateBill());
        p1.addRecord("Admitted 5 days for fever");
        p1.viewRecord();
        p2.getPatientDetails();
        System.out.println("Bill: " + p2.calculateBill());
        p2.addRecord("Visited 3 times for headache treatment");
        p2.viewRecord();
    }
}

class InPatient extends Patient {

    int days;
    double roomRate;

    public InPatient(int patientId, String name, int age, String diagnosis, int days, double roomRate) {
        super(patientId, name, age, diagnosis);
        this.days = days;
        this.roomRate = roomRate;
    }

    public double calculateBill() {
        return days * roomRate;
    }
}

class OutPatient extends Patient {

    int visits;
    double consultationFee;

    public OutPatient(int patientId, String name, int age, String diagnosis, int visits, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.visits = visits;
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return visits * consultationFee;
    }
}

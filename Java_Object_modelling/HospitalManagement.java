
import java.util.ArrayList;
import java.util.List;

class Doctor {

    private String doctorName;
    private List<Patient> patients;

    public Doctor(String doctorName) {
        this.doctorName = doctorName;
        patients = new ArrayList<>();
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void consult(Patient p) {
        System.out.println("\nDr. " + doctorName + " is consulting patient " + p.getPatientName());
        if (!patients.contains(p)) {
            patients.add(p);
        }
        p.addDoctor(this);
    }

    public void showPatients() {
        System.out.println("\nPatients consulted by Dr. " + doctorName + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.getPatientName());
        }
    }
}

class Patient {

    private String patientName;
    private List<Doctor> doctors;

    public Patient(String patientName) {
        this.patientName = patientName;
        doctors = new ArrayList<>();
    }

    public String getPatientName() {
        return patientName;
    }

    public void addDoctor(Doctor d) {
        if (!doctors.contains(d)) {
            doctors.add(d);
        }
    }

    public void showDoctors() {
        System.out.println("\nDoctors consulted by " + patientName + ":");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getDoctorName());
        }
    }
}

class Hospital {

    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void showHospitalDetails() {
        System.out.println("\nHospital: " + hospitalName);

        System.out.println("\nDoctors:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getDoctorName());
        }

        System.out.println("\nPatients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getPatientName());
        }
    }
}

public class HospitalManagement {

    public static void main(String[] args) {
        Hospital h = new Hospital("Apollo Hospital");
        Doctor d1 = new Doctor("ramesh lal");
        Doctor d2 = new Doctor("manohar lal khattar");
        Patient p1 = new Patient("nayab saini");
        Patient p2 = new Patient("vinod khanna");
        Patient p3 = new Patient("asim goyal");
        h.addDoctor(d1);
        h.addDoctor(d2);

        h.addPatient(p1);
        h.addPatient(p2);
        h.addPatient(p3);

        h.showHospitalDetails();
        d1.consult(p1);
        d1.consult(p2);

        d2.consult(p2);
        d2.consult(p3);
        d1.showPatients();
        d2.showPatients();

        p1.showDoctors();
        p2.showDoctors();
        p3.showDoctors();
    }
}

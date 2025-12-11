
import java.io.*;
import java.util.Scanner;

public class StudentData {

    public static void main(String[] args) {

        String fileName = "students.dat";
        Scanner scanner = new Scanner(System.in);

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {

            System.out.print("Enter number of students to store: ");
            int n = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.println("\nStudent " + (i + 1) + ":");
                System.out.print("Roll Number: ");
                int roll = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("GPA: ");
                double gpa = scanner.nextDouble();
                scanner.nextLine();

                dos.writeInt(roll);
                dos.writeUTF(name);
                dos.writeDouble(gpa);
            }

            System.out.println("\nStudent data successfully written to " + fileName);

        } catch (IOException e) {
            System.out.println("Error writing student data: " + e.getMessage());
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {

            System.out.println("\nRetrieving student data from file:");

            while (true) {
                try {
                    int roll = dis.readInt();
                    String name = dis.readUTF();
                    double gpa = dis.readDouble();

                    System.out.println("Roll: " + roll + ", Name: " + name + ", GPA: " + gpa);

                } catch (EOFException eof) {
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
            e.printStackTrace();
        }

        scanner.close();
    }
}

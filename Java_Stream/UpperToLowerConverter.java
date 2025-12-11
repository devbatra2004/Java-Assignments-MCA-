
import java.io.*;

public class UpperToLowerConverter {

    public static void main(String[] args) {

        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile)); BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("Conversion completed. Check the file: " + outputFile);

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + inputFile);
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

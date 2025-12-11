
import java.io.*;

public class ImageByteArray {

    public static void main(String[] args) {

        String originalImage = "original.png";
        String copiedImage = "copied.png";

        try {
            FileInputStream fis = new FileInputStream(originalImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            fis.close();

            byte[] imageBytes = baos.toByteArray();
            baos.close();

            System.out.println("Image converted to byte array. Size: " + imageBytes.length + " bytes");

            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(copiedImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println("Byte array written back to image file: " + copiedImage);

        } catch (IOException e) {
            System.out.println("Error processing image: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


import java.io.*;

public class PipedStream {

    public static void main(String[] args) {

        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            Thread writerThread = new Thread(() -> {
                String message = "Hello from Writer Thread!";
                try {
                    System.out.println("Writer: Writing message...");
                    pos.write(message.getBytes());
                    pos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            Thread readerThread = new Thread(() -> {
                try {
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    System.out.println("Reader: Waiting for data...");
                    while ((bytesRead = pis.read(buffer)) != -1) {
                        String received = new String(buffer, 0, bytesRead);
                        System.out.println("Reader: Received -> " + received);
                    }
                    pis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            writerThread.start();
            readerThread.start();

            writerThread.join();
            readerThread.join();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

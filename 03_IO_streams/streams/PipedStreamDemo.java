import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class WriterThread extends Thread {
    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    public void run() {
        try {
            String message = "Hello from the Writer Thread!";
            pos.write(message.getBytes());
            pos.close();
        } catch (IOException e) {
            System.out.println("Writer Error: " + e.getMessage());
        }
    }
}

class ReaderThread extends Thread {
    private PipedInputStream pis;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    public void run() {
        try {
            int data;
            System.out.print("Reader received: ");
            while ((data = pis.read()) != -1) {
                System.out.print((char) data);
            }
            pis.close();
        } catch (IOException e) {
            System.out.println("Reader Error: " + e.getMessage());
        }
    }
}

public class PipedStreamDemo {
    public static void main(String[] args) {
        try {
            // Create pipe streams and connect them
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            // Create and start threads
            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);

            reader.start();
            writer.start();

        } catch (IOException e) {
            System.out.println("Pipe Connection Error: " + e.getMessage());
        }
    }
}
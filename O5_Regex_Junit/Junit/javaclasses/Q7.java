package javaclasses;

public class Q7 {
    public String longRunningTask() {
        try {
            Thread.sleep(3000); // Simulates a 3-second delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return "Interrupted";
        }
        return "Task Completed";
    }
}

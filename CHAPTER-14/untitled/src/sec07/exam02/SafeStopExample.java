package sec07.exam02;

public class SafeStopExample {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        printThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        printThread.interrupt();
    }
}


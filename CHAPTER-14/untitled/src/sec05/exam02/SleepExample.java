package sec05.exam02;

public class SleepExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join();
        } catch (InterruptedException e) {

        }
        System.out.println("합 : " + sumThread.getSum());
    }
}

package sec04;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();   // 이 코드 실행한느 스레드 객체 참조 얻기
        System.out.println(mainThread.getName());     // main

        for(int i=0; i<3; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    System.out.println(getName());    // Thread-0, Thread-1, Thread-2
                }
            };
            thread.start();
        }

        Thread chatThread = new Thread() {
            @Override
            public void run() {
                System.out.println(getName());
            }
        };
        chatThread.setName("chat-thread");           // chat-thread
        chatThread.start();
    }
}

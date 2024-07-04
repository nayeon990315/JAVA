package sec07.exam02;

public class PrintThread extends Thread {
    public void run() {
        try {
            while(true) {
                System.out.println("실행 중");
                Thread.sleep(1);            // 예외 발생하도록 일시 정지 만듦
            }
        } catch (Exception e) {
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}

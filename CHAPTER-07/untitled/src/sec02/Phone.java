package sec02;

public class Phone {
    public String model;
    public String color;

    public Phone() {
    }

    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message) {
        System.out.println("본인 : " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("상대 : " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}
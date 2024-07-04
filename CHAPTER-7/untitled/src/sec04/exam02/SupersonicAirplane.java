package sec04.exam02;

public class SupersonicAirplane extends Airplane {
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;
    public int flyMode = 1;

    public SupersonicAirplane() {
    }

    public void fly() {
        if (this.flyMode == 2) {
            System.out.println("초음속 비행합니다.");
        } else {
            super.fly();
        }

    }
}

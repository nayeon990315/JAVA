package sec04.exam02;

public class SupersonicAirplanExample {
    public SupersonicAirplanExample() {
    }

    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = 2;
        sa.fly();
        sa.flyMode = 1;
        sa.fly();
        sa.land();
    }
}

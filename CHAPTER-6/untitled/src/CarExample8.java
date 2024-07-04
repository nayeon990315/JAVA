public class CarExample8 {
    public static void main(String[] args) {
        Car8 myCar = new Car8();

        myCar.setSpeed(-50);
        System.out.println("현재 속도 : " + myCar.getSpeed());

        myCar.setSpeed(50);
        System.out.println("현재 속도 : " + myCar.getSpeed());

        if(!myCar.isStop()) {
            myCar.setStop(true);
        };
        System.out.println("현재 속도 : " + myCar.getSpeed());
    }
}

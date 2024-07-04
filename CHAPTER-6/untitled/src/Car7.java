public class Car7 {
    int speed;

    void run() {
        System.out.println(speed + "로 달립니다.");
    }

    static void simulate() {
        Car7 myCar = new Car7();
        myCar.speed = 200;
        myCar.run();
    }

    public static void main(String[] args) {
        simulate();

        Car7 myCar = new Car7();
        myCar.speed = 60;
        myCar.run();
    }
}
public class CarExample5 {
    public static void main(String[] args) {
        Car5 myCar = new Car5();
        myCar.setGas(5);

        if(myCar.isLeftGas()) {
            System.out.println("출발합니다.");
            myCar.run();
        }
        System.out.println("가스를 주입하세요.");
    }
}

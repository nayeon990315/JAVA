public class CarExample4 {
    public static void main(String[] args) {
        Car4 car1 = new Car4("자가용");
        System.out.println("car1.company : " + car1.company);
        System.out.println("car2.model : " + car1.model);
        System.out.println();

        Car3 car2 = new Car3("자가용", "빨강");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println("car3.color : " + car2.color);
        System.out.println();

        Car3 car3 = new Car3("자가용", "빨강", 200);
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println("car4.maxSpeed : " + car3.maxSpeed);
    }

}

public class CalculatorExample2 {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();

        double result1 = calc.areaRectangle(10);
        double result2 = calc.areaRectangle(10, 20);

        System.out.println(result1);
        System.out.println(result2);
    }
}

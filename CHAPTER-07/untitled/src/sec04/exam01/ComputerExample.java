package sec04.exam01;

import java.io.PrintStream;

public class ComputerExample {
    public ComputerExample() {
    }

    public static void main(String[] args) {
        int r = 10;
        Calculator calculator = new Calculator();
        PrintStream var10000 = System.out;
        double var10001 = calculator.areaCircle((double)r);
        var10000.println("원 면적 : " + var10001);
        System.out.println();
        Computer computer = new Computer();
        var10000 = System.out;
        var10001 = computer.areaCircle((double)r);
        var10000.println("원 면적 : " + var10001);
    }
}

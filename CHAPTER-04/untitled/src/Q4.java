public class Q4 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 6) + 1;
        int num2 = (int) (Math.random() * 6) + 1;
        boolean state = true;

        while(state) {
            num1 = (int) (Math.random() * 6) + 1;
            num2 = (int) (Math.random() * 6) + 1;

            System.out.println("(" + num1 + ", " + num2 + ")");

            if(num1 + num2 == 5) {
                state = false;
            }
        }
    }
}

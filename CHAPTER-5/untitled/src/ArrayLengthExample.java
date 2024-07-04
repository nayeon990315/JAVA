public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] scores = { 80, 90, 100 };

        int sum = 0;
        for(int i=0; i<scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합: " + sum);
    }
}

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
        System.out.println(grade);

        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area1 = (lengthTop + lengthBottom) * height / 2.0;
        double area2 = (lengthTop + lengthBottom) * height  * 1.0 / 2;
        double area3 = (double) (lengthTop + lengthBottom) * height / 2;
        double area4 = (double) ((lengthTop + lengthBottom) * height / 2);
        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area3);
        System.out.println(area4);
    }
}

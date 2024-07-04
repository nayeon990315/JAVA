public class Q8 {
    public static void main(String[] args) {
        int[][] arr = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int total = 0;
        double avg = 0;
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            count += arr[i].length;
            for(int j=0; j<arr[i].length; j++) {
                total += arr[i][j];
            }
        }
        avg = (double) total / count;

        System.out.println("총합 : " + total);
        System.out.println("평균 : " + avg);
    }
}

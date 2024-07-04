import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int[] scores = null;

        while(choice != 5) {
            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택 > ");
            choice = Integer.parseInt(scanner.nextLine());

            if(choice == 1) {
                System.out.print("학생수 > ");
                int student = Integer.parseInt(scanner.nextLine());
                scores = new int [student];
            } else if(choice == 2) {
                for(int i=0; i<scores.length; i++) {
                    System.out.print("scores[" + i + "]" + " > ");
                    scores[i] = Integer.parseInt(scanner.nextLine());
                }
            } else if(choice == 3) {
                for(int i=0; i<scores.length; i++) {
                    System.out.println("scores[" + i + "] : " + scores[i]);
                }
            } else if(choice == 4) {
                int max = scores[0];
                int total = 0;

                for(int i=0; i<scores.length; i++) {
                    if(max < scores[i]) {
                        max = scores[i];
                    }
                    total += scores[i];
                }
                double avg = (double) total / scores.length;
                System.out.println("최고 점수 : " + max);
                System.out.println("평균 점수 : " + avg);
            } else if(choice == 5) {
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}

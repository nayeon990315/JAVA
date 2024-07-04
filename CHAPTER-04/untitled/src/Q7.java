import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String select = " ";

        while(! select.equals("4")) {
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------------");

            System.out.print("선택 > ");
            select = scanner.nextLine();

            if(select.equals("1")) {
                System.out.print("예금액 > ");
                String income = scanner.nextLine();
                sum += Integer.parseInt(income);
            } else if(select.equals("2")) {
                System.out.print("출금액 > ");
                String outcome = scanner.nextLine();
                sum -= Integer.parseInt(outcome);
            } else if(select.equals("3")) {
                System.out.print("잔고 > " + sum);
            }
            System.out.println();
        }
        System.out.println("종료");
    }
}

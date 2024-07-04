package Q20;

import java.util.Scanner;

public class BankApplication {
    public static Scanner scanner = new Scanner(System.in);
    public static Account[] accounts = new Account[100];
    public static int count = 0;

    public static void main(String[] args) {
        int choice = 0;

        while(choice != 5) {
            System.out.println("--------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택 > ");
            choice = Integer.parseInt(scanner.nextLine());

            if(choice == 1) {
                createAccount();
            } else if(choice == 2) {
                listAccount();
            } else if(choice == 3) {
                deposit();
            } else if(choice == 4) {
                withdraw();
            } else if(choice == 5) {
                System.out.println();
                break;
            }
        }
    }

    public static void createAccount() {
        System.out.println("--------------------------------------------------");
        System.out.println("계좌생성");
        System.out.println("--------------------------------------------------");

        System.out.print("계좌번호 : " );
        String accountNumber = scanner.nextLine();
        System.out.print("계좌주 : " );
        String accoountName = scanner.nextLine();
        System.out.print("초기입금액 : " );
        int price = Integer.parseInt(scanner.nextLine());

        accounts[count] = new Account(accountNumber, accoountName, price);
        count++;
        System.out.println("계좌가 생성되었습니다.");
        System.out.println();
    }

    public static void listAccount() {
        System.out.println("--------------------------------------------------");
        System.out.println("계좌목록");
        System.out.println("--------------------------------------------------");
        for(int i=0; i<count; i++) {
            System.out.print(accounts[i].getAccountNumber() + "\t");
            System.out.print(accounts[i].getAccountName() + "\t");
            System.out.println(accounts[i].getPrice());
        }
    }

    public static void deposit() {
        System.out.println("--------------------------------------------------");
        System.out.println("예금");
        System.out.println("--------------------------------------------------");

        System.out.print("계좌번호 : ");
        String accountNumber = scanner.nextLine();
        System.out.print("예금액 : ");
        int price = Integer.parseInt(scanner.nextLine());
        Account account = findAccount(accountNumber);

        if (account != null) {
            account.deposit(price);
            System.out.println("결과 : 예금이 성공되었습니다.");
            System.out.println("총액 : " + account.getPrice());
        }
    }

    public static void withdraw() {
        System.out.println("--------------------------------------------------");
        System.out.println("출금");
        System.out.println("--------------------------------------------------");

        System.out.print("계좌번호 : ");
        String accountNumber = scanner.nextLine();
        System.out.print("출금액 : ");
        int price = Integer.parseInt(scanner.nextLine());
        Account account = findAccount(accountNumber);

        if(account != null) {
            account.withdraw(price);
            System.out.println("결과 : 출금이 성공되었습니다.");
            System.out.println("총액 : " + account.getPrice());
        }
    }

    public static Account findAccount(String accountNumber) {
        for(int i=0; i<count; i++) {
            if(accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }
}

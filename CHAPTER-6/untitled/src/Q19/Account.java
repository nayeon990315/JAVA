package Q19;

public class Account {
    private int balance;
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;

    public void setBalance(int balance) {
        if(MIN_BALANCE <= balance && balance <= MAX_BALANCE) {
            this.balance = balance;
        }
    }

    int getBalance() {
        return balance;
    }

}

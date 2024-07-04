package Q20;

public class Account {
    private String accountNumber;
    private String accountName;
    private int price;

    public Account(String accountNumber, String accountName, int price) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.price = price;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            price += amount;
        }
    }

    public void withdraw(int amount) {
        if(amount > 0) {
            price -= amount;
        }
    }
}

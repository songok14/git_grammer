package C04Interface.BankService;

public class BankAccount {
    private String accountNumber;
    private Long balance = 0L;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void updateBalance(long balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Long getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
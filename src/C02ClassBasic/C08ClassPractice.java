package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C08ClassPractice {
    public static void main(String[] args) {
        /// 객체 선언 및 추가
        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account("hong1", "110-01-12345", 1234512345));
        accountList.add(new Account("hong2", "110-01-54321", 123123123));

        for(int i=0; i<accountList.size(); i++){
            System.out.println(accountList.get(i));
        }

    }
}

///  Account 클래스: 계좌주명(name - String), 계좌번호(accountNumber - String), 잔고(balance - long)
class Account {
    private String name;
    private String accountNumber;
    private long balance;

    public Account(String name, String accountNumber, long balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "계좌주: " + this.name + "\t계좌번호: " + this.accountNumber + "\t잔고: " + this.balance;
    }
}

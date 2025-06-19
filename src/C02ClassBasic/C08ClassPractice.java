package C02ClassBasic;

import java.util.*;

public class C08ClassPractice {
    public static void main(String[] args) {
        /// 객체 선언 및 추가
        List<Account> accountList = new ArrayList<>();
//        accountList.add(new Account("hong1", "110-01-12345", 1234512345));
//        accountList.add(new Account("hong2", "110-01-54321", 123123123));
        Account a1 = new Account("hong1", "110-01-12345", 100000);
        Account a2 = new Account("hong2", "110-01-54321", 200000);
        accountList.add(a1);
        accountList.add(a2);

        for (int i = 0; i < accountList.size(); i++) {
            System.out.println(accountList.get(i));
        }

        /// 계좌번호 목록 조회
        for (Account a : accountList) {
            System.out.println(a.getAccountNumber());
        }

        ///  사용자1이 사용자2에게 송금
        for (Account a : accountList) {
            if (a.getAccountNumber().equals("110-01-12345")) {
                a.setBalance(a.getBalance() - 50000);
            }
            if (a.getAccountNumber().equals("110-01-54321")) {
                a.setBalance(a.getBalance() + 50000);
            }
        }

        ///  계좌 상세조회: 계좌번호와 잔고조회
        for (Account a : accountList){
            System.out.println("계좌번호: "+a.getAccountNumber()+" 잔고: "+a.getBalance());
        }

        /// 계좌 개설
        Map<String, Account> accountMap = new HashMap<>();
        accountMap.put("12345", new Account("hong1", "12345", 100000));
        accountMap.put("54321", new Account("hong2", "54321", 100000));

        /// 송금
        Account a = accountMap.get("12345");
        Account b = accountMap.get("54321");
        a.setBalance(a.getBalance()-50000);
        b.setBalance(b.getBalance()+50000);

        /// 계좌조회
        for (String ac : accountMap.keySet()){
            System.out.println(accountMap.get(ac).getAccountNumber());
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

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "계좌주: " + this.name + "\t계좌번호: " + this.accountNumber + "\t잔고: " + this.balance;
    }
}

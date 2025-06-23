package C04Interface.BankService;

public class BankServiceOriginal {
    void deposit(long money, BankAccount ba) {
        // 현재 얼마있는지 조회
        // 그 금액과 money 합산하여 updateBalance
        ba.updateBalance(ba.getBalance() + money);
    }

    boolean withdraw(long money, BankAccount ba) {
        // 현재 얼마있는지 조회 && 출금 금액과 비교
        // 그 금액과 money 차감 m하여 updateBalance
        if (ba.getBalance() >= money) {
            ba.updateBalance(ba.getBalance() - money);
            return true;
        } else {
            return false;
        }
    }
}

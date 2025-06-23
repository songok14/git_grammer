package C04Interface.BankService;

public class BankTossService implements BankService{
    @Override
    public void deposit(long money, BankAccount ba) {
        System.out.println("토스 서비스입니다.");
        ba.updateBalance(ba.getBalance() + money);
    }

    @Override
    public boolean withdraw(long money, BankAccount ba) {
        System.out.println("토스 서비스입니다.");
        if (ba.getBalance()>=money){
            return true;
        } else {
            return false;
        }
    }
}

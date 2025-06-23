package C04Interface.BankService;

public class BankKakaoService implements BankService {
    @Override
    public void deposit(long money, BankAccount ba) {
        System.out.println("카카오 서비스입니다.");
        ba.updateBalance(ba.getBalance() + money);
    }

    @Override
    public boolean withdraw(long money, BankAccount ba) {
        System.out.println("카카오 서비스입니다.");
        if (ba.getBalance()>=money){
            return true;
        } else {
            return false;
        }
    }
}

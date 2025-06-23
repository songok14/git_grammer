package C04Interface.BankService;

import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {
        System.out.println("계좌 번호를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        BankAccount ba = new BankAccount(accountNumber);
        BankService bs;

        while (true) {
            System.out.println("입금하시려면 1번, 출금하시려면 2번");
            String serviceNumber = sc.nextLine();
            if ("1".equals(serviceNumber)) {
                System.out.println("입금방식을 선택해주세요. 1.카카오페이 2.토스페이");
                String accountWay = sc.nextLine();
                if (accountWay.equals("1")) {
                    bs = new BankKakaoService();
                } else if (accountWay.equals("2")) {
                    bs = new BankTossService();
                } else {
                    continue;
                }

                System.out.println("입금하실 금액을 입력해주세요.");
                long money = Long.parseLong(sc.nextLine());
                bs.deposit(money, ba);
                System.out.println("입금이 완료되었습니다.");
            } else {
                System.out.println("출금방식을 선택해주세요. 1.카카오페이 2.토스페이");
                String accountWay = sc.nextLine();
                if (accountWay.equals("1")) {
                    bs = new BankKakaoService();
                } else if (accountWay.equals("2")) {
                    bs = new BankTossService();
                } else {
                    continue;
                }

                System.out.println("출금하실 금액을 입력해주세요.");
                long money = Long.parseLong(sc.nextLine());
                if (bs.withdraw(money, ba)) {
                    System.out.println("출금이 정상 처리되었습니다.");
                } else {
                    System.out.println("잔액이 부족합니다.");
                }
            }
        }
    }
}
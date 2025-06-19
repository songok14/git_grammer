///        추가: 6.총 계좌의 수 - auto_increment를 통해 현재까지 만들어진 계좌의 수 출력
///               id.equals("admin") && pass.equals("7276")
package C02ClassBasic;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

///        주의사항1 : main메서드에서 입출력 처리를 하고, deposit(입금), withdraw(출급), transfer(송금) 메서드는 BankAccount클래스에 생성.
///        주의사항2 : 프로그램은 항상 실행될수 있도록 전체코드를 while(true)처리
///        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
///        1.계좌개설 : 계좌번호와 현재가지고 계신돈을 입력하세요. -> 자동으로 id값 증가되어 세팅
///        2.계좌조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력
///        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요. -> 현재 계좌에 얼마가 있습니다. 출력.
///        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.(잔액검증) -> 남은 금액은 얼마입니다. 또는 잔액이 부족합니다. 출력.
///        5.송금 : 송금서비스입니다. 본인의 계좌번호를 입력해주세요. 보내고자 하는 상대방의 계좌번호를 입력해주세요. 송금금액을 입력해주세요.(잔액검증)

public class C09BankService {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, BankAccount> accountMap = new HashMap<>();
        boolean flag = true;
        /// 입출력
        while (flag) {
            System.out.print("서비스번호를 입력하세요.(q.종료) 1.개설 2.조회 3.입금 4.출금 5.송금 6.전체계좌조회\t");
            String input = br.readLine();

            switch (input) {
                case "1" -> {
                    System.out.print("이름: ");
                    String name = br.readLine();
                    System.out.print("계좌번호: ");
                    String account = br.readLine();
                    if (accountMap.containsKey(account)) {
                        System.out.println("이미 사용중인 계좌번호입니다.");
                        break;
                    }
                    accountMap.put(account, new BankAccount(name, account));
                    break;
                }
                case "2" -> {
                    System.out.print("조회할 계좌번호: ");
                    String targetAccount = br.readLine();
                    BankAccount targetObject = accountMap.get(targetAccount);   // 2번 이상 객체를 찾아야 하기 때문에 변수로 선언
                    if (!accountMap.containsKey(targetAccount)) {
                        System.out.println("입력하신 계좌의 정보가 없습니다.");
                        break;
                    } else {
                        System.out.println(targetObject.getAccountNumber() + " 계좌의 잔고: " + targetObject.getBalance());
                    }
                    break;
                }
                case "3" -> {
                    System.out.print("입금할 계좌번호: ");
                    String targetAccount = br.readLine();
                    if (!accountMap.containsKey(targetAccount)) {
                        System.out.println("입력하신 계좌의 정보가 없습니다.");
                        break;
                    } else {
                        System.out.print("입금하실 금액: ");
                        long money = Long.parseLong(br.readLine());
//                        System.out.println(accountMap.get(targetAccount).deposit(targetAccount, money));
                    }
                    break;
                }
                case "4" -> {
                    System.out.print("출금할 계좌번호: ");
                    String targetAccount = br.readLine();
                    if (!accountMap.containsKey(targetAccount)) {
                        System.out.println("입력하신 계좌의 정보가 없습니다.");
                        break;
                    } else {
                        System.out.print("출금하실 금액: ");
                        long money = Long.parseLong(br.readLine());
                        System.out.println(accountMap.get(targetAccount).withdraw(money));
                    }
                    break;
                }
                case "5" -> {
                    System.out.print("보낼 계좌번호: ");
                    String myAccountNumber = br.readLine();
                    BankAccount myAccount = accountMap.get(myAccountNumber);
                    if (!accountMap.containsKey(myAccountNumber)) {
                        System.out.println("입력하신 계좌의 정보가 없습니다.");
                        break;
                    }

                    System.out.print("받을 계좌번호: ");
                    String targetAccountNumber = br.readLine();
                    if (!accountMap.containsKey(targetAccountNumber)) {
                        System.out.println("입력하신 계좌의 정보가 없습니다.");
                        break;
                    } else {
                        System.out.print("보내실 금액: ");
                        long money = Long.parseLong(br.readLine());
                        boolean result = myAccount.transfer(accountMap.get(targetAccountNumber), money);
                        if (result) {
                            System.out.println("남은금액은 " + myAccount.getBalance() + "원 입니다.");
                        } else {
                            System.out.println("잔액이 부족합니다.");
                        }
                    }
                    break;
                }

                case "6" -> {
                    System.out.print("관리자 ID 입력: ");
                    String id = br.readLine();
                    System.out.print("관리자 비밀번호 입력: ");
                    String pass = br.readLine();
                    if (id.equals("admin") && pass.equals("7276")) {
                        System.out.println("현재까지 개설된 계좌의 수: " + BankAccount.getAuto_increment());
                    } else {
                        System.out.println("ID 또는 비밀번호를 잘 못 입력하였습니다.");
                    }
                }

                case "q" -> {
                    flag = false;
                }
                default -> {
                    System.out.println("다시 입력해 주세요.");
                    break;
                }
            }
        }
    }
}

class BankAccount {
    /// 계좌개설 및 입출금 서비스 : id(auto_increment), name(String), accountNumber(String), balance(long).
    private static int auto_increment;
    private int id;
    private String name;
    private String accountNumber;
    private long balance;

    // 생성자
    public BankAccount(String name, String accountNumber) {
        this.id = auto_increment++;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // getter 생성
    public static int getAuto_increment() { // 현재 생성된 계좌의 수
        return auto_increment;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public long getBalance() {
        return this.balance;
    }

    // setter 생성 -> 의도를 명확히 한 메서드 생성(updateOOO)
    public void updateBalance(long balance) {
        this.balance = balance;
    }

    // 입금
    public void deposit(long money) {
        this.balance += money;
    }

    // 출금
    public String withdraw(long money) {
        String answer = "";
        if (this.balance >= money) {
            this.updateBalance(this.balance - money);
        } else {
            answer += this.accountNumber + " 계좌의 잔액이 부족합니다.\n";
        }
        return answer + this.accountNumber + " 계좌의 잔고: " + this.balance;
    }

    // 송금
    public boolean transfer(BankAccount targetAccount, long money) {
        // deposit, wirhdraw 등 중복되는 코드를 줄이는 방안 필요
        if (this.balance >= money) {
            this.balance -= money;
            targetAccount.balance += money;
            return true;
        } else {
            return false;
        }
    }

}

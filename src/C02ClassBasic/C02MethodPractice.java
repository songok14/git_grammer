package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C02MethodPractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        if (isPrime(input)) {
            System.out.println("입력하신 숫자는 소수입니다.");
        } else {
            System.out.println("입력하신 숫자는 소수가 아닙니다.");
        }
    }

    public static boolean isPrime(int input) {
        for (int i = 2; i < Math.sqrt(input); i++) {
            if (input % i == 0) {
                System.out.println("최소 약수: " + i);
//                메서드에서 return을 만나면 현재 가지고 있는 값을 반환하면서 메서드가 종료된다.
                return false;
            }
        }
        return true;
    }
}

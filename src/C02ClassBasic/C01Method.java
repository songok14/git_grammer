package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C01Method {
    //    main 메소드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        for 문을 이용해 1~10 까지 total값 가산 후 출력
//        int total = 0;
//        for (int i = 0; i <= 10; i++) {
//            total += i;
//        }
//        System.out.println(total);
//
//        int total2 = 0;
//        for (int i = 10; i <= 20; i++) {
//            total2 += i;
//        }
//        System.out.println(total2);
//
//        위 코드의 중복이 지속적으로 발생하므로 반복을 피하기 위해 기능을 모듈화 하여 별도로 분리 -> Method(메소드)
//        모듈화: 하나의 틀로 분리하는 작업
//        클래스 메서드 기본 호출 방식: 클래스명.메서드명();
//        같은 클래그셍서 정의된 클랙스 메서드의 호출은 클래스명 생략 가능
        System.out.println(sumAcc(10, 20));

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        int total = sumAcc(start, end);
        System.out.println(total);
    }

    //    접근 제어자(public),클래스 메서드(static O), 객체 메서드(static X), 반환타입(int, String, boolean 등), 매개변수(input 값)
    public static int sumAcc(int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += i;
        }
        return total;
    }
}

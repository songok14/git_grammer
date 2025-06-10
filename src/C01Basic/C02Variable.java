package C01Basic;

import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
////        정수: byte(1 byte), int(4 byte), long(8 byte)
//        byte a = 127;   // -128 ~ 127
//        byte b = -128;
////        오버플로우: 자료형이 표현할 수 있는 범위를 초과
//        a++;
//        System.out.println("a: " + a);
//
////        언더플로우: 자료형이 표현할 수 있는 범위 미만
//        b--;
//        System.out.println("b: " + b);
//
//        int i1 = 10;
//        long l1 = 10;
//
////        long은 명시적으로 L을 붙여 long 타입을 명시하기도 함.
//        long l2 = 20L;
//
////        실수: float, double -> 실수 연산은 오차를 발생시킴
//        float f1 = 1.123f;
//        double d1 = 1.123;
//
////        부동소수점 오차 테스트
//        double d2 = 0.1;
//        System.out.println(d2);
//
//        double total = 0;
//        for (int i = 0; i < 1000; i++) {
//            total = total + 0.1;
//        }
//        System.out.println(total);
//
////        소수점 연산 오차 해결방법: 정수로 변환 후 연산하여 추후 나눗셈으로 해결
//        double total2 = 0;
//        for (int i = 0; i < 1000; i++) {
//            total2 = total2 + 0.1 * 10;
//        }
//        System.out.println(total2 / 10);
//
////        소수점 오차 해결 방법: Bigdecimal 클래스 사용
//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d2 - d1);
//
//        BigDecimal b1 = new BigDecimal("1.03"); // 값을 입력 받을 때부터 소수점으로 받게되면
//        BigDecimal b2 = new BigDecimal("0.42"); // 이미 오차가 발생하므로 문자로 입력
//        double d3 = b1.subtract(b2).doubleValue();
//        System.out.println(d3);
//
////        문자형: char
//        char c1 = '가';
//        String str1 = "가나";
//        System.out.println(c1);
//
////        boolean: true or false
//        boolean b1 = true;
//        System.out.println(b1);
//
//        if (b1) {
//            System.out.println("참입니다.");
//        } else {
//            System.out.println("거짓입니다.");
//        }
//
////        null도 하나의 타입
////        참조형 자료에 값을 할당하지 않으면 null이 할당
//        String st1 = "";
//        String st2 = null;
////        System.out.println(st2.isEmpty()); // null을 대상으로 string의 메서드 사용 불가 -> 에러 발생
//
//        String[] arr = new String[5];
//        arr[1] = "hello1";
//        arr[3] = "hello3";
//        for(int i=0; i<5; i++){
//            System.out.println(arr[i].length());
//        }

////        타입변환
////        묵시적 타입변환, 명시적 타입변환
//        char c1 = 'a';
//        int i1 = c1;
//        System.out.println(i1);
////        문자 비교를 위한 묵시적 타입변환
//        System.out.println('a' > 'b');
//
////        알파벳 소문자 제거
//        String st1 = "01abcd123한글123";
//        String answer = "";
//        for (int i = 0; i < st1.length(); i++) {
//            char c = st1.charAt(i);
//            if (c < 'a' || c > 'z') {
//                answer += c;
//            }
//        }
//        System.out.println(answer);
//
//        int i1 = 10;
//        double d1 = i1;
//        System.out.println(d1);
//
////        double -> INT
//         double d2 =  10.5;
//         int i2 = (int) d2;
//        System.out.println(i2);
//
////        정수/소수의 경우 소수점 절사 문제 발생
////        두 수가 모두 정수이면 결과값이 정수일 것이다라고 java가 판단하여 소수점 이하 절삭
//        int a = 1;
//        int b = 4;
//        System.out.println(a/b);
//
//        System.out.println((double)a/b);
//
////        변수와 상수
//        int a1 = 10;
//        a1 = 20;
//
//        // 변수값 재선언은 불가능
//        int a1 = 30;    // 불가능
//
////        상수는 초기값을 할당한 이후에 재할당하는 것이 불가능, 재선언도 불가능
////        상수는 final 키워드 사용
//        final double PI = 3.14;
//        PI = 3.0;    // 불가능
    }
}

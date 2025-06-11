package C01Basic;

import java.util.Scanner;

public class C04IfStatment {
    public static void main(String[] args) {
////        도어락키 예제
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//
//        if (sc.nextInt() == answer) {
//            System.out.println("문이 열렸습니다.");
//        } else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }
//
//        if, else if, else 중 택 1로서 위에서부터 아래로 비교하며 한 조건에 해당하면 실행 후 구문 밖으로 빠져나감
//        /* 교통카드 예제
//        * 현재 가지고 있는 돈은 얼마인지 물어봐서 입력값을 받는다.
//        * 10000원 이상이면 택시를 타시오
//        * 10000미만 3000이상이면 버스를타시오
//        * 그렇지 않으면 걸어가시오 */
//
//        Scanner sc = new Scanner(System.in);
//        int answer = Integer.parseInt(sc.nextLine());
//
//        if (answer >= 10000) {
//            System.out.println("택시를 타시오");
//        } else if (answer >= 3000) {
//            System.out.println("버스를 타시오");
//        } else {
//            System.out.println("걸어가시오");
//        }
//
////        if 문이 독립적으로 존재할 경우 정확한 범위 지정을 하지 않으면 모든 if문이 중복되어 실행될 가능성 존재
//        Scanner sc = new Scanner(System.in);
//        int answer = Integer.parseInt(sc.nextLine());
//
//        if (answer >= 10000) {
//            System.out.println("택시를 타시오");
//        }
//        if (answer < 10000 && answer >= 3000) {
//            System.out.println("버스를 타시오");
//        } else if (answer < 3000) {
//            System.out.println("걸어가시오");
//        }
//
////        삼항 연산자 : 결과값 = 조건식? 반환값1 : 반환값2;
////        조건식이 참인경우 반환값1이 결과값에 담기고, 거짓인 경우 반환값2가 결과값에 담김
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = Integer.parseInt(sc.nextLine());
//        String result = (answer == input) ? "문이 열렸습니다." : "비밀번호가 틀렸습니다.";
//        System.out.println(result);
//
////        switch 문: if, else if, else 등 여러 조건식이 있을 때 조건문을 가독성있게 표현한 구문
//        /* 예제) 원하시는 서비스 번호를 입력해 주세요
//         * 1. 대출업무
//         * 2. 예금업무
//         * 3. 적금업무
//         * 0. 상담사 연결
//         * 그 외 : 잘못된 입력 */
//        Scanner sc = new Scanner(System.in);
//        System.out.print("원하시는 서비스 번호를 입력해 주세요. ");
//        int input = Integer.parseInt(sc.nextLine());
//        switch (input) {
//            case 1:
//                System.out.println("대출 업무");
//                break;
//            case 2:
//                System.out.println("예금 업무");
//                break;
//            case 3:
//                System.out.println("적금 업무");
//                break;
//            default:
//                System.out.println("잘못된 입력");
//                break;
//        }
//
////        위 스위치와 동일한 출력의 if문
//        Scanner sc = new Scanner(System.in);
//        System.out.print("원하시는 서비스 번호를 입력해 주세요. ");
//        int input = Integer.parseInt(sc.nextLine());
//        if (input == 1) {
//            System.out.println("대출 업무");
//        } else if (input == 2) {
//            System.out.println("예금 업무");
//        } else if (input == 3) {
//            System.out.println("적금 업무");
//        } else {
//            System.out.println("잘못된 입력");
//        }


    }
}

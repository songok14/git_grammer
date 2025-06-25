package C07ExceptionFileParsing;

import java.sql.SQLException;
import java.util.Scanner;

public class C01Exception {
    public static void main(String[] args) {
////        일반적인 예외처리 방식: 예외 발생 시 프로그램이 중지되지 않도록 구현
//        Scanner sc = new Scanner(System.in);
//        System.out.println("나눗셈 프로그램입니다.");
//
////        예외처리: 예외가 발생할 것으로 예상되는 코드를 try로 감싼다.
//        try {
//            System.out.println("분자를 입력해주세요.");
//            int head = Integer.parseInt(sc.nextLine());
//            System.out.println("분모를 입력해주세요.");
//            int tail = Integer.parseInt(sc.nextLine());
//            int result = head / tail;       // 여기서 예외 발생 시 try 내부의 하단의 코드는 실행되지 않음
//            System.out.println("두 수를 나눈 값은: " + result);
//
////            catch를 통해 예상되는 예외클래스를 분기처리한다.
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
////            아래와 같은 방식으로 시스템 로그를 기록
////            java.lang.ArithmeticException: / by zero at C07ExceptionFileParsing.Exception.main(Exception.java:17)
//            System.out.println("0으로 나눌 수 없습니다.");
//        } catch (NumberFormatException e) {
////            오류 내용 간략히 설명
//            System.out.println(e.getMessage());     // For input string: "ㅁㅁ"
//            System.out.println("숫자를 입력해 주세요.");
//        } catch (Exception e) {
////            Exception은 모든 에러의 조상
//            System.out.println("예상치 못한 에러가 발생했습니다.");
//
//        } finally {
////            예외가 발생하던 안하던 실행되는 구문
//            System.out.println("무조건 실행되는 구문입니다.");
//        }
//        System.out.println("hello world");

//        의도된 예외 강제 발생: 특정 시점에 프로그램 강제 중지
        System.out.println("로그인을 위한 비밀번호를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
//        login(input);
//        checktd exception의 경우 예외처리를 위임받게 되면, 반드시 예외처리를 하거나 다시 throw해야 함.
        try {
            login2(input);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("환영합니다.");


    }

    //    throws 키워드를 통해 예외를 위임
//    다만, Unchecked 예외에서는 예외처리가 강제가 아니므로 throws가 큰 의미 없음
//    그러나 Checked 예외에서는 예외처리가 강제 되므로 throws가 의미 있음.
    static boolean login(String password) throws IllegalArgumentException {
        if (password.equals("1234")) {
            return true;
        } else {
//            예외를 강제 발생 시킴으로서 이 시점에서 해당 메서드 강제 종료
//            예외는 기본적으로 해당 메서드를 호출한 쪽으로 전파
            throw new IllegalArgumentException("비밀번호를 잘 못 입력하였습니다.");
        }
    }

    static boolean login2(String password) throws SQLException {
        if (password.equals("1234")) {
            return true;
        } else {
            return false;
//          checked exception은 예외처리가 강제
//          해당 메서드 내에서 예외처리를 하든, 명시적으로 throws를 통해 호출 메서드쪽에 위임
        }
    }
}

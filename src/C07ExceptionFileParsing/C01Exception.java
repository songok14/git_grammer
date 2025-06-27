package C07ExceptionFileParsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidParameterException;
import java.sql.SQLException;
import java.util.NoSuchElementException;
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
//        } finally {
////            예외가 발생하던 안하던 실행되는 구문
//            System.out.println("무조건 실행되는 구문입니다.");
//        }
//        System.out.println("hello world");
//
////        의도된 예외 강제 발생: 특정 시점에 프로그램 강제 중지
//        System.out.println("로그인을 위한 비밀번호를 입력해주세요.");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        login(input);
////        checktd exception의 경우
//        방법 1. 호출 받는 쪽에서 반드시 예외처리 후 unchecked exception 예외 발생, 호출하는 쪽에서 예외처리 하여 사용자에게 적절한 메세지 전달
//        방법 2. throws를 통해서 checked 예외처리를 위임하게 되면 호출하는 쪽에서 예외처리

//        String result = null;
//        try {
//            result = fileRead("src/C07ExceptionFileParsing/test.txt");
//        } catch (IOException e) {
//            throw new RuntimeException("입출력 과정에서 예외가 발생 했습니다.");
//        }
//        System.out.println(result);

//        가장 많이 사용하는 방법 - 컨트롤러와 서비스 클래스 모두 예외처리
//        컨트롤러: 사용자의 입출력 - 사용자에게 알려주기 위해 예외처리
//        서비스: 주요 로직 - 프로그램을 중지시키기 위해 예외처리
        String result = "";
        try {
            result = fileRead("src/C07ExceptionFileParsing/test.txt");
        } catch (RuntimeException e){
            System.out.println(e.getMessage());     // 사용자에게 설명
            e.printStackTrace();                    // 시스템로그에 기록
        }
        System.out.println(result);
//        try {
//            login2(input);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("환영합니다.");
    }

//    //    throws 키워드를 통해 예외를 위임
////    다만, Unchecked 예외에서는 예외처리가 강제가 아니므로 throws가 큰 의미 없음
////    그러나 Checked 예외에서는 예외처리가 강제 되므로 throws가 의미 있음.
//    static boolean login(String password) throws IllegalArgumentException, NoSuchElementException {
//        if (password.equals("1234")) {
//            return true;
//        } else if (password == null) {
////            예외를 강제 발생 시킴으로서 이 시점에서 해당 메서드 강제 종료
////            예외는 기본적으로 해당 메서드를 호출한 쪽으로 전파
//            throw new IllegalArgumentException("비밀번호를 잘 못 입력하였습니다.");
//        } else {
//            throw new NoSuchElementException("예상치 못한 예외가 발생했습니다.");
//        }
//    }
//
//    static boolean login2(String password) throws SQLException {
//        if (password.equals("1234")) {
//            return true;
//        } else {
//            return false;

    /// /          checked exception은 예외처리가 강제
    /// /          해당 메서드 내에서 예외처리를 하든, 명시적으로 throws를 통해 호출 메서드쪽에 위임
//        }
//    }
//    static String fileRead(String path) throws IOException {
    static String fileRead(String path) throws RuntimeException {   // 장식
        Path filePath = Paths.get(path);
//        checked Exception의 경우 예외처리가 강제
////        방법 1. checked를 try catch 한 후 unchecked 예외를 다시 throw (권장)
        String text = null;
        try {
            text = Files.readString(filePath);
        } catch (IOException e) {
//            System.out.println("입출력 과정에서 예외가 발생했습니다.");
//            보통은 코드중지 목적으로 unchecked exception으로 다시 throw
            throw new RuntimeException("입출력 과정에서 예외가 발생했습니다.");
        }

////        방법 2. 현재 메서드를 호출하는 쪽으로 예외를 위임(throws)
//        String text = Files.readString(filePath);
        return text;
    }
}



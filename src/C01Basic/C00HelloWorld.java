package C01Basic;

// 클래스의 명명 규칙
// 1) 반드시 public class 명과 파일명이 일치해야한다.
// 2) 일반적으로 대문자 알파벳으로 시작한다.

public class C00HelloWorld {
//     메서드, 변수 명은 일반적으로 소문자 알파벳으로 시작한다.
//     어디에서든 접근 가능하고, 리턴값이 없는 메서드
//     main 메서드는 프로그램 실행 시 가장 먼저 실행되는 메서드
//     다른 메서드를 호출하는 용도로 사용하기 때문에 void로 사용
    public static void main(String[] args) {
//         sout 단축어를 통해 자동완성
//         java의 모든 명령문은 세미콜론을 통해 끝맺음
        System.out.println("hello world!");
        /* 추천
        여러줄의
        주석처리가
        가능하다.
         */
    }   // 중괄호를 통해 표현 범위를 설정한다.
}
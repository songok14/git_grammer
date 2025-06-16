package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
////        원시 자료형은 스택 메모리에 저장되므로 비교시 값 자체를 비교한다.
//        int a = 10;
//        int b = 10;
//        System.out.println(a == b);
//
////        참조 자료형의 비교는 기본적으로 메모리주소를 비교한다.
//        String str1 = new String("hello");
//        String str2 = new String("hello");
//        System.out.println(str1 == str2);       // false
//        System.out.println(str1.equals(str2));  // true
//
////        WrapperClass: 기본형 타입을 Wrapping한 클래스
//        int i1 = 10;
////        Integer ig1 = new Integer(10);
////        오토박싱으로 원시 자료형 -> Wrapper 클래스로 자동 형변환
//        Integer ig1 = 10;
////        오토언박싱: Wrapper 클래스 -> 원시자료형으로 자동 형변환
//
////        Wrapper 클래스의 기능
//        int i3 = 10;
//        String st3 = Integer.toString(i3);
//        String st4 = String.valueOf(i3);
//        int i4 = Integer.parseInt(st3);
//
////        배열에는 원시타입 자료형 세팅 가능
//        int[] arr = {10, 20, 30};
//
////        그 외(리스트, set, map) 등에는 참조자료형을 세팅해야함
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);
//
////        String 선언 방법 2가지
////        1. 객체 선언 방식
//        String st1 = new String("hello world");
//        String st2 = new String("hello world");
//
////        2. 리터럴 방식 : java에서 추천하는 방식
//        String st3 = "hello world";
//        String st4 = "hello world";
//
//        System.out.println(st1 == st2);     // false
//        System.out.println(st3 == st4);     // true
//
////        참조자료형의 비교는 == 지양
////        System.out.println(st1.equals(st2));
//
////        문자열 비교
//        String st1 = "hello";
//        String st2 = "dello";
//        String st3 = "hello";
//        System.out.println(st1.compareTo(st2));     // 양수
//        System.out.println(st2.compareTo(st1));     // 음수
//        System.out.println(st1.compareTo(st3));     // 0
//
////        equals: 문자열 비교
//        String st1 = "hello world";
//        String st2 = "hello world";
//        String st3 = "Hello world";
//        System.out.println(st1.equals(st2));    // true
//        System.out.println(st1.equals(st3));    // false
//
//        length: 문자열의 길이
//        String st1 = "Hello World Java";
//        System.out.println(st1.length());
//
////        charAt(n): 특정 index의 문자(char)값을 리턴
//        char ch1 = st1.charAt(0);
//
////        위 문자열의 소문자 알파벳의 개수 구하기
//        int count = 0;
//        for (int i = 0; i < st1.length(); i++) {
//            char c = st1.charAt(i);
//            if (c >= 'a' && c <= 'z') {
//                count++;
//            }
//        }
//        System.out.println(count);
//
//        String st2 = "abcdefgabaaaa";
//        int count = 0;
//        for (int i = 0; i < st2.length(); i++) {
//            if (st2.charAt(i) == 'a') {
//                count++;
//            }
//        }
//        System.out.println(count);
//
////        toCharArray: String 문자열을 char 배열로 리턴
//        char[] chArr = st2.toCharArray();
//        int count2 = 0;
//        for (char c : st2.toCharArray()) {
//            if (c == 'a') count2++;  // 실행문이 한 줄밖에 없을경우 중괄호 생략 가능
//        }
//
////        indexOf(문자열): 특정 문자열의 위치(index) 반환, 가장 먼저나오는 문자열의 위치 반환
//        String st1 = "Hello java java";
//        System.out.println(st1.indexOf("java"));
//
////        contains: 특정 문자열이 포함되어있는지 여부(boolean)를 return
//        System.out.println(st1.contains("Hello"));  // true
//        System.out.println(st1.contains("hello"));  // false
//
////        문자열 더하기: +=
//        String st1 = "hello";
//        st1 += " world";
//        st1 += '1';     // String에 char를 더하면 String으로 더해짐
//        System.out.println(st1);
//
////        substring(a, b): a이상 b미만의 index 문자를 잘라 문자열 반환
//        String st1 = "hello world";
//        System.out.println(st1.substring(0, 5));
//        System.out.println(st1.substring(6, st1.length()));
//
////        trim, strip: 문자열 양쪽 끝의 공백 제거
//        String st1 = " hello world ";
//        String trim1 = st1.trim();
//        String strip = st1.strip();
//        System.out.println(trim1);
//        System.out.println(strip);
//
////        toUpperCase: 모든 문자열을 대문자로 변환, toLowerCase: 모든 문자열을 소문자로 변환
//        String s1 = "Hello";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s3);
//
////        replace(a, b): a문자열을 b문자열로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);
//
////        replaceAll(a, b): replace와 사용법 동일, 정규표현식을 쓸 수 있는 것이 차이점
//        String st1 = "가나다ABCabc123";
////        소문자 알파벳 제거
//        String answer = st1.replaceAll("[가-힣]", "");
//        System.out.println(answer);
//        String answer2 = st1.replaceAll("[a-z]", "");
//        System.out.println(answer2);
//        String answer3 = st1.replaceAll("[A-Za-z]", "");
//        System.out.println(answer3);
//
////        전화번호 검증
//        String number = "010-1234-1234";
//        boolean check = number.matches("^\\d{3}-\\d{4}-\\d{4}$");
//        if(check == false){
//            System.out.println("다시 입력하세요.");
//        }
//
////        이메일 검증
//        String email = "abc123@naver.com";
//        boolean check_eamil = Pattern.matches("^[a-z0-9]+@+[a-z]+.com$", email);
//        System.out.println(check_eamil);
//
////        split: 특정 문자를 기준으로 잘러서 문자 배열로 만드는 것
//        String a = "a:b:c:d";
//        String[] arr = a.split(":");
//        System.out.println(Arrays.toString(arr));
//        String b = "a b c  d";
//        String[] arr2 = b.split(" ");
//        String[] arr3 = b.split("\\s+");
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
//
////        null과 공백의 차이
//        String st1 = null;
//        String st2 = "";    // 공백은 문자열
//        String st3 = " ";   // 띄어쓰기
//        System.out.println(st1 == st2);   // false
////        System.out.println(st1.isEmpty());  // NullPointerException 발생
//        System.out.println(st2.isEmpty());  // true
//        System.out.println(st3.isEmpty());  // false
//        System.out.println(st3.isBlank());  // true
//
//        String abc = "hello    world   java";
//        String answer = "";
//        for (int i = 0; i < abc.length(); i++) {
//            if (abc.substring(i, i + 1).isBlank()) {
//                System.out.println(i + " 번째는 blank");
//            } else {
//                answer += abc.substring(i, i + 1);
//            }
//        }
//        System.out.println(answer);
//
////        문자열 합치기
//        String[] arr = {"java", "python", "javascript"};
//        String answer1 = "";
//
//        for(String a : arr){
//            answer1 += a;
//            answer1 += " ";
//        }
//        System.out.println(answer1.trim());
//        String answer2 = String.join("\n", arr);
//        System.out.println(answer2);
//
////        StringBuffer : 문자열 조립 객체
//        StringBuffer sb = new StringBuffer();
////        apprnd는 맨 뒤에 문자열을 더하는 메소드
//        StringBuffer는 동시성 이슈 X / Thread - safe 함
//        sb.append("java");
//        sb.append("\n");
//        sb.append("python");
//        sb.append("\n");
//        sb.append("javascribpt");
//        String answer = sb.toString();
//        System.out.println(answer);
//
//        String[] arr = {"java", "python", "javascript"};
//        StringBuffer sb2 = new StringBuffer();
//        for (int i = 0; i < arr.length; i++) {
//            sb2.append(arr[i]);
//            sb2.append("\n");
//        }
//
//        sb2.insert(0, "C++\n");
//        sb.deleteCharAt(sb.length() - 1);
//        System.out.println(sb2.toString());
//
////        StringBuilder : 문자열 조립 객체(가장 빠름), StringBuffer와 메소드 사용법 거의 동일
////        StringBuilder는 동시성 이슈 O -> 성능 ↑/ Thread - safe하지 않음
//        String st1 = "hello";
//        StringBuilder sb = new StringBuilder();
//
////        문자열 뒤집기
//        String st1 = "abcd";
//        StringBuilder sb = new StringBuilder();
//        for (int i = st1.length() - 1; i >= 0; i--) {
//            sb.append(st1.charAt(i));
//        }
//        System.out.println(sb.toString());
    }
}

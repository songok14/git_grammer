package C02ClassBasic;

import java.util.*;

public class C03Class {
    public static void main(String[] args) {
//        System.out.println(MyCalculator.sum(10, 20));
//
////        A부서의 매출
////        20원
//        System.out.println(MyCalculator.sumAcc(20));
////        30원
//        System.out.println(MyCalculator.sumAcc(30));
////        40원
//        System.out.println(MyCalculator.sumAcc(40));
////        누적합: 90원
//
////        B 부서의 매출
////        10원 매출
//        System.out.println(MyCalculator.sumAcc(10));    // 100원, 원하는 값: 10원
////        20원 매출
//        System.out.println(MyCalculator.sumAcc(20));    // 120원, 원하는 값: 20원

//        객체를 활용한 매출 계산
//        A 부서 매출: 10원, 20원
        System.out.println("생성된 객체의 수: " + MyCalculatorInstance.totalCount);
        MyCalculatorInstance mi1 = new MyCalculatorInstance();
        System.out.println("생성된 객체의 수: " + MyCalculatorInstance.totalCount);
//        MyCalculatorInstance.sumAcc(); static이 없으므로 sumAcc는 호출이 불가 -> 객체로 만들어서 호출해야 함.
//        System.out.println(mi1.sumAcc(10));
//        System.out.println(mi1.sumAcc(20));
        mi1.sumAcc(10);
        mi1.sumAcc(20);
        System.out.println(mi1.total);

//        B 부서 매출: 20원, 30원
        MyCalculatorInstance mi2 = new MyCalculatorInstance();
        System.out.println("생성된 객체의 수: " + MyCalculatorInstance.totalCount);
//        System.out.println(mi2.sumAcc(20));
//        System.out.println(mi2.sumAcc(30));
        mi2.sumAcc(20);
        mi2.sumAcc(30);
        System.out.println(mi2.total);

//        자료구조에서 객체 사용 예시
//        배열
        String[] arr1 = {"hello", "java", "python"};
        Arrays.sort(arr1);                  // 클래스 메서드
        System.out.println(arr1.length);    // 객체(인스턴스) 메서드


//        리스트
        List<String> list = new ArrayList<>();
        Collections.sort(list);                 // 클래스 메서드
        list.sort(Comparator.naturalOrder());   // 객체 메서드

    }
}

class MyCalculator {
    //    static이 붙어있으면 클래스 변수, static이 붙어있지 않으면 객체 변수
    static int total = 0;

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sumAcc(int a) {
        total += a;
        return total;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}

// static 제거, 클래스 변수 -> 객체 변수
// heap 메모리에 저장 -> 객체마다 total의 값이 달라짐, 고유의 메모리를 가지고 있음
class MyCalculatorInstance {
    int total = 0;

    //    클래스 변수는 모든 인스턴스(객체) 간 상태 공유 목적으로 주로 사용
    static int totalCount = 0;

    //    클래스를 만들면 아래와 같은 클래스 명의 이름을 가진 메서드(생성자)가 기본으로 만들어짐
//    생성자의 주된 목적은 객체 변수를 초기화하기 위한 목적으로 주로 사용
    public MyCalculatorInstance() {
        totalCount++;
    }


    //    클래스 메서드는 객체의 상태와 상관없는 독립적인 로직 수행시에 사용 가능
    public static int sum(int a, int b) {
        return a + b;
    }

    public void sumAcc(int total) {
//        this는 객체 그 자신을 의미한다.
//        일반적으로 매개변수와 객체변수를 구분짓기 위해 사용
//        ex) 매개변수명도 total, 객체변수명도 total일 경우
        this.total += total;
//        total += total;   // 매개변수 total에 누적시키기 때문에 원하는 값을 얻을 수 없음
//        return total;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}



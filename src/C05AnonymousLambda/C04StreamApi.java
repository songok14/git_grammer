package C05AnonymousLambda;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C04StreamApi {
    public static void main(String[] args) {
//        int[] arr = {20, 10, 4, 12};
        /// 전통적인 방식의 데이터 접근방법: 메모리 주소 접근
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        /// 함수형 프로그래밍 방식: 데이터와 객체 중심이 아닌, 입력에 따른 출력만 존재
        /// streamApi: java에서 함수형 프로그래밍을 지원하는 라이브러리
        /// 원본에 접근하는 것이 아닌 복제값을 만들어 출력
        /// 원본의 값을 변경하지 않기 때문에 데이터 안정성↑ / 통계치를 보여줄 때 적절
        /// foreach는 스트림의 각 요소를 하나씩 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a -> System.out.println(a));

        /// 스트림의 생성: .stream()
//        List<String> myList = new ArrayList<>();
//        myList.add("HTML");
//        myList.add("CSS");
//        myList.add("JavaScript");
//        Stream<String> stream1 = myList.stream();
//        String[] myArr = new String[3];
//        myArr[0] = "HTML";
//        myArr[1] = "CSS";
//        myArr[2] = "JavaScript";
//        Stream<String> stream2 = Arrays.stream(myArr);

        /// 원시자료형을 위한 stream 객체가 별도로 존재
//        int[] intArr = {10,20,30,40,50};
//        IntStream IntStream3 = Arrays.stream(intArr);

        /// stream의 중개연산(변환): filter, map, sorted, distinct
//        int[] intArr = {10, 10, 30, 40, 50};
//
        /// filter: 특정 기준으로 대상을 필터링하여 새로운 스트림을 반환하는 중개연산 메서드
        /// sum: 스트림의 요소를 하나씩 소모하여 총합을 구하는 메서드
        /// 30보다 작은 값들의 총합
//        int total = Arrays.stream(intArr).filter(a -> a <= 30).sum();
//        System.out.println(total);

        /// map: 기존의 스트림을 조작하여 새로운 스트림을 반환
//        int[] intArr2 = {10, 20, 30, 30, 40};
//        int total2 = Arrays.stream(intArr2).map(a -> 10).sum();
//        int[] newIntArr = Arrays.stream(intArr2).map(a -> 10).toArray();
//        System.out.println(Arrays.toString(newIntArr));

        /// distinct: 중복제거
//        int[] intArr3 = {10, 10, 30, 40, 50};
//        int total3 = Arrays.stream(intArr3).distinct().sum();
//
        /// sorted: 정렬
//        int[] intArr4 = {10, 10, 30, 40, 50};
//        int[] newArr4 = Arrays.stream(intArr4).sorted().toArray();
//        System.out.println(Arrays.toString(newArr4));
//
        /// mapToInt: intstream 형태로 변환해주는 map
//        String[] stArr5 = {"HTML", "CSS", "JAVA", "PYTHON"};
//        int total5 = Arrays.stream(stArr5).mapToInt(a -> a.length()).sum();
//        System.out.println(total5);


        /// 연습문제
//        int[] arr = {5, 2, 1, 4, 3, 6};
////        arr에서 홀수만 담은 배열 생성 후 출력
//        Arrays.stream(arr).filter(a -> a % 2 == 1).forEach(a -> System.out.print(a + " "));
//        System.out.println();
////        arr에서 홀수만 걸러서 해당 홀수의 제곱값을 담은 배열을 생성 후 출력
//        Arrays.stream(arr).filter(a -> a % 2 == 1).map(a -> a * a).forEach(a -> System.out.print(a + " "));
//        System.out.println();
////        arr에서 홀수만 거르고 제곱값을 구하고 해당 숫자값을 오름차순 한 순서로 배열을 생성 후 출력
//        Arrays.stream(arr).filter(a -> a % 2 == 1).map(a -> a * a).sorted().forEach(a -> System.out.print(a + " "));

        /// 스트림의 소모: foreach(출력), sum(합계), reduce(누적연산), min, max, count 등
//        int[] intArr = {10, 20, 30, 40};
//        Arrays.stream(intArr).forEach(a -> System.out.println(a));
//        int total = Arrays.stream(intArr).sum();

        /// optional 객체: 값이 있을 수도 있고 없을 수도 있음을 명시한 객체
//        int max = Arrays.stream(intArr).max().getAsInt();
//        int min = Arrays.stream(intArr).min().getAsInt();
//        int count = (int) Arrays.stream(intArr).count();

        /// reduce: 누적연산 -> reduce(초기값, 연산식)
//        int accSum = Arrays.stream(intArr).reduce(0, (a, b) -> a + b);
//        System.out.println(accSum);
//        int accMul = Arrays.stream(intArr).reduce(1, (a, b) -> a * b);
//        System.out.println(accMul);

//        String[] strArr = {"hello", "java", "world"};
//        String result = Arrays.stream(strArr).reduce("", (a, b) -> a + b + " ");
//        System.out.println(result);
//
//        /// findFirst: 첫번째 요소 반환
//        String firstSt = Arrays.stream(strArr).filter(a -> a.length() >= 5).findFirst().get();
//        System.out.println(firstSt);
//
//        /// 주의사항: 제네릭의 타입소거
//        /// 런타임 시점에 <String> 과 같은 제네릭의 타입소거 발생
//        /// 제네릭의 타입소거로 인해 toArray를 통해 바로 새로운 String 배열을 만드는 것은 불가
//        String[] stArr = {"hello", "java", "world"};
////        String[] answer = Arrays.stream(stArr).filter(a -> a.length() >= 5).toArray(a -> new String[a]);
////        System.out.println(Arrays.toString(answer));
//
//        /// 메소드 참조: 하나의 메소드만들 호출하는 경우에 매개변수를 제거한 형식
//        /// 클래스명 :: 메서드명
////        Arrays.stream(stArr).forEach(System.out::println);
//        String[] answer = Arrays.stream(stArr).filter(a -> a.length() >= 5).toArray(String[]::new);
//        Arrays.stream(answer).forEach(System.out::println);
//
////        StreamApi 라이브러리
////        Stream<String>
//
////        StreamApi 실습
////        List에 Student 객체 4개 담기 : {"Kim", 20}, {"choi", 32}, {"lee", 35}, {"park", 22}
//        List<Studendt> myList = new ArrayList<>();
//        myList.add(new Studendt("kim", 20));
//        myList.add(new Studendt("choi", 32));
//        myList.add(new Studendt("lee", 35));
//        myList.add(new Studendt("park", 22));
//
////        1. 모든 객체의 평균나이
//        double avg = myList.stream().mapToInt(a -> a.getAge()).average().getAsDouble();
//        System.out.println(avg);
//
////        2. 정렬을 통한 가장 나이 어린 사람 찾기
//        Studendt s = myList.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).findFirst().get();
//        System.out.println(s);
//
////        3. 30대인 사람들의 이름만 모아서 새로운 String 배열에 담기
//        String[] strArr = myList.stream().filter(a -> a.getAge() >= 30 && a.getAge() < 40).map(a -> a.getName()).toArray(String[]::new);
//        System.out.println(Arrays.toString(strArr));
//
////        Optional 객체: 특정객체에 값이 없을지도 모른다는 것을 명시적으로 표현한 객체(null)
//        String st1 = null;
//        if (st1 != null) {
//            System.out.println(st1.compareTo("hello"));
//        } else {
//            System.out.println("값이 없습니다.");
//        }
//
//        Optional<String> opt1 = Optional.ofNullable("hello");
//        if (opt1.isPresent()) {
//            System.out.println(opt1.get().compareTo("hello"));
//        } else {
//            System.out.println("값이 없습니다.");
//        }
//
////        Optional 객체 생성 방법 3가지
//        Optional<String> opt1 = Optional.empty();                         // 비어있는 Optional 객체 생성
//        Optional<String> opt2 = Optional.ofNullable(null);          // 비어있는 Optional 객체 생성
//        Optional<String> opt2_1 = Optional.ofNullable("hello");     // 값이 있는 Optional 객체 생성
//        Optional<String> opt3 = Optional.of("hello");               // 값이 있는 Optional 객체 생성
//
//////        Otional 객체 처리 방법 4가지
//////        1. isPresent()로 확인 후 get()
////        if (opt2_1.isPresent()){
////            System.out.println(opt2_1.get());
////        } else{
//////            System.out.println(opt2_1); // 에러 발생
////            System.out.println("값이 없습니다.");
////        }
//
////        2. orElse(): 값이 있으면 return 없으면 지정값 return
//        System.out.println(opt2.orElse("값이 없습니다."));
//        System.out.println(opt2_1.orElse("값이 없습니다."));
//
////        3. orElseGst(): 값이 있으면 있는 값 return, 없으면 람다함수 실행
//        System.out.println(opt2.orElseGet(() -> new String("값이 없습니다.")));
//        System.out.println(opt2_1.orElseGet(() -> new String("값이 없습니다.")));
//
////        4. orElseThrow: 값이 있으면 있는 값 return, 없으면 지정된 예외 강제 발생(가장 많이 사용)
////        개발에서 사용자에게 적절한 메시지 전달 목적과 의도된 코드중단을 목표로 갈제로 예외를 발생시키는 경우는 매우 많음.
////        의도치 않은 값 저장, 코드 실행 등을 막기위해 그 전에 에러를 발생시켜 실행되지 않도록 작성
//        System.out.println(opt2_1.orElseThrow(() -> new RuntimeException("값이 없습니다."))); // 의도한 에러 발생
//        System.out.println(opt2.get());   // 의도치 않은 에러 발생
//
////        Optional 객체 예시 1
        List<Studendt> studendtList = new ArrayList<>();
//        OptionalDouble age = studendtList.stream().mapToInt(a -> a.getAge()).average();
//        if (age.isPresent()){
//            System.out.println(age.getAsDouble());
//        } else {
//            throw new NoSuchElementException("값이 없습니다.");
//        }
//
////        Optional 객체 예시 2
//        System.out.println(studendtList.stream().mapToInt(a -> a.getAge()).average().orElseThrow(() -> new NoSuchElementException("값이 없습니다.")));

        studendtList.add(new Studendt("kim", 20));
        studendtList.add(new Studendt("choi", 32));
        studendtList.add(new Studendt("lee", 35));
        studendtList.add(new Studendt("park", 22));
        System.out.println("조회하고자 하는 학생의 인덱스 번호를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
//        int indexNumber = Integer.parseInt(sc.nextLine());

////        범위 안에 있으면 ofNullable
        OptionalInt indexNumber = OptionalInt.of(Integer.parseInt(sc.nextLine()));
        Optional<Studendt> optStudent;
        if (studendtList.size() <= indexNumber.getAsInt()) {
            optStudent = Optional.ofNullable(null);
        } else {
            optStudent = Optional.of(studendtList.get(indexNumber.getAsInt()));
        }
//        System.out.println(studendtList.get(indexNumber.orElseThrow(() -> new IndexOutOfBoundsException("범위 초과"))));
        System.out.println(optStudent.orElseThrow(() -> new IndexOutOfBoundsException("범위 초과")));


    }
}

package C05AnonymousLambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        /// 주의사항: 제네릭의 타입소거
        /// 런타임 시점에 <String> 과 같은 제네릭의 타입소거 발생
        /// 제네릭의 타입소거로 인해 toArray를 통해 바로 새로운 String 배열을 만드는 것은 불가
        String[] stArr = {"hello", "java", "world"};
        String[] answer = Arrays.stream(stArr).filter(a -> a.length() >= 5).toArray(a -> new String[a]);
        System.out.println(Arrays.toString(answer));

    }
}

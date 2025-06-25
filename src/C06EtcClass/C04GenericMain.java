package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "python", "C"};
        stChange(stArr, 0, 1);
        System.out.println(Arrays.toString(stArr));

        Integer[] intArr = {10, 20, 30};
        intChange(intArr, 0, 1);
        System.out.println(Arrays.toString(intArr));

        allChange(stArr, 1, 2);
        System.out.println(Arrays.toString(stArr));
        allChange(intArr, 1, 2);
        System.out.println(Arrays.toString(intArr));

//        일반 객체 생성 시
        Person p1 = new Person("hong1");
        GenericPerson<String> p2 = new GenericPerson<>("hong");
        GenericPerson<Integer> p3 = new GenericPerson<>(10);



//        제네릭의 사용 예시
//        1. 객체 사용 시
        List<String> myList = new ArrayList<>();

    }


    //    제네릭 메서드는 반환 타입 왼쪽에 <T>라고 선언
//    이때 T에는 참조형 변수인 객체타입만을 허용
    static <T> void allChange(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void stChange(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void intChange(Integer[] arr, int i, int j) {
        Integer temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// 제네릭 클래스는 클래스명 옆에 <T> 선언
class GenericPerson<T> {
    private T value;

    public GenericPerson(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Person {
    private String value;

    public Person(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

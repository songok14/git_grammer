package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C11RecursiveBasic {
    public static void main(String[] args) {
        int target = 3;
        recur0(0, target);
        recur0(0, target);
        recur2(new ArrayList<>(), 0, target);

    }

    public static void recur0(int count, int target) {
        if (count == target) {
            return;
        }
        System.out.println("재귀 호출 전 count: " + count);  // 0(첫번째) -> 1(두번쨰) -> 2(세번째)
        recur0(count + 1, target);
        System.out.println("재귀 호출 후 count: " + count);  // 2(여섯번째) -> 1(다섯번째) -> 0(네번쨰)
    }

    // 아래 함수 출력 순서
    // 전 0 -> 전 1 -> 전 2 -> 후 3 -> 후 2 -> 후 1
    public static void recur1(int count, int target) {
        if (count == target) {
            return;
        }
        System.out.println("재귀 호출 전 count: " + count);  // 0(첫번째) -> 1(두번쨰) -> 2(세번째)
        count = count + 1;
        recur0(count, target);
        System.out.println("재귀 호출 후 count: " + count);  // 2(여섯번째) -> 1(다섯번째) -> 0(네번쨰)
    }

    // 객체를 매개변수로 활용한 재귀함수: 객체는 힙메모리를 통해 원본 객체가 변경될 수 있으므로, 재귀함수 간 값이 일치되는 현상이 나타남
    public static void recur2(List<Integer> myList, int num, int target) {
        if (myList.size() == target) {
            return;
        }
        myList.add(num);
        recur2(myList, num + 1, target);
        System.out.println(myList);
    }
}

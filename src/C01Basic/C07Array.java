package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
////        배열표현식
////        1. 배열 선언 후 할당 방식
////        배열은 반드시 사전에 길이가 결정되어야 함
//        int[] arr1 = new int[5];
//        arr1[0] = 10;
//        arr1[1] = 20;
//        arr1[3] = 40;
//        arr1[4] = 50;
//        arr1[5] = 10;      // IndexOutOfBoundsException: 배열의 길이가 동적으로 늘어날 수 없음
//        System.out.println(arr1[2]);    // int 배열은 0으로 초기화, String은 null로 초기화
//
////        2. 리터럴 방식
//        int[] arr2 = {10, 20, 30, 40, 50};
//
////        3. 선언 및 리터럴
//        int[] arr3 = new int[]{10, 20, 30, 40, 50};
//
////        배열표현식 3. 예시
//        ArrayList<int[]> list = new ArrayList<>();
//        list.add(new int[5]);
//        list.add(new int[]{1, 3, 5, 7});
//        System.out.println(list.get(1)[3]);
//
////        배열표현식 4. : 불가 -> 배열의 길이를 반드시 확정시켜야 함.
//        int[] arr4 = new int[];
//
////        Arrays.fill : 배열의 모든 값을 변경
//        String[] arr = new String[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "";
//        }
//
//        Arrays.fill(arr, "");
//
////        85, 65, 90으로 구성된 int배열을 선언하고, 총합과 평균을 구하시오.
//        int[] arr = {85, 65, 90};
//        int sum = 0;
//        double avg = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//
//        avg = (double) sum / arr.length;
//
//        System.out.println(sum);
//        System.out.println(avg);
//
////        배열의 최대값 최소값
//        int[] arr = {10, 20, 30, 12, 8, 17};
//        Arrays.sort(arr);
//        System.out.println("최대값: " + arr[arr.length - 1] + "\t최소값: " + arr[0]);
//
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("최대값: " + max + "\t최소값: " + min);
//
////        배열의 자리 바꾸기
//        int[] arr = {20, 10, 30};
//        int temp = arr[0];  // keep
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println(Arrays.toString(arr));
//
////        배열 뒤집기
//        int[] arr = {10, 20, 30, 40, 50};
//        int[] newArr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            newArr[arr.length - i - 1] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));
//
////        배열의 정렬
//        int[] arr = {17, 12, 20, 10, 15};
//        Arrays.sort(arr);   // 오름차순 정렬
////        Arrays.sort(arr, Comparator.reverseOrder());  // 원시자료형은 Comparator 사용 ㅓㅛ불가능
////        System.out.println(Arrays.toString(arr));
//        String[] stArr = {"abc", "aaa", "acb", "abb"};
//        Arrays.sort(stArr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(stArr));

//        선택정렬 알고리즘 직접 구현
        int[] arr = {17, 12, 20, 10, 15};

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>=arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));



        String s = "abcabc";
        s.replace()
    }
}

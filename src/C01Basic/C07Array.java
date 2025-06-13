package C01Basic;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class C07Array {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
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
//
////        선택정렬 알고리즘 직접 구현
//        int[] arr = {17, 12, 20, 10, 15};
//
//        for(int i=0; i<arr.length-1; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]>=arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
////        소수 3개의 합으로 정수 N 만드는 경우의 수를 2차원 배열로 출력
//        int N = 33;
//
//        ArrayList<Integer> pr = new ArrayList<>();
//        for (int i = 2; i <= 100; i++) {
//            boolean flag = true;
//            for (int j = 2; j < Math.sqrt(i) + 1; j++) {
//                if (i % j == 0) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                pr.add(i);
//            }
//        }
//
//        ArrayList<int[]> list = new ArrayList<>();
//        for (int i = 0; i < pr.size() - 2; i++) {
//            for (int j = i + 1; j < pr.size() - 1; j++) {
//                for (int k = j + 1; k < pr.size(); k++) {
//                    if (pr.get(i) + pr.get(j) + pr.get(k) == N) {
//                        list.add(new int[]{pr.get(i), pr.get(j), pr.get(k)});
//                    }
//                }
//            }
//        }
//
//        int[][] answer = new int[list.size()][3];
//        for (int i = 0; i < list.size(); i++) {
//            answer[i] = list.get(i);
//        }
//        System.out.println(Arrays.deepToString(answer));
//
////        조합 문제: 모두 각기 다른 숫자의 배열이 있을 때, 만들어질 수 있는 두 숫자의 조합을 문자열 형태로 출력
//        int[] intArr = {10, 20, 30, 40, 50};
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < intArr.length - 1; i++) {
//            for (int j = i + 1; j < intArr.length; j++) {
//                sb.append("(").append(intArr[i]).append(", ").append(intArr[j]).append(") ");
//            }
//        }
//        bw.write(sb.toString());
//        bw.flush();
//
////        배열의 중복제거: set 자료구조를 활용하여 중복제거, 중복 X, 순서 X
//        int[] intArr = {10, 10, 20, 30, 30, 40};
//        Set<Integer> mySet = new HashSet<>();
//        for (int a : intArr) {
//            mySet.add(a);
//        }
//        System.out.println(mySet);
//        int[] answer = new int[mySet.size()];
//        int index = 0;
//        for (int a : mySet) {
//            answer[index] = a;
//            index++;
//        }
//        Arrays.sort(answer);
//        System.out.println(Arrays.toString(answer));
//
////        배열의 검색
//        int[] arr = {5, 3, 1, 8, 7};
//        int target = 8;
//        for (int i = 0; i < arr.length; i++) {
//            if (target == arr[i]) {
//                System.out.println(i + " 번째 인덱스");
//                break;
//            }
//        }
//
////        이분탐색(이진검색) - binary search
////        사전에 데이터가 오름차순 정렬돼 있을경우 이분탐색 가능
//        int[] arr = {1, 3, 6, 8, 9, 11, 15};
////        값이 있으면 해당 인덱스, 없으면 음수 리턴
//        System.out.println(Arrays.binarySearch(arr, 15));
//
////        2차원 배열의 선언과 값 할당
////        {{1,2}, {3,4}, {5,6}}
//        int[][] arr = new int[3][2];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[1][0] = 3;
//        arr[1][1] = 4;
//        arr[2][0] = 5;
//        arr[2][1] = 6;
//
////        리터럴 방식
//        int[][] arr2 = {{1, 2}, {3, 4}, {5, 6}};
//
////        가변 배열: 배열의 전체 길이는 반드시 할당
//        int[][] arr3 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
//
//
//        int[][] arr4 = new int[3][];
//        arr4[0] = new int[2];
////        각각 값 할당
//        arr4[0] = new int[3];
////        각각 값 할당
//        arr4[0] = new int[4];
////        각각 값 할당
//
////        [3][4] 사이즈 배열을 선언하고 1~12까지의 숫자값을 각 배열에 순차적으로 할당
//        int[][] arr = new int[3][4];
//        int count = 1;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = count;
//                count++;
//            }
//        }
//
//        System.out.println(arr);                      // 2차원 배열의 주소값
//        System.out.println(Arrays.toString(arr));     // 각 1차원 배열의 주소값 출력
//        System.out.println(Arrays.deepToString(arr)); // 각 1차원 배열의 값 출력
//
////        가변배열 값 채우기
//        int[][] arr = new int[3][];
//        int count = 1;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new int[4];
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = count;
//                count++;
//            }
//        }
//
//        System.out.println(Arrays.deepToString(arr));
//
////        배열복사
////        Arrays.copyOf(배열명, length), Arrays.copyOfRange(배열명, start, end)
//        int[] arr = {1,4,6,7,8,1,2,4,6};
//        int[] arr1 = Arrays.copyOf(arr, 4);
//        System.out.println(Arrays.toString(arr1));
//        int[] arr2 = Arrays.copyOfRange(arr, 3,6);
//        System.out.println(Arrays.toString(arr2));

    }
}

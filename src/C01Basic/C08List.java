package C01Basic;

import java.util.*;

public class C08List {
    public static void main(String[] args) {
////        List 선언 방법 1
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//
////        List 선언 방법 2: 가장 일반적인 방법
//        List<String> myList3 = new ArrayList<>();
//
////        초기값 세팅방법 1. 개별 data add
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("C++");
//
//        System.out.println(myList3);
//        myList3.toString();
//
////        초기값 세팅방법 2. 배열을 리스트로 변환
//        String[] arr = {"java", "python", "C++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList());
//
//        int[] intArr = {10, 20, 30};
//        List<Integer> myIntList = new ArrayList<>();
//        for (int i = 0; i < intArr.length; i++) {
//            myIntList.add(intArr[i]);
//        }
//
////        add 메서드: List에 값을 하나씩 추가하는 메서드
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(0, 30);    // 비효울적, List에서 중간에 데이터를 삽입/삭제 하는 것은 성능 ↓
//        System.out.println(list);
//
////        get(index): 특정 index의 값 반환
//
////        size(): List의 크기(길이) 반환
//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
//
////        remove: 요소 삭제
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//
////        index를 통한 삭제 2) value를 통한 삭제(일반적이지 않음)
//        list.remove(0);
//        list.remove(Integer.valueOf(30));
//
////        clear : 요소 전체 삭제
//        myList.clear();
//        System.out.println(myList.isEmpty());
//
////        indexOf : 특정값을 찾아 index return (가장 먼저 나오는 값)
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(10);
//        list2.add(20);
//        list2.add(30);
//        list2.add(30);
//
//        System.out.println(list.indexOf(30));
//
////        contains: 값이 존재유무 출력
//
////        정렬: 방법 2가지(Collections 클래스 사용, 객체 사용)
//        List<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
////        Collections.sort();
//        Collections.sort(list);
//        System.out.println(list);
//        Collections.sort(list, Comparator.reverseOrder());
//        System.out.println(list);
//
////        객체(ArrayList)명.sort();
//        list.sort(Comparator.naturalOrder());   // 오름차순
//        System.out.println(list);
//        list.sort(Comparator.reverseOrder());   // 내림차순
//        System.out.println(list);
//
////        이중리스트: 리스트 안의 리스트 (= 이차원 배열)
////        [[1,2], [3,4], [5,6]]
//        List<List<Integer>> list = new ArrayList();
//        List<Integer> list1 = new ArrayList<>();
//        list.add(list1);
//        list.add(new ArrayList<>());
//        list.get(0).add(1);
//        list.get(0).add(2); // [1,2]
//        list.get(1).add(3);
//        list.get(1).add(4); // [[1,2], [3,4]]
//
////        for문 이용해서
//        List<List<Integer>> list = new ArrayList();
//        int num=1;
//        for(int i=0; i<4; i++){
//            list.add(new ArrayList<>());
//            for(int j=0; j<3; j++){
//                list.get(i).add(num++);
//            }
//        }
//        System.out.println(list);
//
//        리스트 안에 배열
//        [[], [], []];
        List<int[]> list = new ArrayList<>();
        list.add(new int[2]);
        list.get(0)[0] = 1;
        list.get(0)[1] = 2;
        list.add(new int[3]);
        list.get(1)[0] = 1;
        list.get(1)[1] = 2;
        list.get(1)[2] = 3;
        list.add(new int[]{1, 2, 3, 4});

        for (int[] i : list) {
            System.out.println(Arrays.toString(i));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(Arrays.toString(list.get(i)));
        }

    }
}

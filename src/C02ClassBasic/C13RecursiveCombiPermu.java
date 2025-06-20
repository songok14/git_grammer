package C02ClassBasic;

import com.sun.security.jgss.InquireType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// combi: 조합, Permu: 순열
// 주로 백트래킹 알고리즘 상황에서 사용
public class C13RecursiveCombiPermu {
    public static void main(String[] args) {
        /// hello world 1 hello world 2 ... hello world n 출력
//        int total = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("hello world " + total);
//                total++;
//            }
//        }
//
        /// 위 for문의 반복 횟수는 동적으로 결정되지 않고 정적으로 코딩할 수 밖에 없는 한계가 존재
//        forRecur(0, 3);


        /// 재귀함수 예저: 조합
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        /// 숫자 1,2,3,4 를 가지고 만들 수 있는 2개짜리 숫자 조합을 이중 리스트에 담아 출력
//        List<List<Integer>> doubleList = new ArrayList<>();
//        System.out.println(doubleList);
//        for (int i = 0; i < myList.size() - 1; i++) {
//            for (int j = i + 1; j < myList.size(); j++) {
//                List<Integer> temp = new ArrayList<>();
//                temp.add(myList.get(i));
//                temp.add(myList.get(j));
//                doubleList.add(temp);
//            }
//        }
//        System.out.println(doubleList);

        /// 재귀함수를 만들기 위한 for문 변형
        List<List<Integer>> doubleList = new ArrayList<>();
//        for (int i = 0; i < myList.size() - 1; i++) {
//            List<Integer> temp = new ArrayList<>();
//            temp.add(myList.get(i));
//            for (int j = i + 1; j < myList.size(); j++) {
//                temp.add(myList.get(j));
//                doubleList.add(new ArrayList<>(temp));   // [1,2], [1,3], [1,4]
//                temp.remove(temp.size() - 1);
//            }
//            temp.remove(temp.size() - 1);
//        }
//        System.out.println(doubleList);

        ///
//        combie(myList, new ArrayList<>(), doubleList, 2, 0);
//        System.out.println(doubleList);

        /// 순열 구하기
        permu(myList, new ArrayList<>(), doubleList, 4, new boolean[myList.size()]);
        System.out.println(doubleList);

        /// 백준: 15649 N과 M
        /// 백준: 6603 로또


    }

    static void permu(List<Integer> myList, List<Integer> temp, List<List<Integer>> doubleList, int target, boolean[] visited) {
        if (temp.size() == target) {
            doubleList.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < myList.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp.add(myList.get(i));
                permu(myList, temp, doubleList, target, visited);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }

    static void combie(List<Integer> myList, List<Integer> temp, List<List<Integer>> doubleList, int target, int start) {
        if (temp.size() == target) {
            doubleList.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < myList.size(); i++) {
            temp.add(myList.get(i));
            combie(myList, temp, doubleList, target, i + 1);
            temp.remove(temp.size() - 1);
        }
    }


    static private int n = 0;

    static void forRecur(int num, int target) {
        if (num == target) {
            System.out.println("hello world " + ++n);
            return;
        }
        for (int i = 0; i < 3; i++) {
//            System.out.println("hello world " + ++n); // 원하지 않은 결과 출력
            forRecur(num + 1, target);
        }
    }
}

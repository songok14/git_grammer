package C01Basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class C11QueueStackDeque {
    public static void main(String[] args) {
////        Queue 인터페이스를 LinkedList가 구현한 아래와 같은 방식을 가장 많이 사용
//        Queue<Integer> myQ = new LinkedList<>();
//        myQ.add(10);
//        myQ.add(20);
//        myQ.add(30);
//
////        poll: queue에서 데이터를 삭제하면서, 동시에 return하는 메서드
//        int temp = myQ.poll();      // 10
//        System.out.println(temp);
//        System.out.println(myQ);    // 20, 30
//
////        peek: queue에서 데이터를 삭제하지 않고, 가장 앞의 데이터 반환
//        int temp2 = myQ.peek();     // 20
//        System.out.println(temp2);
//        System.out.println(myQ);    // 20, 30
//
////        LinkedList와 ArrayList 성능 차이
//        long startTime = System.currentTimeMillis();
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for(int i =0; i<100000; i++){
//            linkedList.add(0, i);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);
//
//        startTime = System.currentTimeMillis();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for(int i =0; i<100000; i++){
//            arrayList.add(0, i);
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);


    }
}

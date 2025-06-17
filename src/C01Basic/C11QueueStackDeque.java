package C01Basic;

import java.util.ArrayDeque;
import java.util.Deque;

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
//
////        Queue의 일반적인 출력 방법
//        Queue<String> myQ = new LinkedList<>();
//        myQ.add("문서1");
//        myQ.add("문서2");
//        myQ.add("문서3");
//        myQ.add("문서4");
////        2개씩 poll을 할 경우 Queue에서 empty가 되지 않도록 유의
//        while (!myQ.isEmpty()) {
//            System.out.println(myQ.poll());
//        }
//
////        add, poll 시 myQ의 사이즈가 계속 변하기 때문에 for문을 사용하면 정상적으로 출력하기 어렵다.
////        for (int i = 0; i < myQ.size(); i++) {
////            ...
////        }
//
////        길이제한 큐
////        add: 길이 제한 상관없이 추가
////        offer: 길이 제한이 넘어가면 더이상 추가하지 않음
//        Queue<String> blockingQ = new ArrayBlockingQueue<>(3);
//        blockingQ.offer("문서1");
//        blockingQ.offer("문서2");
//        blockingQ.offer("문서3");
//        blockingQ.offer("문서4");
////        blockingQ.add("문서4");   // IllegalStateException 발생
//        System.out.println(blockingQ);
//
////        우선순위 큐: 데이터를 poll할 때 정렬된 데이터 결과값 보장
////        전체 데이터가 계속해서 변경되는 상황에서 최소값(최대값)을 추출해야 하는 경우에 사용
//        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        pq.add(30);
//        pq.add(20);
//        pq.add(50);
//        pq.add(10);
//        pq.add(40);
//        System.out.println(pq);     // add할 때 까지는 전체 정렬이 되어있지 않음
//        while (!pq.isEmpty()){
//            System.out.println(pq.poll());  // 하나 뽑을 때 최소값을 뽑아낸다. 복잡도: log(n)
//        }
//
////        stack: 후입선출
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        System.out.println(stack.pop());    // 제거 되면서 값 return
//        System.out.println(stack.peek());   // 제거하지 않고 값 return
//        System.out.println(stack);
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());

//        deque: addLast, pollLast, addFirst, pollFirst, peekFirst, peekLast
        Deque<Integer> dQ = new ArrayDeque<>();
        dQ.addLast(10);
        dQ.addLast(20);
        dQ.addFirst(30);
        System.out.println(dQ.pollLast());
        System.out.println(dQ.pollFirst());
        System.out.println(dQ.peekLast());

    }
}

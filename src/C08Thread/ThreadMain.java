package C08Thread;

import java.util.List;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
////        단일스레드 실행
//        for (int i = 0; i < 1000; i++) {
//            Library.borrow();
//        }
//        System.out.println(Library.getBookCount());
//
////        멀티스레드 생성
////        방법 1. 스레드 클래스 상속방식
//        Thread t1 = new MyThread();
//        Thread t2 = new MyThread();
//        Thread t3 = new MyThread();
//        Thread t4 = new MyThread();
////        Thread 클래스 안에 start 메서드는 내장되어있고, start 메서드는 run 메서드를 호출하며 스레드 생성
////        각 스레드의 코드 실행순서는 보장되지 않음
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        System.out.println("hello world");
//
////        방법 2. Runnable을 직접 구현한 객체를 Thread 클래스 생성자에 주입하는
//        new Thread(() -> System.out.println("스레드 시작(MyTread)1")).start();
//        new Thread(() -> System.out.println("스레드 시작(MyTread)2")).start();
//        new Thread(() -> System.out.println("스레드 시작(MyTread)3")).start();
//        new Thread(() -> System.out.println("스레드 시작(MyTread)4")).start();
//        System.out.println("hello world");
////        진우 왔다갑니다 ^.^
////         키보드 타건감이 너무 좋은데요? ☆☆☆☆☆
//        // 지키 왔다감
//        // 키보드 훔쳐가고 싶네요 자리는 훔치지 않겠습니다^ㅡ^2

//        멀티스레드 동시성 이슈 테스트
        for (int i = 0; i < 1000; i++) {
            Thread t1 = new Thread(() -> Library.borrow());
            t1.start();
            t1.join();  // 한 스레드가 작업이 모두 완료되면 다른 스레드 생성하여 작업 수행 -> 사실상 단일 스레드처럼 동작되므로 성능 저하 발생
        }
        Thread.sleep(20000);
        System.out.println(Library.getBookCount()); // main 스레드가 실행

    }
}

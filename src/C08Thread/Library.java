package C08Thread;

public class Library {
    private static int bookCount = 100;

//    synchronized: 메서드 내에서 1개의 스레드만 실행되도록 강제 -> 다른 스레드가 실행 중이면 메서드 실행 직전에서 대기
//    rdb에 재고관리를 할 경우  synchronized를 통한다 하더라고 쿼리와 commit 실행 시점에 차이로 인해 동시성 이슈 발생
//    public synchronized static void borrow() {
    public static void borrow() {
        if (bookCount > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bookCount--;
            System.out.println("대출 완료");
        } else {
            System.out.println("대출 불가");
        }
    }

    public static int getBookCount() {
        return bookCount;
    }

}

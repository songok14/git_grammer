package C04Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01InterfaceMain {
    public static void main(String[] args) {
        C01Cat c1 = new C01Cat();
        c1.makeSound();
        C01Dog d1 = new C01Dog();
        d1.makeSound();

        /// 다형성: 하나의 부모타입으로 여러 자식객체를 다룰 수 있음
        C01AnimalInterface1 c2 = new C01Cat();
        c1.makeSound();
        C01AnimalInterface1 d2 = new C01Dog();
        d1.makeSound();

        /// 예시
        /// 인터페이스의 장점: 개발의 표준을 지정
        /// 다형성의 장점: 기존의 구현체를 다른 구현체로 변경 시 이점
        List<Integer> myList1 = new ArrayList<>();
        myList1.add(10);
        List<Integer> myList2 = new LinkedList<>();
        myList2.add(10);

        C01AnimalInterface1 c3 = new C01Cat();
        c3.makeSound();
        C01AnimalInterface2 d3 = new C01Dog();
        System.out.println(d3.play("쫑","순돌"));

        /// 다중 구현의 예시 -> 인터페이스에 따라 사용가능한 메서드가 제한된다.
        List<Integer> list = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

    }
}
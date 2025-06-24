package C05AnonymousLambda;

/// 익명 내부 클래스
public class C02AnonymousClass {
    public static void main(String[] args) {
        /// AbstractAnimal을 상속한 클래스가 별도로 존재하지 않고,
        /// 익명 클래스가 만들어짐과 동시에 익명 객체가 생성되고 있음.
        AbstractAnimal a1 = new AbstractAnimal() {
            @Override
            void makeSound1() {
                System.out.println("익명 객체를 생성하는 동시에 오버라이딩");
            }
        };
        a1.makeSound1();
        a1.makeSount2();
        /// 구현체가 없는 추상 클래스 또는 인터페이스는 익명 객체로 생성 가능

        /// 인터페이스도 익명객체 생성 가능
        Animal1 a2 = new Animal1() {
            @Override
            public void makeSount1() {
            }

            @Override
            public void makeSount2() {
            }
        };

        /// 인터페이스의 익명 객체가 구현 메서드가 1개만 있을 경우 람다 표현식(화살표) 사용 가능
        /// 매개변수와 중괄호만 남기고 생략 가능, 중괄호 안에 구현식 작성
        Animal2 a3 = () -> {
            System.out.println("hello world1");
            System.out.println("hello world2");
        };
        a3.makeSound1();

        /// 실행문이 1줄일 때, 중괄호 생략 가능
        Animal2 a4 = () -> System.out.println("hello world3");
        a4.makeSound1();

        /// 매개변수가 있는 익명객체의 람다함수 생성
        Animal3 a5 = (i1, i2, i3) -> {
            return i1 + ", " + i2 + ", " + i3;
        };

        /// 리턴문만 있을경우 중괄호, return 키워드 생략 가능
        Animal3 a6 = (i1, i2, i3) -> i1 + ", " + i2 + ", " + i3;
        System.out.println(a6.makeSound1("java", "python", "C++"));

        /// 실습. Animal4 인터페이스 정의
        /// 메서드: String makeSound(String String int)
        /// 익명 객체: 메서드의 기능: int>=10 a+b 리턴, 10 미만이면 a만 리턴
        Animal4 a7 = (s1, s2, n) -> {
            if (n >= 10) {
                return s1 + s2;
            } else {
                return s1;
            }
        };
        System.out.println(a7.makeSound("오늘 점심 ", "한솥?", 10));

    }
}

/// 추상 클래스 -> 객체 생성 불가
abstract class AbstractAnimal {
    abstract void makeSound1();

    void makeSount2() {
        System.out.println("동물 울음소리");
    }
}

interface Animal1 {
    void makeSount1();

    void makeSount2();
}

interface Animal2 {
    void makeSound1();
}

interface Animal3 {
    String makeSound1(String a, String b, String c);
}

interface Animal4 {
    String makeSound(String a, String b, int c);
}
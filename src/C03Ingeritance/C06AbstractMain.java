package C03Ingeritance;

import java.util.List;

/// final 키워드가 붙은 class는 상속 불가, final 키워드가 붙은 메서드는 overriding 불가
// public class C06AbstractMain extends finalParents{
public class C06AbstractMain {
    public static void main(String[] args) {
        AbstractDog d1 = new AbstractDog();
        d1.makeSound1();
        d1.makeSound2();

        /// 추상클래스는 구현체 없는 메서드가 있으므로 기본적으로 객체 생성 불가능
//        AbstractAnimal a1 = new AbstractAnimal();

        /// 객체의 실체는 dog클래스를 통해 만들어지므로 여기서는 d2의 makeSound2()를 사용 가능
        AbstractAnimal d2 = new AbstractDog();
        d2.makeSound1();
        d2.makeSound2();

        /// 모든 메서드가 abstract인 클래스를 인터페이스라 한다.
        /// 인터페이스는 구현체가 없으므로 기본적으로 별도의 객체 생성 불가
//        List<Integer> myList = new List<>();  // List는 인터페이스



    }
}

/// 추상메서드가 하나라도 있으면 반드시 클래스에도 abstract 키워드를 붙여 추상 클래스로 사용
abstract class AbstractAnimal {
    void makeSound1(){
        System.out.println("동물의 울음소리");
    }

    /// 메서드를 선언만하고 구현이 없는 메서드 선언 시 abstract 키워드 사용
    abstract void makeSound2();
}

class AbstractDog extends AbstractAnimal{
    @Override
    void makeSound2() {
        System.out.println("멍멍");
    }
}

final class finalParents{

}
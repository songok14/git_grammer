package C03Ingeritance.ProtectedPackage;

/// 같은 패키지 내의 클래스가 아닌 경우 import 필요
/// 패키지 바로 하위의 모든 클래스는 *로 import 가능
/// 다만, 패키지 내 패키지 않의  클래스는 *로 import 불가

import C03Ingeritance.*;

public class ProtectedTest extends C04ProtectedClass {
    public static void main(String[] args) {
        ProtectedTest p2 = new ProtectedTest();

        /// public 접근제어자는 프로젝트 전역에서 접근 가능
        p2.st1 = "hello st1";
        System.out.println(p2.st1);

        /// 패키지가 달라졌으므로 default 변수는 접근 불가
//        p2.st3 = "hello st3";

        /// 상속관계가 있을 경우 패키지가 달라도 protected 변수에 접근 가능
        p2.st4 = "hello st4";
        System.out.println(p2.st4);


        C04ProtectedClass p3 = new C04ProtectedClass();
        /// p3는 부모 클래스의 객체이고 상속관계가 있는 객체가 아니므로 protected 변수에 접근 불가
//        p3.st4 = "접근 불가";
    }
}

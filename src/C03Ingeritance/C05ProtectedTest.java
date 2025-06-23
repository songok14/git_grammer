package C03Ingeritance;

public class C05ProtectedTest {
    public static void main(String[] args) {
        C04ProtectedClass p1 = new C04ProtectedClass();
        p1.st1 = "hello st1";
        System.out.println(p1.st1);

//        p1.st2 = "hello st2"; // 접근 불가

        p1.st3 = "hello st3";
        System.out.println(p1.st3);

    }
}

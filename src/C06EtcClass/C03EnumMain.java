package C06EtcClass;

public class C03EnumMain {

    public static void main(String[] args) {
////        classGrade를 일반 문자열로 세팅할 경우
////        문제점: 정해진 문자열이 아닌 각각 다른 문자열로 생성할 수 있다.
//        Student s1 = new Student("hong", "FIRST");
//        Student s2 = new Student("hong2", "firstGrade);
//        Student s3 = new Student("hong3", "first_grade");
//
//        Student s1 = new Student("hong", ClassGrade.c1);
//        Student s2 = new Student("hong2", ClassGrade.c2);
//        Student s3 = new Student("hong3", ClassGrade.c1);

//        static final을 통해 변수값을 관리하는 방법 -> 타입이 String이므로 얼마든지 자유롭게 세팅이 가능한 문제점 존재
        Student s1 = new Student("hong", ClassGrade.FISTFIRST_GRADE);
//        Student s2 = new Student("hong2", ClassGrade."SECOND_GRADE"); // 타입 불일치 에러
        Student s3 = new Student("hong3", ClassGrade.THIRD_GRADE);
        System.out.println(s1);
//        enum 클래스의 내부에는 값이 저장된 순서대로 0부터 index 값이 내부적으로 할당
        System.out.println(s1.getClassGrade());
        System.out.println(s1.getClassGrade().ordinal()); // 0

    }
}

//class ClassGrade {
//    static final String c1 = "FIRST_GRADE";
//    static final String c2 = "SECOND_GRADE";
//    static final String c3 = "THIRD_GRADE";
//}

// enum 안에 있는 값만 넣을 수 있음
enum ClassGrade {
    FISTFIRST_GRADE, SECOND_GRADE, THIRD_GRADE
}

class Student {
    private String name;
    private ClassGrade classGrade;      // 값이 정확해야되는 변수

//    public Student(String name, String classGrade) {
    public Student(String name, ClassGrade classGrade) {
        this.name = name;
        this.classGrade = classGrade;
    }

    public String getName() {
        return name;
    }

    public ClassGrade getClassGrade() {
        return classGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name +
                ", classGrade=" + classGrade +
                '}';
    }
}
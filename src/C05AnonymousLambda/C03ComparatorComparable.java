package C05AnonymousLambda;

import java.util.*;

public class C03ComparatorComparable {
    public static void main(String[] args) {
        /// 자바에서는 비교를 위한 인터페이스 대표적으로 2개 제공
        /// Comparable 인터페이스: compareTo 메서드 선언
        /// Comparator 인터페이스: compare 메서드 선언(추천)

        /// String 클래스에 compareTo 메서드 내장
        /// String 클래스 및 java의 많은 클래스에서 comparable을 상속하여 compareTo 메서드를 구현
//        String a = "hello";
//        String b = "world";
//        System.out.println(a.compareTo(b)); // 마이너스

//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("C++");
//        /// String 안의 compareTo 메서드를 사용하여 정렬이 이루어짐
//        Collections.sort(myList);   // comparable을 구현하고 있는 객체 입력

        /// 직접 만든 Student를 List에 담아 정렬
        List<Studendt> studendtList = new ArrayList<>();
        studendtList.add(new Studendt("kim", 24));
        studendtList.add(new Studendt("lee", 25));
        studendtList.add(new Studendt("park", 27));
        studendtList.add(new Studendt("im", 21));
        studendtList.add(new Studendt("kim", 30));

        /// 정렬 방법 1. Student 객체에서 Comparable을 직접 구현한 방식
        /// 단점: Student 객체를 직접 수정해야하므로 유연성이 떨어짐
        /// Collections.sort에서 Comparable을 구현한 객체를 요구
//        Collections.sort(studendtList);
//        System.out.println(studendtList);

        /// 정렬 방법 2. Comparator를 구현한 익명 객체 사용
        /// o1: this, o2: o
        /// Comparator의 활용도가 높은 이유는 많은 정렬 메서드에서 Comparator 객체를 요구하기 때문
        studendtList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(studendtList);

        String[] strArr = {"hello", "java", "C++", "world2"};
        Arrays.sort(strArr);
        Arrays.sort(strArr, Comparator.reverseOrder());

        /// 글자 길이를 기준으로 내림자순 정렬
        Arrays.sort(strArr, (o1, o2) -> o2.length() - o1.length());
        System.out.println(Arrays.toString(strArr));

        Queue<String> pq = new PriorityQueue<>((o1, o2) -> o1.length() - o2.length());

        // 절대값: Math.abs(-1)

        List<int[]> myList = new ArrayList<>();
        myList.add(new int[]{4,5});
        myList.add(new int[]{1,2});
        myList.add(new int[]{5,0});
        myList.add(new int[]{3,1});

        myList.sort(((o1, o2) -> {
            return o1[1] - o2[1];
        }));

        for (int[] m : myList){
            System.out.println(Arrays.toString(m));
        }
    }
}

//class Studendt implements Comparable<Studendt> {
class Studendt {
    private String name;
    private int age;

    public Studendt(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Studendt{" + "name='" + name + ", age=" + age + '}';
    }

    /// 정렬은 2개의 값을 비교하는 것으로 A와 B대상 2개만 있으면 충분
    /// 두 수(또는 문자)의 비교의 경우 음수, 0. 양수 세 값중에 하나만 return, 이를 통해 정렬 수행
    /// 비교 대상보다 작으면 음수, 같으면 0, 크면 양수 리턴
    /// this가 앞에 있으면 오름차순, 뒤에 있으면 내림차순으로 동작
//    @Override
//    public int compareTo(Studendt o) {
////        return this.getName().compareTo(o.getName());   // 오름차순
////        return o.getName().compareTo(this.getName());   // 내림차순
//
//        return this.getAge() - o.getAge();
//    }
}

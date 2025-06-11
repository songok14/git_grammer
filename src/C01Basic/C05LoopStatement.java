package C01Basic;

import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = 0;
//        while (a < 10) {
//            System.out.println("hello world");
//            a++;
//        }
//
///        while문 활용 2 ~ 10까지 출력
//        int a = 2;
//        while (a < 11) {
//            System.out.println(a);
//            a++;
//        }
//
///        도어락키 예제 -> 무한 반복되는 도어락키 예제 -> 5회 입력 횟수 제한있는 도어락키 예제
//        int count = 0;
//
//        while (true) {
//            int answer = 1234;
//
//            if (sc.nextInt() == answer) {
//                System.out.println("문이 열렸습니다.");
//                break;
///                break는 가장 가까운 반복문을 즉시 종료
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//                count++;
//            }
//
//            if (count == 5) {
//                System.out.println("비밀번호 5회 초과");
//                break;
//            }
//        }
//
///        입력한 숫자의 구구단 단수 출력
//        while (true) {
//            System.out.print("구구단 단수를 입력해 주세요. ");
//            int x = Integer.parseInt(sc.nextLine());
//            int y = 0;
//            while (y < 9) {
//                y++;
//                System.out.println(x + " * " + y + " = " + (x * y));
//            }
//        }
//
///        do while문: 무조건 한 번은 실행되는 while문
//        int a = 100;
//        do {
//            System.out.println(a);
//        } while (a < 10);
//
///        for문: 초기식, 조건식, 증감식이 모두 포함되어 있는 반복문
///        for문은 사용했던 변수명을 for문이 끝난 이후에 재선언이 가능
//        for(int i=0; i<10; i++){
//            System.out.println(i);
//        }
//
///        1~10중에 홀수만 출력하기
//        for(int i=1; i<11; i+=2){
//            System.out.println(i);
//        }
//
///        1 ~ 20까지 짝수의 총합
//        int sum = 0;
//        for (int i = 1; i < 21; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//
///        두 수의 최대 공약수 찾기
//        int a = 24;
//        int b = 36;
//        int min = (a > b) ? b : a;
//        int num = 0;
//
//        for (int i = 1; i < min; i++) {
//            if (b % i == 0 && a % i == 0) {
//                num = i;
//            }
//        }
//        System.out.println(num);
//
///        소수 구하기
////        사용자가 입력한 값이 소수인지 아닌지 판별해 주는 프로그램
////        제곱근을 구하여 복잡도를 줄이는 방법
//        int a = Integer.parseInt(sc.nextLine());
//        boolean flag = true;
////        for(int i=2; i<Math.sqrt(a); i++)
//        for (int i = 2; i * i <= a; i++) {
//            if (a % i == 0) {
//                flag = false;
//                break;
//            }
//        }
//
//        if (flag) {
//            System.out.println("소수 입니다.");
//        } else {
//            System.out.println("소수가 아닙니다.");
//        }
//
////        continue: 반복문의 조건식으로 이동하는 명령어
////        continue는 코드의 직관성과 가독성을 위해 사용
////        홀수만 출력
//        for (int i = 0; i < 11; i++) {
//            if (i % 2 == 0) {
//                continue;   // 밑으로 더이상 내려가지 않고 다음 반복문 실행
//            }
//            System.out.println(i);
//        }
//
//        int[] arr = {1,3,5,7};
////        향상된(enhanced) for문 - for-each문
//
////        일반 for문을 통한 arr의 저장된 값 변경
//        for(int i=0; i<arr.length;i++){
//            arr[i] += 10;
//        }
////        참조형 변수(객체타입)는 기본적으로 변수를 통한 출력시에 메모리 값이 출력
//        System.out.println(arr);                    // 저장된 메모리 주소 출력
//        System.out.println(Arrays.toString(arr));   // Arrays 클래스에 정의된 toString()에 맞춰 출력
//
////        향상된 for문을 통한 arr의 저장된 값 변경 -> 원본의 값 변경 불가
//        int[] arr = {1, 3, 5, 7};
//        for (int a : arr) {
//            a += 10;
//        }
//        System.out.println(Arrays.toString(arr));
//
//        자바 변수의 유효범위: {}
//
////        다중 반복문
////        2~9단 한꺼번에 출력 + 각 단마다 몇 단인지 출력
//        for (int i = 1; i <= 9; i++) {
//            System.out.println(i + "단 입니다.");
//            for (int j = 1; j <= 9; j++) {
//                System.out.println(i + " X " + j + " = " + (i * j));
//            }
//        }
//
////        100 ~ 200까지 수 중에 가장 작은 소수 출력
//        for (int i = 15; i <= 200; i++) {
//            boolean check = false;
//            for (int j = 2; j*j <= i; j++) {
//                if(i%j==0){
//                    check = true;
//                    break;
//                }
//            }
//            if(!check){
//                System.out.println(i + "가 소수입니다.");
//                break;
//            }
//        }
//
////        라벨문: 반복문에 이름을 붙이는 것
//        loop1:
//        for(int i=0; i<10; i++){
//            loop2:
//            for(int j=0; i<10; j++){
//                if(true){
//                    System.out.println("종료");
//                    break loop1;    // 원하는 for문을 라벨링을 통해 종료시킬 수 있음
//                }
//            }
//        }
//
//        int[][] arr = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}, {10, 11, 12}};
////        System.out.println(arr[1][2]);  // 1번째 배열에 2번째 값을 찾는 것.
//
////        숫자 11이 위치한 배열의 index값 출력(1,2 또는 3,1)
////        가장 먼저 찾아지는 11의 위치만 출력
//        loop1:
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++)
//                if (arr[i][j] == 11) {
//                    System.out.println(i + ", " + j);
//                    break loop1;
//                }
//        }
//
////        라벨링 없는 풀이
//        int[][] arr = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}, {10, 11, 12}};
//        boolean check = false;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] == 11) {
//                    System.out.println(i + ", " + j);
//                    check = true;
//                    break;
//                }
//            }
//            if(check){
//                break;
//            }
//        }
////        100 ~ 200까지 수 중에 가장 작은 소수 출력
//
//        loop:
//        for (int i = 100; i < 201; i++) {
//            for (int j = 2; j < Math.sqrt(i)+1; j++) {
//                if (i % j == 0) {
//                    continue loop;
//                }
//            }
//            System.out.println(i);
//            break;
//        }


    }
}
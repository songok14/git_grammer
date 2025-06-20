package C02ClassBasic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C12RecursivePractice {
    public static void main(String[] args) {
        /// for 문으로 1~10까지 누적 합계
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        /// 재귀함수로 1~10까지 누적 합계
        System.out.println(sumAcc(1, 10));

        System.out.println(factorial(5));

        /// 피보나치 수열의 10번 째 값은?
        /// 풀이1: for문만을 활용한 풀이법
        int n1=1;
        int n2=1;
        int n3=0;
        for (int i=2; i<10; i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        System.out.println(n3);

        /// 풀이2: dp알고리즘(기억하기(메모이제이션) 알고리즘)을 활용한 풀이법
        int[] n = new int[10];
        n[0] = 1;
        n[1] = 1;
        for (int i = 2; i < 10; i++) {
            n[i] = n[i - 1] + n[i - 2];
        }
        System.out.println(Arrays.toString(n));

        /// 풀이3: 재귀함수를 활용한 풀이법
        System.out.println(fibo(10));

    }

    public static int sumAcc(int n, int target) {
        if (n > target) {
            return 0;
        }
        return n + sumAcc(n + 1, target);
    }

    public static int factorial(int n) {
        return (n != 1) ? n * factorial(n - 1) : 1;
    }

    // 동일한 계산을 수행하는 경우가 너무 많아 성능이 떨어짐
    public static int fibo(int n){
        if(n <= 2){
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }


}

package C06EtcClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01Math {
    public static void main(String[] args) {
//        Math.random(): 임의의 수 반환0 0.0 ~ 1.0 사이의 double 형을 반환
        System.out.println(Math.random());

//        로또번호 7개 뽑기. 0~99 까지의 임의 숫자
        int[] rotto = new int[7];
        for (int i = 0; i < 7; i++) {
            rotto[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(rotto);
        System.out.println(Arrays.toString(rotto));

//        Math.abs(): 절대값 반환
        System.out.println(Math.abs(-5));

//        Math.ceil(): 올림, Math.floor(): 내림, Math.round(): 올림
        System.out.println(Math.ceil(5.5));
        System.out.println(Math.floor(5.5));
        System.out.println(Math.round(5.5));

//        Math.max(a, b): 두 수의 최댓값, Math.min(a, b): 두 수의 최솟값
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));

//        Math.pow(a, b): a의 b제곱, a^b
        System.out.println(Math.pow(2, 3));

//        Math.sqrt(a): a의 제곱근
        System.out.println(Math.sqrt(25));  // 5

    }
}

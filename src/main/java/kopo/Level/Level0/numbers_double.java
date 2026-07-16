package kopo.Level.Level0;

import java.util.Arrays;

public class numbers_double {
    public static void main(String[] args) {
        /*
        정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
         */
        int[] num = {4};

        System.out.println(Arrays.toString(solution(num)));
    }

    static int[] solution(int[] num) {
        int[] a = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            a[i] = num[i] * 2;
        }
        return a;
    }
}
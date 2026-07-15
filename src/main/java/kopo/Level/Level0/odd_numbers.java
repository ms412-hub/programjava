package kopo.Level.Level0;

import java.util.Arrays;

public class odd_numbers {
    public static void main(String[] args) {
        /*
        정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
         */
        int n = 100;

        System.out.println(Arrays.toString(solution(n)));
    }
    static int[] solution(int n) {
        int[] a = new int[(n + 1) / 2];
        int b = 0;

        for (int i = 1; i <= n; i += 2) {
            a[b++] = i;
        }

        return a;
    }
}

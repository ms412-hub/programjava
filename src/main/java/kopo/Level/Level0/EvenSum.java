package kopo.Level.Level0;

public class EvenSum {
    public static void main(String[] args) {
        /*
        정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
         */
        int n = 5;

        System.out.println(solution(n));
    }
    static int solution(int n) {
        int s = 0;

        for (int i = 2; i <= n; i += 2) {
            s += i;
        }

        return s;
    }
}
package kopo.Level.Level0;

public class SevenSlicePizza {
    public static void main(String[] args) {
        /*
        머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 2022년 기준 선생님의 나이 age가 주어질 때, 선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요
         */

        int n=15;
        System.out.println(solution(n));
    }

    static int solution(int n) {
        if (n % 7 == 0) {
            return n / 7;
        } else {
            return n / 7 + 1;
        }
    }
}



package kopo.Level.Level0;

public class EvenOddCount {
    public static void main(String[] args) {

        /*
        정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
         */

        int[] num_list = {1, 2, 3, 4, 5, 6};

        int[] result = solution(num_list);

        System.out.println("짝수 : " + result[0]);
        System.out.println("홀수 : " + result[1]);
    }

    static int[] solution(int[] num_list) {

        int[] answer = new int[2];

        for (int num : num_list) {
            if (num % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }

        return answer;
    }
}
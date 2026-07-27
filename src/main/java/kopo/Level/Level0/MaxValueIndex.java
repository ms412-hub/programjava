package kopo.Level.Level0;

public class MaxValueIndex {
    public static void main(String[] args) {
        /*
        정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
         */

            int[] array = {1, 8, 3, 5, 2};

            int[] result = solution(array);

            System.out.println("최댓값: " + result[0]);
            System.out.println("인덱스: " + result[1]);

    }
    static int[] solution(int[] array) {
        int m = array[0];
        int in = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > m) {
                m = array[i];
                in = i;
            }
        }

        return new int[] {m, in};
    }
}
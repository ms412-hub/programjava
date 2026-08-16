package kopo.Level.Level0;

import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String my_string = "Bcad";

        StringSort s = new StringSort();
        String result = s.solution(my_string);

        System.out.println(result);
    }

    public String solution(String my_string) {
        char[] text = my_string.toLowerCase().toCharArray();
        Arrays.sort(text);

        return new String(text);
    }
}


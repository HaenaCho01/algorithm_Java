package Programmers.lv0.codingTestIntroduction.day3_사칙연산_배열_수학;

import java.util.Arrays;

public class Sol2_중앙값_구하기 {
    public int solution(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        double div = length / 2;
        int i = (int) Math.round(div);
        int answer = array[i];
        return answer;
    }
}

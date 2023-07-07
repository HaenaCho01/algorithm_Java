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

/*
테스트 1 〉	통과 (0.41ms, 77.5MB)
테스트 2 〉	통과 (0.40ms, 76.5MB)
테스트 3 〉	통과 (0.36ms, 72.7MB)
테스트 4 〉	통과 (0.36ms, 74.6MB)
테스트 5 〉	통과 (0.37ms, 73.9MB)
테스트 6 〉	통과 (0.54ms, 75MB)
테스트 7 〉	통과 (0.42ms, 76.1MB)
테스트 8 〉	통과 (0.54ms, 77.5MB)
테스트 9 〉	통과 (0.35ms, 74.5MB)
 */
package Programmers.lv0.codingTestIntroduction.day8_배열_구현_수학;

import java.util.Arrays;

public class Sol1_배열_자르기 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int i = num1, j = 0; i <= num2; i++, j++) {
            answer[j] = numbers[i];
        }
        return answer;
    }

    public int[] solutionOther(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }

    public static void main(String[] args) {
        Sol1_배열_자르기 sol = new Sol1_배열_자르기();
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5}, 1, 3)));
        System.out.println(Arrays.toString(sol.solutionOther(new int[]{1, 3, 5}, 1, 2)));
    }
}

/*
테스트 1 〉	통과 (0.02ms, 78.1MB)
테스트 2 〉	통과 (0.01ms, 62.4MB)
테스트 3 〉	통과 (0.02ms, 71.5MB)
테스트 4 〉	통과 (0.02ms, 78.7MB)
테스트 5 〉	통과 (0.02ms, 79.6MB)
 */

package Programmers.lv0.codingTestBasicsTraining.day15_리스트배열_문자열;

import java.util.Arrays;

class Solution1 {
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] /= 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                arr[i] *= 2;
            }
        }
        return arr;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 76.5MB)
테스트 2 〉	통과 (0.02ms, 67.3MB)
테스트 3 〉	통과 (0.01ms, 80.2MB)
테스트 4 〉	통과 (0.01ms, 73.6MB)
테스트 5 〉	통과 (0.01ms, 73.6MB)
테스트 6 〉	통과 (0.02ms, 84.9MB)
테스트 7 〉	통과 (0.05ms, 74.9MB)
테스트 8 〉	통과 (0.07ms, 75.1MB)
테스트 9 〉	통과 (0.04ms, 79.3MB)
테스트 10 〉	통과 (12.32ms, 152MB)
테스트 11 〉	통과 (3.56ms, 109MB)
 */

public class Sol1_조건에_맞게_수열_변환하기_1 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 100, 99, 98})));
    }
}

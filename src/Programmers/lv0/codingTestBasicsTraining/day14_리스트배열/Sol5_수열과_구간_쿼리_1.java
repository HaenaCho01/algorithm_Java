package Programmers.lv0.codingTestBasicsTraining.day14_리스트배열;

import java.util.Arrays;

class Solution5 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                arr[j]++;
            }
        }
        return arr;
    }
}

/*
테스트 1 〉	통과 (2.25ms, 83.2MB)
테스트 2 〉	통과 (1.28ms, 80.3MB)
테스트 3 〉	통과 (0.42ms, 79.1MB)
테스트 4 〉	통과 (0.10ms, 74.9MB)
테스트 5 〉	통과 (0.08ms, 78.2MB)
테스트 6 〉	통과 (0.02ms, 73.6MB)
테스트 7 〉	통과 (1.46ms, 75MB)
테스트 8 〉	통과 (2.98ms, 66.9MB)
테스트 9 〉	통과 (1.53ms, 77.5MB)
테스트 10 〉	통과 (3.37ms, 76.1MB)
테스트 11 〉	통과 (1.81ms, 81.1MB)
 */

public class Sol5_수열과_구간_쿼리_1 {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        System.out.println(Arrays.toString(sol.solution(
                new int[]{0, 1, 2, 3, 4}, new int[][]{
                        {0, 1},
                        {1, 2},
                        {2, 3}})));
    }
}

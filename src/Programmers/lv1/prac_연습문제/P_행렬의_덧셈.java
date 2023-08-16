package Programmers.lv1.prac_연습문제;

import java.util.Arrays;

public class P_행렬의_덧셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

/*
테스트 1 〉	통과 (0.02ms, 72.3MB)
테스트 2 〉	통과 (0.05ms, 82.9MB)
테스트 3 〉	통과 (0.08ms, 84.9MB)
테스트 4 〉	통과 (0.06ms, 93.9MB)
테스트 5 〉	통과 (0.03ms, 79.1MB)
테스트 6 〉	통과 (0.06ms, 77MB)
테스트 7 〉	통과 (0.02ms, 75MB)
테스트 8 〉	통과 (0.04ms, 77.8MB)
테스트 9 〉	통과 (0.49ms, 87.3MB)
테스트 10 〉	통과 (0.23ms, 85.3MB)
테스트 11 〉	통과 (0.22ms, 86.6MB)
테스트 12 〉	통과 (0.24ms, 79.5MB)
테스트 13 〉	통과 (0.14ms, 89.4MB)
테스트 14 〉	통과 (0.30ms, 83.9MB)
테스트 15 〉	통과 (0.19ms, 84.8MB)
테스트 16 〉	통과 (0.28ms, 77MB)
테스트 17 〉	통과 (4.32ms, 112MB)
 */

    public static void main(String[] args) {
        P_행렬의_덧셈 sol = new P_행렬의_덧셈();
        System.out.println(Arrays.deepToString(sol.solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}})));
        System.out.println(Arrays.deepToString(sol.solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}})));
    }
}

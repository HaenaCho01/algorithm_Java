package Programmers.lv0.codingTestBasicsTraining.day6_조건문_반복문;

public class Sol5_수열과_구간_쿼리_2 {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        for (int s : sol.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2},{0, 3, 2},{0, 2, 2}})) {
            System.out.print(s + " ");
        }
    }
}

class Solution5 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int answerMin = 1000001;
            for (int j = s; j <= e; j++) {
                if (arr[j] > k && answerMin > arr[j]) {
                    answerMin = arr[j];
                }
            }
            if (answerMin == 1000001) {
                answerMin = -1;
            }
            answer[i] = answerMin;
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (2.49ms, 78.7MB)
테스트 2 〉	통과 (1.56ms, 74.6MB)
테스트 3 〉	통과 (0.30ms, 78.9MB)
테스트 4 〉	통과 (0.12ms, 76.7MB)
테스트 5 〉	통과 (0.09ms, 77.2MB)
테스트 6 〉	통과 (0.03ms, 78.9MB)
테스트 7 〉	통과 (1.88ms, 73.6MB)
테스트 8 〉	통과 (3.28ms, 82.9MB)
테스트 9 〉	통과 (1.15ms, 79.2MB)
테스트 10 〉	통과 (3.16ms, 73.3MB)
테스트 11 〉	통과 (2.79ms, 78.8MB)
 */

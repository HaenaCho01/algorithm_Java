package Programmers.lv0.codingTestBasicsTraining.day7_반복문;

public class Sol1_수열과_구간_쿼리_4 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int[] arr = {0, 1, 2, 4, 3}; int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
        int[] answer = sol.solution(arr, queries);
        for (int a : answer) {
            System.out.print(a + " ");
        }
    }
}

class Solution1 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (j % queries[i][2] == 0) {
                    arr[j]++;
                }
            }
        }
        return arr;
    }
}

/*
테스트 1 〉	통과 (2.69ms, 77.8MB)
테스트 2 〉	통과 (2.03ms, 78.6MB)
테스트 3 〉	통과 (0.56ms, 90.4MB)
테스트 4 〉	통과 (0.10ms, 74.9MB)
테스트 5 〉	통과 (0.10ms, 71.9MB)
테스트 6 〉	통과 (0.04ms, 66.3MB)
테스트 7 〉	통과 (2.79ms, 78.7MB)
테스트 8 〉	통과 (3.61ms, 69MB)
테스트 9 〉	통과 (2.77ms, 89.1MB)
테스트 10 〉	통과 (2.65ms, 76.8MB)
테스트 11 〉	통과 (3.05ms, 80.3MB)
 */

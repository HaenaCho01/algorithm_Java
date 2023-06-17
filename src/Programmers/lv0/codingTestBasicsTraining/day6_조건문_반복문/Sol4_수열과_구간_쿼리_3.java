package Programmers.lv0.codingTestBasicsTraining.day6_조건문_반복문;

public class Sol4_수열과_구간_쿼리_3 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        for (int s : sol.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3},{1, 2},{1, 4}})) {
            System.out.print(s + " ");
        }
    }
}

class Solution4 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        int[] mid = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
            mid[i] = arr[i];
        }

        for (int i = 0; i < queries.length; i++) {
            answer[queries[i][0]] = mid[queries[i][1]];
            answer[queries[i][1]] = arr[queries[i][0]];
            for (int j = 0; j < answer.length; j++) {
                arr[j] = answer[j];
                mid[j] = answer[j];
            }
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (5.19ms, 78MB)
테스트 2 〉	통과 (3.40ms, 72.2MB)
테스트 3 〉	통과 (1.18ms, 73.6MB)
테스트 4 〉	통과 (0.22ms, 71.1MB)
테스트 5 〉	통과 (0.18ms, 76.9MB)
테스트 6 〉	통과 (0.07ms, 72.9MB)
테스트 7 〉	통과 (3.33ms, 78.1MB)
테스트 8 〉	통과 (4.38ms, 79.6MB)
테스트 9 〉	통과 (2.95ms, 78.1MB)
테스트 10 〉	통과 (5.55ms, 76.3MB)
테스트 11 〉	통과 (3.08ms, 79.5MB)
 */

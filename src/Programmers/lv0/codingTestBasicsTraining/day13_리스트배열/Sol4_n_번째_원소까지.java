package Programmers.lv0.codingTestBasicsTraining.day13_리스트배열;

import java.util.Arrays;

class Solution4 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 77MB)
테스트 2 〉	통과 (0.01ms, 73.6MB)
테스트 3 〉	통과 (0.01ms, 77.7MB)
테스트 4 〉	통과 (0.03ms, 72.5MB)
테스트 5 〉	통과 (0.02ms, 81.7MB)
테스트 6 〉	통과 (0.02ms, 74.2MB)
테스트 7 〉	통과 (0.01ms, 74MB)
테스트 8 〉	통과 (0.02ms, 73.6MB)
테스트 9 〉	통과 (0.02ms, 76.3MB)
테스트 10 〉	통과 (0.03ms, 66.9MB)
테스트 11 〉	통과 (0.02ms, 76.4MB)
테스트 12 〉	통과 (0.02ms, 74.8MB)
테스트 13 〉	통과 (0.01ms, 64.6MB)
테스트 14 〉	통과 (0.03ms, 81MB)
테스트 15 〉	통과 (0.02ms, 73MB)
테스트 16 〉	통과 (0.02ms, 77.1MB)
테스트 17 〉	통과 (0.03ms, 67.5MB)
테스트 18 〉	통과 (0.01ms, 75.5MB)
테스트 19 〉	통과 (0.02ms, 93.8MB)
테스트 20 〉	통과 (0.01ms, 76.3MB)
 */
public class Sol4_n_번째_원소까지 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        System.out.println(Arrays.toString(sol.solution(new int[]{2, 1, 6}, 1)));
        System.out.println(Arrays.toString(sol.solution(new int[]{5,2,1,7,5}, 3)));
    }
}

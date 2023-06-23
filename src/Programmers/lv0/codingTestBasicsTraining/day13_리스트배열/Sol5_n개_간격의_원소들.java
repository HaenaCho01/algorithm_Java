package Programmers.lv0.codingTestBasicsTraining.day13_리스트배열;

import java.util.Arrays;

class Solution5 {
    public int[] solution(int[] num_list, int n) {
        int size = 0;
        if (num_list.length % n == 0) {
            size = num_list.length / n;
        } else {
            size = num_list.length / n + 1;
        }

        int[] answer = new int[size];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i * n];
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.03ms, 72.8MB)
테스트 2 〉	통과 (0.03ms, 75MB)
테스트 3 〉	통과 (0.02ms, 72.9MB)
테스트 4 〉	통과 (0.04ms, 76.1MB)
테스트 5 〉	통과 (0.02ms, 74.7MB)
테스트 6 〉	통과 (0.03ms, 73.7MB)
테스트 7 〉	통과 (0.02ms, 72.8MB)
테스트 8 〉	통과 (0.02ms, 84.3MB)
테스트 9 〉	통과 (0.03ms, 89.2MB)
테스트 10 〉	통과 (0.01ms, 78.7MB)
테스트 11 〉	통과 (0.02ms, 81.2MB)
테스트 12 〉	통과 (0.02ms, 71.9MB)
테스트 13 〉	통과 (0.02ms, 75.4MB)
테스트 14 〉	통과 (0.01ms, 75.1MB)
테스트 15 〉	통과 (0.02ms, 73.2MB)
테스트 16 〉	통과 (0.02ms, 80.8MB)
테스트 17 〉	통과 (0.03ms, 78.1MB)
테스트 18 〉	통과 (0.03ms, 81.8MB)
테스트 19 〉	통과 (0.02ms, 73.9MB)
테스트 20 〉	통과 (0.01ms, 79MB)
 */

public class Sol5_n개_간격의_원소들 {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        System.out.println(Arrays.toString(sol.solution(new int[]{4, 2, 6, 1, 7, 6}, 2)));
        System.out.println(Arrays.toString(sol.solution(new int[]{4, 2, 6, 1, 7, 6}, 4)));
    }
}

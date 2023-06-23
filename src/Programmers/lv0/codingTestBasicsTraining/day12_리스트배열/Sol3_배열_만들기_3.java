package Programmers.lv0.codingTestBasicsTraining.day12_리스트배열;

import java.util.ArrayList;
import java.util.List;

class Solution3 {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i <= 1; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                answerList.add(arr[j]);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}

public class Sol3_배열_만들기_3 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        for (int i : sol.solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}})) {
            System.out.print(i + " ");
        }
    }
}

/*
테스트 1 〉	통과 (5.29ms, 82.3MB)
테스트 2 〉	통과 (1.01ms, 84.6MB)
테스트 3 〉	통과 (6.20ms, 91.8MB)
테스트 4 〉	통과 (10.08ms, 91.2MB)
테스트 5 〉	통과 (8.86ms, 96.4MB)
테스트 6 〉	통과 (2.89ms, 93MB)
테스트 7 〉	통과 (6.33ms, 93.6MB)
테스트 8 〉	통과 (7.73ms, 105MB)
테스트 9 〉	통과 (8.15ms, 100MB)
테스트 10 〉	통과 (4.47ms, 96.1MB)
테스트 11 〉	통과 (1.13ms, 84.1MB)
 */

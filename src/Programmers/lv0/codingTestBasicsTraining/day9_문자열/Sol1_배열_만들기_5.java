package Programmers.lv0.codingTestBasicsTraining.day9_문자열;

import java.util.ArrayList;
import java.util.List;

public class Sol1_배열_만들기_5 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        for (int a : sol.solution(new String[]{"0123456789","9876543210","9999999999999"}, 50000, 5, 5)) {
            System.out.print(a + " ");
        }
    }
}

class Solution1 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answerList = new ArrayList<>();
        for (String intStr : intStrs) {
            int strInt = Integer.parseInt(intStr.substring(s, s+l));
            if (strInt > k) {
                answerList.add(strInt);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i).intValue();
        }
        
        return answer;
    }
}

/*
테스트 1 〉	통과 (10.63ms, 105MB)
테스트 2 〉	통과 (5.55ms, 94.5MB)
테스트 3 〉	통과 (3.33ms, 81.9MB)
테스트 4 〉	통과 (1.72ms, 75.6MB)
테스트 5 〉	통과 (4.42ms, 87MB)
테스트 6 〉	통과 (4.21ms, 101MB)
테스트 7 〉	통과 (3.99ms, 85.9MB)
테스트 8 〉	통과 (5.66ms, 88.5MB)
테스트 9 〉	통과 (4.10ms, 87.8MB)
테스트 10 〉	통과 (7.32ms, 91MB)
테스트 11 〉	통과 (2.92ms, 90.1MB)
 */

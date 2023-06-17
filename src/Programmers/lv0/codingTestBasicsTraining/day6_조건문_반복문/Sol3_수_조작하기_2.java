package Programmers.lv0.codingTestBasicsTraining.day6_조건문_반복문;

public class Sol3_수_조작하기_2 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(sol.solution(new int[] {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
    }
}

class Solution3 {
    public String solution(int[] numLog) {
        StringBuilder strLog = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            if (numLog[i] - numLog[i-1] == 1) {
                strLog.append("w");
            } else if (numLog[i] - numLog[i-1] == -1) {
                strLog.append("s");
            } else if (numLog[i] - numLog[i-1] == +10) {
                strLog.append("d");
            } else if (numLog[i] - numLog[i-1] == -10) {
                strLog.append("a");
            }
        }

        String answer = strLog.toString();
        return answer;
    }
}

/*
테스트 1 〉	통과 (11.75ms, 83.8MB)
테스트 2 〉	통과 (9.21ms, 84.6MB)
테스트 3 〉	통과 (2.92ms, 79.2MB)
테스트 4 〉	통과 (1.51ms, 78.1MB)
테스트 5 〉	통과 (5.87ms, 73MB)
테스트 6 〉	통과 (8.28ms, 93.8MB)
테스트 7 〉	통과 (9.75ms, 84.4MB)
테스트 8 〉	통과 (17.69ms, 74.9MB)
테스트 9 〉	통과 (6.92ms, 86.7MB)
테스트 10 〉	통과 (10.62ms, 80MB)
테스트 11 〉	통과 (6.93ms, 82.1MB)
 */

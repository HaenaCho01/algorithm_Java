package Programmers.lv0.codingTestBasicsTraining.day4_연산_조건문;

public class Sol4_조건_문자열 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        System.out.println(sol.solution("<", "=", 20, 50));
        System.out.println(sol.solution(">", "!", 41, 78));
    }
}

class Solution4 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if ((n >= m) && (ineq.equals(">")) && (eq.equals("="))) {
            answer = 1;
        } else if ((n <= m) && (ineq.equals("<")) && (eq.equals("="))) {
            answer = 1;
        } else if ((n > m) && (ineq.equals(">")) && (eq.equals("!"))) {
            answer = 1;
        } else if ((n < m) && (ineq.equals("<")) && (eq.equals("!"))) {
            answer = 1;
        }

        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 74.3MB)
테스트 2 〉	통과 (0.02ms, 84MB)
테스트 3 〉	통과 (0.02ms, 73MB)
테스트 4 〉	통과 (0.02ms, 75.8MB)
테스트 5 〉	통과 (0.03ms, 72.1MB)
테스트 6 〉	통과 (0.02ms, 72.8MB)
테스트 7 〉	통과 (0.02ms, 68.6MB)
테스트 8 〉	통과 (0.03ms, 76.8MB)
테스트 9 〉	통과 (0.02ms, 74.9MB)
테스트 10 〉	통과 (0.03ms, 76.8MB)
테스트 11 〉	통과 (0.03ms, 74.5MB)
테스트 12 〉	통과 (0.03ms, 80.1MB)
테스트 13 〉	통과 (0.03ms, 70.7MB)
테스트 14 〉	통과 (0.02ms, 75.5MB)
테스트 15 〉	통과 (0.03ms, 88.5MB)
테스트 16 〉	통과 (0.03ms, 74.6MB)
테스트 17 〉	통과 (0.01ms, 74.1MB)
테스트 18 〉	통과 (0.02ms, 77.1MB)
테스트 19 〉	통과 (0.01ms, 72.5MB)
테스트 20 〉	통과 (0.02ms, 79.8MB)
테스트 21 〉	통과 (0.03ms, 71.8MB)
테스트 22 〉	통과 (0.03ms, 77.4MB)
테스트 23 〉	통과 (0.03ms, 74.4MB)
테스트 24 〉	통과 (0.02ms, 69MB)
테스트 25 〉	통과 (0.02ms, 74.8MB)
테스트 26 〉	통과 (0.02ms, 73.6MB)
테스트 27 〉	통과 (0.03ms, 77.6MB)
테스트 28 〉	통과 (0.01ms, 82.8MB)
테스트 29 〉	통과 (0.03ms, 72.1MB)
테스트 30 〉	통과 (0.02ms, 74.1MB)
 */

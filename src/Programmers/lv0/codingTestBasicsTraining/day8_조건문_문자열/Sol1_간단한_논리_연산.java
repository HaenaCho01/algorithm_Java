package Programmers.lv0.codingTestBasicsTraining.day8_조건문_문자열;

public class Sol1_간단한_논리_연산 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        System.out.println(sol.solution(false, true, true, true));
        System.out.println(sol.solution(true, false, false, false));
    }
}

class Solution1 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1 || x2) && (x3 || x4);
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.03ms, 76.6MB)
테스트 2 〉	통과 (0.03ms, 75.9MB)
테스트 3 〉	통과 (0.01ms, 72.5MB)
테스트 4 〉	통과 (0.03ms, 71.6MB)
테스트 5 〉	통과 (0.02ms, 75.9MB)
테스트 6 〉	통과 (0.02ms, 80.1MB)
테스트 7 〉	통과 (0.02ms, 76.9MB)
테스트 8 〉	통과 (0.03ms, 76.1MB)
테스트 9 〉	통과 (0.01ms, 75.7MB)
테스트 10 〉	통과 (0.03ms, 74MB)
테스트 11 〉	통과 (0.02ms, 66.3MB)
테스트 12 〉	통과 (0.01ms, 78.2MB)
테스트 13 〉	통과 (0.02ms, 76.9MB)
테스트 14 〉	통과 (0.02ms, 74.8MB)
테스트 15 〉	통과 (0.01ms, 74.3MB)
테스트 16 〉	통과 (0.01ms, 76.3MB)
 */
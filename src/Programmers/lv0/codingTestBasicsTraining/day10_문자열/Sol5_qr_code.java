package Programmers.lv0.codingTestBasicsTraining.day10_문자열;

class Solution5 {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                answer.append(code.charAt(i));
            }
        }

        return answer.toString();
    }
}

public class Sol5_qr_code {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        System.out.println(sol.solution(3,1,"qjnwezgrpirldywt"));
        System.out.println(sol.solution(1,0,"programmers"));
    }
}

/*
테스트 1 〉	통과 (0.09ms, 74MB)
테스트 2 〉	통과 (0.07ms, 78.4MB)
테스트 3 〉	통과 (0.07ms, 74.8MB)
테스트 4 〉	통과 (0.03ms, 78.2MB)
테스트 5 〉	통과 (0.12ms, 71.4MB)
테스트 6 〉	통과 (0.02ms, 75.1MB)
테스트 7 〉	통과 (0.06ms, 76.3MB)
테스트 8 〉	통과 (0.06ms, 77MB)
테스트 9 〉	통과 (0.04ms, 75.2MB)
테스트 10 〉	통과 (0.04ms, 75.4MB)
테스트 11 〉	통과 (0.07ms, 72.1MB)
테스트 12 〉	통과 (0.04ms, 68.1MB)
테스트 13 〉	통과 (0.07ms, 76.1MB)
테스트 14 〉	통과 (0.07ms, 77.4MB)
테스트 15 〉	통과 (0.09ms, 76.2MB)
테스트 16 〉	통과 (0.13ms, 77.4MB)
테스트 17 〉	통과 (0.05ms, 73.1MB)
테스트 18 〉	통과 (0.09ms, 73.9MB)
테스트 19 〉	통과 (0.06ms, 74.4MB)
테스트 20 〉	통과 (0.07ms, 82.4MB)
 */

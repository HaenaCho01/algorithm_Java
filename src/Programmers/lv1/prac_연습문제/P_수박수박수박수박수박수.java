package Programmers.lv1.prac_연습문제;

public class P_수박수박수박수박수박수 {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sb.append('수');
            } else {
                sb.append('박');
            }
        }
        return sb.toString();
    }

/*
테스트 1 〉	통과 (0.12ms, 74.7MB)
테스트 2 〉	통과 (0.39ms, 73.6MB)
테스트 3 〉	통과 (0.25ms, 67.9MB)
테스트 4 〉	통과 (0.58ms, 80.1MB)
테스트 5 〉	통과 (0.23ms, 78.1MB)
테스트 6 〉	통과 (0.05ms, 81.8MB)
테스트 7 〉	통과 (0.05ms, 76.2MB)
테스트 8 〉	통과 (0.08ms, 74.9MB)
테스트 9 〉	통과 (0.09ms, 74.5MB)
테스트 10 〉	통과 (0.06ms, 76.5MB)
테스트 11 〉	통과 (0.05ms, 77.6MB)
테스트 12 〉	통과 (0.06ms, 76.1MB)
테스트 13 〉	통과 (0.05ms, 74MB)
테스트 14 〉	통과 (0.06ms, 76.2MB)
테스트 15 〉	통과 (0.92ms, 72.7MB)
테스트 16 〉	통과 (0.07ms, 77.8MB)
 */

    public static void main(String[] args) {
        P_수박수박수박수박수박수 sol = new P_수박수박수박수박수박수();
        System.out.println(sol.solution(3));
        System.out.println(sol.solution(4));
    }
}

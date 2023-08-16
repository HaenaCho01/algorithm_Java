package Programmers.lv1.prac_연습문제;

public class P_문자열_다루기_기본 {
    public boolean solution(String s) {
        boolean answer = true;
        if (!(s.length() == 4 || s.length() == 6)) {
            answer = false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }

/*
테스트 1 〉	통과 (0.02ms, 66.6MB)
테스트 2 〉	통과 (0.02ms, 66.6MB)
테스트 3 〉	통과 (0.02ms, 78.3MB)
테스트 4 〉	통과 (0.02ms, 76.6MB)
테스트 5 〉	통과 (0.02ms, 73.8MB)
테스트 6 〉	통과 (0.01ms, 75.6MB)
테스트 7 〉	통과 (0.01ms, 74.7MB)
테스트 8 〉	통과 (0.03ms, 82.9MB)
테스트 9 〉	통과 (0.03ms, 70.5MB)
테스트 10 〉	통과 (0.03ms, 76.1MB)
테스트 11 〉	통과 (0.02ms, 72.8MB)
테스트 12 〉	통과 (0.02ms, 69.3MB)
테스트 13 〉	통과 (0.02ms, 75.7MB)
테스트 14 〉	통과 (0.04ms, 76.1MB)
테스트 15 〉	통과 (0.02ms, 76.3MB)
테스트 16 〉	통과 (0.02ms, 67.5MB)
테스트 17 〉	통과 (0.02ms, 75.8MB)
테스트 18 〉	통과 (0.02ms, 73.1MB)
테스트 19 〉	통과 (0.02ms, 75.9MB)
테스트 20 〉	통과 (0.02ms, 75.6MB)
테스트 21 〉	통과 (0.03ms, 75.5MB)
테스트 22 〉	통과 (0.02ms, 78.1MB)
테스트 23 〉	통과 (0.02ms, 80.2MB)
테스트 24 〉	통과 (0.02ms, 73.5MB)
테스트 25 〉	통과 (0.02ms, 74MB)
테스트 26 〉	통과 (0.03ms, 74.1MB)
테스트 27 〉	통과 (0.02ms, 80.2MB)
테스트 28 〉	통과 (0.02ms, 86.9MB)
테스트 29 〉	통과 (0.01ms, 74.5MB)
테스트 30 〉	통과 (0.02ms, 72.8MB)
 */

    public static void main(String[] args) {
        P_문자열_다루기_기본 sol = new P_문자열_다루기_기본();
        System.out.println(sol.solution("a234"));
        System.out.println(sol.solution("1234"));
    }
}

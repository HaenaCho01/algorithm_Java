package Programmers.lv0.codingTestIntroduction.day7_문자열_조건문_수학_반복문;

public class Sol4_짝수의_합 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i += 2) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol4_짝수의_합 sol = new Sol4_짝수의_합();
        System.out.println(sol.solution(10));
        System.out.println(sol.solution(4));
    }
}

/*
테스트 1 〉	통과 (0.02ms, 73.6MB)
테스트 2 〉	통과 (0.02ms, 73.1MB)
테스트 3 〉	통과 (0.04ms, 72.3MB)
테스트 4 〉	통과 (0.02ms, 75.7MB)
테스트 5 〉	통과 (0.02ms, 81MB)
테스트 6 〉	통과 (0.01ms, 66MB)
테스트 7 〉	통과 (0.03ms, 77.2MB)
 */

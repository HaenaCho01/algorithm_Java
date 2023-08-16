package Programmers.lv1.challenge_월간_위클리_챌린지;

public class P_내적 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }

/*
테스트 1 〉	통과 (0.05ms, 72.1MB)
테스트 2 〉	통과 (0.02ms, 71.2MB)
테스트 3 〉	통과 (0.03ms, 77.5MB)
테스트 4 〉	통과 (0.03ms, 70.3MB)
테스트 5 〉	통과 (0.02ms, 70.7MB)
테스트 6 〉	통과 (0.03ms, 75.3MB)
테스트 7 〉	통과 (0.03ms, 84.8MB)
테스트 8 〉	통과 (0.04ms, 68.5MB)
테스트 9 〉	통과 (0.05ms, 71.3MB)
 */

    public static void main(String[] args) {
        P_내적 sol = new P_내적();
        System.out.println(sol.solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2}));
        System.out.println(sol.solution(new int[]{-1,0,1}, new int[]{1,0,-1}));
    }
}

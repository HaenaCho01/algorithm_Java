package Programmers.lv1.challenge_월간코드챌린지;

public class P_음양_더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }

/*
테스트 1 〉	통과 (0.04ms, 75.9MB)
테스트 2 〉	통과 (0.06ms, 85.4MB)
테스트 3 〉	통과 (0.04ms, 71.7MB)
테스트 4 〉	통과 (0.04ms, 74.9MB)
테스트 5 〉	통과 (0.04ms, 69.9MB)
테스트 6 〉	통과 (0.04ms, 78.8MB)
테스트 7 〉	통과 (0.04ms, 81MB)
테스트 8 〉	통과 (0.04ms, 71.9MB)
테스트 9 〉	통과 (0.04ms, 68.6MB)
 */

    public static void main(String[] args) {
        P_음양_더하기 sol = new P_음양_더하기();
        System.out.println(sol.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
        System.out.println(sol.solution(new int[]{1, 2, 3}, new boolean[]{false,false,true}));
    }
}

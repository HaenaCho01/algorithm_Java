package Programmers.lv0.codingTestIntroduction.day9_수학_문자열_해시_완전탐색_조건문;

public class Sol1_개미_군단 {
    public int solution(int hp) {
        return hp / 5 + hp % 5 / 3 + hp % 5 % 3;
    }

    public static void main(String[] args) {
        Sol1_개미_군단 sol = new Sol1_개미_군단();
        System.out.println(sol.solution(23));
        System.out.println(sol.solution(24));
        System.out.println(sol.solution(999));
    }
}

/*
테스트 1 〉	통과 (0.02ms, 75.9MB)
테스트 2 〉	통과 (0.02ms, 76.7MB)
테스트 3 〉	통과 (0.01ms, 80.4MB)
테스트 4 〉	통과 (0.01ms, 70.6MB)
테스트 5 〉	통과 (0.01ms, 77.2MB)
테스트 6 〉	통과 (0.02ms, 72.5MB)
테스트 7 〉	통과 (0.02ms, 88.3MB)
 */

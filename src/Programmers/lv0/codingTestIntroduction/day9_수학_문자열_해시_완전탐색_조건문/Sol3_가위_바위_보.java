package Programmers.lv0.codingTestIntroduction.day9_수학_문자열_해시_완전탐색_조건문;

public class Sol3_가위_바위_보 {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '2') sb.append(0);
            else if (rsp.charAt(i) == '0') sb.append(5);
            else sb.append(2);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Sol3_가위_바위_보 sol = new Sol3_가위_바위_보();
        System.out.println(sol.solution("2"));
        System.out.println(sol.solution("205"));
    }
}

/*
테스트 1 〉	통과 (0.03ms, 67.8MB)
테스트 2 〉	통과 (0.05ms, 70.8MB)
테스트 3 〉	통과 (0.03ms, 73.9MB)
테스트 4 〉	통과 (0.03ms, 74.2MB)
테스트 5 〉	통과 (0.03ms, 71.7MB)
테스트 6 〉	통과 (0.04ms, 72.3MB)
테스트 7 〉	통과 (0.11ms, 81MB)
 */

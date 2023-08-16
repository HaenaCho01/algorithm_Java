package Programmers.lv1.prac_연습문제;

import java.util.Arrays;

public class P_문자열_내림차순으로_배치하기 {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        StringBuilder sb = new StringBuilder(new String(charArr));
        return sb.reverse().toString();
    }

/*
테스트 1 〉	통과 (0.41ms, 76.1MB)
테스트 2 〉	통과 (0.42ms, 74.6MB)
테스트 3 〉	통과 (0.38ms, 76.4MB)
테스트 4 〉	통과 (0.41ms, 78.2MB)
테스트 5 〉	통과 (0.68ms, 71MB)
테스트 6 〉	통과 (0.49ms, 77.6MB)
테스트 7 〉	통과 (0.55ms, 71.9MB)
테스트 8 〉	통과 (0.41ms, 74.1MB)
테스트 9 〉	통과 (0.65ms, 74.3MB)
테스트 10 〉	통과 (0.39ms, 72.2MB)
테스트 11 〉	통과 (0.46ms, 73.1MB)
테스트 12 〉	통과 (0.60ms, 72.8MB)
테스트 13 〉	통과 (0.44ms, 85.1MB)
테스트 14 〉	통과 (0.63ms, 78.7MB)
테스트 15 〉	통과 (0.37ms, 78.4MB)
테스트 16 〉	통과 (0.62ms, 67.3MB)
 */

    public static void main(String[] args) {
        P_문자열_내림차순으로_배치하기 sol = new P_문자열_내림차순으로_배치하기();
        System.out.println(sol.solution("Zbcdefg"));
    }
}

package Programmers.lv0.codingTestIntroduction.day6_문자열_반복문_출력_배열_조건문;

public class Sol4_문자_반복_출력하기 {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 1; j <= n; j++) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Sol4_문자_반복_출력하기 sol = new Sol4_문자_반복_출력하기();
        System.out.println(sol.solution("hello", 3));
    }
}

/*
테스트 1 〉	통과 (0.03ms, 75.4MB)
테스트 2 〉	통과 (0.04ms, 79.4MB)
테스트 3 〉	통과 (0.04ms, 79MB)
테스트 4 〉	통과 (0.03ms, 76.6MB)
 */

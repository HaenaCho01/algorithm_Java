package Programmers.lv0.codingTestIntroduction.day8_배열_구현_수학;

public class Sol2_외계행성의_나이 {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder(Integer.toString(age));
        for (int i = 0; i < sb.length(); i++) {
            char castChar = (char) (sb.charAt(i) + 49); // 0 -> a 아스키코드 차이 49
            sb.setCharAt(i, castChar);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Sol2_외계행성의_나이 sol = new Sol2_외계행성의_나이();
        System.out.println(sol.solution(23));
        System.out.println(sol.solution(51));
        System.out.println(sol.solution(100));
    }
}

/*
테스트 1 〉	통과 (0.05ms, 78.5MB)
테스트 2 〉	통과 (0.04ms, 75.2MB)
테스트 3 〉	통과 (0.04ms, 76.7MB)
테스트 4 〉	통과 (0.05ms, 76.8MB)
테스트 5 〉	통과 (0.04ms, 69.4MB)
테스트 6 〉	통과 (0.04ms, 82.8MB)
 */
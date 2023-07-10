package Programmers.lv0.codingTestIntroduction.day6_문자열_반복문_출력_배열_조건문;

public class Sol1_문자열_뒤집기 {

    public String solution(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }

    public static void main(String[] args) {
        Sol1_문자열_뒤집기 sol = new Sol1_문자열_뒤집기();
        System.out.println(sol.solution("jaron"));
        System.out.println(sol.solution("bread"));
    }
}

/*
테스트 1 〉	통과 (0.04ms, 77MB)
테스트 2 〉	통과 (0.04ms, 77.8MB)
테스트 3 〉	통과 (0.03ms, 76.3MB)
테스트 4 〉	통과 (0.03ms, 76MB)
테스트 5 〉	통과 (0.04ms, 76.1MB)
 */

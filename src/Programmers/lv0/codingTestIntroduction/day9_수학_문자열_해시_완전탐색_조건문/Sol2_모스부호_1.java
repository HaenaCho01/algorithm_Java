package Programmers.lv0.codingTestIntroduction.day9_수학_문자열_해시_완전탐색_조건문;

public class Sol2_모스부호_1 {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        String[] morseArr = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letterArr = letter.split(" ");
        for (String letterS : letterArr) {
            for (int i = 0; i < morseArr.length; i++) {
                if (letterS.equals(morseArr[i])) {
                    sb.append((char) (i + 'a'));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Sol2_모스부호_1 sol = new Sol2_모스부호_1();
        System.out.println(sol.solution(".... . .-.. .-.. ---"));
        System.out.println(sol.solution(".--. -.-- - .... --- -."));
    }
}

/*
테스트 1 〉	통과 (0.15ms, 75.9MB)
테스트 2 〉	통과 (0.11ms, 74.9MB)
테스트 3 〉	통과 (0.33ms, 73.6MB)
테스트 4 〉	통과 (0.10ms, 72.6MB)
테스트 5 〉	통과 (0.12ms, 72.3MB)
테스트 6 〉	통과 (0.13ms, 75.8MB)
테스트 7 〉	통과 (0.17ms, 76.8MB)
 */

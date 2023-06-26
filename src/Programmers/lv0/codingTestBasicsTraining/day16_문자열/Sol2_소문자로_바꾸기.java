package Programmers.lv0.codingTestBasicsTraining.day16_문자열;

class Solution2 {
    public String solution(String myString) {
        return myString.toLowerCase();
    }
}

/*
테스트 1 〉	통과 (0.03ms, 71.5MB)
테스트 2 〉	통과 (0.02ms, 75.5MB)
테스트 3 〉	통과 (0.03ms, 83.5MB)
테스트 4 〉	통과 (0.03ms, 75.4MB)
테스트 5 〉	통과 (0.02ms, 78.8MB)
 */

public class Sol2_소문자로_바꾸기 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        System.out.println(sol.solution("aBcDeFg"));
        System.out.println(sol.solution("aaa"));
    }
}

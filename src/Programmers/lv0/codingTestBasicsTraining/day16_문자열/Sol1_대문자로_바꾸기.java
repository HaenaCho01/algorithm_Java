package Programmers.lv0.codingTestBasicsTraining.day16_문자열;

class Solution1 {
    public String solution(String myString) {
        return myString.toUpperCase();
    }
}

/*
테스트 1 〉	통과 (0.02ms, 74.5MB)
테스트 2 〉	통과 (0.03ms, 72.6MB)
테스트 3 〉	통과 (0.03ms, 87.3MB)
테스트 4 〉	통과 (0.04ms, 85.3MB)
 */

public class Sol1_대문자로_바꾸기 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        System.out.println(sol.solution("aBcDeFg"));
        System.out.println(sol.solution("AAA"));
    }
}

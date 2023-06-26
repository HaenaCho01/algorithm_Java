package Programmers.lv0.codingTestBasicsTraining.day16_문자열;

class Solution4 {
    public String solution(String myString) {
        StringBuilder strLower = new StringBuilder(myString.toLowerCase());
        for (int i = 0; i < strLower.length(); i++) {
             if (strLower.charAt(i) == 'a') {
                 strLower.setCharAt(i,'A');
             }
        }
        return strLower.toString();
    }
}

/*
테스트 1 〉	통과 (0.09ms, 80.5MB)
테스트 2 〉	통과 (0.05ms, 76.9MB)
테스트 3 〉	통과 (0.06ms, 78.3MB)
테스트 4 〉	통과 (0.03ms, 73.8MB)
테스트 5 〉	통과 (0.03ms, 78.3MB)
 */

public class Sol4_A_강조하기 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        System.out.println(sol.solution("abstract algebra"));
        System.out.println(sol.solution("PrOgRaMmErS"));
    }
}

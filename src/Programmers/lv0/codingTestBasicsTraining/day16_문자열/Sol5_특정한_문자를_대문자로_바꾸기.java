package Programmers.lv0.codingTestBasicsTraining.day16_문자열;

class Solution5 {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder(my_string);
        String alpUpper = alp.toUpperCase();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == alp.charAt(0)) {
                sb.setCharAt(i, alpUpper.charAt(0));
            }
        }
        return sb.toString();
    }
}

/*
테스트 1 〉	통과 (0.05ms, 74.2MB)
테스트 2 〉	통과 (0.07ms, 76.9MB)
테스트 3 〉	통과 (0.06ms, 74.5MB)
테스트 4 〉	통과 (0.08ms, 77.4MB)
테스트 5 〉	통과 (0.07ms, 77.3MB)
테스트 6 〉	통과 (0.06ms, 77.1MB)
테스트 7 〉	통과 (0.22ms, 74.3MB)
테스트 8 〉	통과 (0.11ms, 80.3MB)
테스트 9 〉	통과 (0.23ms, 67MB)
테스트 10 〉	통과 (0.21ms, 74.3MB)
테스트 11 〉	통과 (0.40ms, 75.3MB)
테스트 12 〉	통과 (0.28ms, 78.3MB)
테스트 13 〉	통과 (0.45ms, 72.3MB)
테스트 14 〉	통과 (0.52ms, 73.2MB)
테스트 15 〉	통과 (0.35ms, 74.5MB)
테스트 16 〉	통과 (0.39ms, 73.9MB)
테스트 17 〉	통과 (0.32ms, 78.2MB)
테스트 18 〉	통과 (0.04ms, 72.9MB)
테스트 19 〉	통과 (0.05ms, 78.9MB)
 */

public class Sol5_특정한_문자를_대문자로_바꾸기 {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        System.out.println(sol.solution("programmers", "p"));
        System.out.println(sol.solution("lowercase", "x"));
    }
}

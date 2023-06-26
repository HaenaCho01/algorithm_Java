package Programmers.lv0.codingTestBasicsTraining.day17_문자열;

class Solution1 {
    public String solution(String myString, String pat) {
        String answer = null;
        for (int i = myString.length() - pat.length(); i >= 0; i--) {
            if (myString.substring(i, i + pat.length()).equals(pat)) {
                answer = myString.substring(0, i + pat.length());
                break;
            }
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 70MB)
테스트 2 〉	통과 (0.02ms, 77.1MB)
테스트 3 〉	통과 (0.03ms, 73.4MB)
테스트 4 〉	통과 (0.03ms, 74.2MB)
테스트 5 〉	통과 (0.03ms, 76.2MB)
테스트 6 〉	통과 (0.02ms, 70.9MB)
테스트 7 〉	통과 (0.03ms, 65.8MB)
테스트 8 〉	통과 (0.03ms, 81.4MB)
테스트 9 〉	통과 (0.03ms, 73.1MB)
테스트 10 〉	통과 (0.03ms, 74.6MB)
테스트 11 〉	통과 (0.02ms, 71MB)
테스트 12 〉	통과 (0.04ms, 70.6MB)
 */

public class Sol1_특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        System.out.println(sol.solution("AbCdEFG", "dE"));
        System.out.println(sol.solution("AAAAaaaa", "a"));
    }
}

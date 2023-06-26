package Programmers.lv0.codingTestBasicsTraining.day15_리스트배열_문자열;

class Solution5 {
    public int solution(String myString, String pat) {
        int answer = 0;
        String myStrLower = myString.toLowerCase();
        String patLower = pat.toLowerCase();
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            if (myStrLower.substring(i, i + pat.length()).equals(patLower)) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.07ms, 73.5MB)
테스트 2 〉	통과 (0.04ms, 76.2MB)
테스트 3 〉	통과 (0.04ms, 73.4MB)
테스트 4 〉	통과 (0.04ms, 76.3MB)
테스트 5 〉	통과 (0.05ms, 71.8MB)
테스트 6 〉	통과 (0.05ms, 82.1MB)
테스트 7 〉	통과 (0.03ms, 75.9MB)
테스트 8 〉	통과 (0.02ms, 77.3MB)
테스트 9 〉	통과 (0.05ms, 79.1MB)
테스트 10 〉	통과 (0.03ms, 68.7MB)
테스트 11 〉	통과 (0.10ms, 73.7MB)
테스트 12 〉	통과 (0.09ms, 73.1MB)
테스트 13 〉	통과 (0.25ms, 78.5MB)
테스트 14 〉	통과 (18.41ms, 96.9MB)
테스트 15 〉	통과 (3.01ms, 73.9MB)
테스트 16 〉	통과 (2.72ms, 73.3MB)
테스트 17 〉	통과 (0.09ms, 77MB)
테스트 18 〉	통과 (0.10ms, 75.2MB)
테스트 19 〉	통과 (0.02ms, 71.7MB)
테스트 20 〉	통과 (31.10ms, 92.6MB)
테스트 21 〉	통과 (18.37ms, 103MB)
테스트 22 〉	통과 (12.96ms, 69.8MB)
 */

public class Sol5_원하는_문자열_찾기 {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        System.out.println(sol.solution("AbCdEfG", "aBc"));
        System.out.println(sol.solution("aaAA", "aaaaa"));
    }
}

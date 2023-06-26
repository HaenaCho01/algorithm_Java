package Programmers.lv0.codingTestBasicsTraining.day17_문자열;

class Solution2 {
    public int solution(String myString, String pat) {
        int cnt = 0;
        for (int i = 0; i <= myString.length()-pat.length(); i++) {
            if (myString.substring(i, i + pat.length()).equals(pat)) {
                cnt++;
            }
        }
        return cnt;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 66.7MB)
테스트 2 〉	통과 (0.04ms, 81.4MB)
테스트 3 〉	통과 (0.04ms, 76.9MB)
테스트 4 〉	통과 (0.04ms, 78.7MB)
테스트 5 〉	통과 (0.04ms, 75.1MB)
테스트 6 〉	통과 (0.04ms, 75.4MB)
테스트 7 〉	통과 (0.15ms, 78MB)
테스트 8 〉	통과 (0.14ms, 71.9MB)
테스트 9 〉	통과 (0.05ms, 68.4MB)
테스트 10 〉	통과 (0.17ms, 72.1MB)
테스트 11 〉	통과 (0.14ms, 77MB)
테스트 12 〉	통과 (0.04ms, 74.4MB)
테스트 13 〉	통과 (0.03ms, 73.6MB)
 */

public class Sol2_문자열이_몇_번_등장하는지_세기 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        System.out.println(sol.solution("banana", "ana"));
        System.out.println(sol.solution("aaaa", "aa"));
    }
}

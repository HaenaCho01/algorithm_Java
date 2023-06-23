package Programmers.lv0.codingTestBasicsTraining.day10_문자열;

class Solution1 {
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}

public class Sol1_문자열의_앞의_n글자 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        System.out.println(sol.solution("ProgrammerS123", 11));
        System.out.println(sol.solution("He110W0r1d", 5));
    }
}

/*
테스트 1 〉	통과 (0.02ms, 71MB)
테스트 2 〉	통과 (0.02ms, 77.5MB)
테스트 3 〉	통과 (0.02ms, 77MB)
테스트 4 〉	통과 (0.02ms, 80.2MB)
테스트 5 〉	통과 (0.01ms, 72.7MB)
테스트 6 〉	통과 (0.02ms, 93.4MB)
테스트 7 〉	통과 (0.02ms, 77.6MB)
테스트 8 〉	통과 (0.02ms, 71.8MB)
테스트 9 〉	통과 (0.02ms, 73.7MB)
테스트 10 〉	통과 (0.02ms, 76.5MB)
테스트 11 〉	통과 (0.02ms, 74.3MB)
테스트 12 〉	통과 (0.02ms, 83MB)
테스트 13 〉	통과 (0.01ms, 67.6MB)
테스트 14 〉	통과 (0.03ms, 76.9MB)
테스트 15 〉	통과 (0.03ms, 72.5MB)
테스트 16 〉	통과 (0.01ms, 74.1MB)
테스트 17 〉	통과 (0.02ms, 80.9MB)
테스트 18 〉	통과 (0.02ms, 69.3MB)
 */

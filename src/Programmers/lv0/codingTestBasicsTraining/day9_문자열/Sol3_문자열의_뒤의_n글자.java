package Programmers.lv0.codingTestBasicsTraining.day9_문자열;

public class Sol3_문자열의_뒤의_n글자 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(sol.solution("ProgrammerS123", 11));
        System.out.println(sol.solution("He110W0r1d", 5));
    }
}

class Solution3 {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length()-n);
    }
}

/*
테스트 1 〉	통과 (0.02ms, 74.2MB)
테스트 2 〉	통과 (0.03ms, 76.4MB)
테스트 3 〉	통과 (0.03ms, 74.8MB)
테스트 4 〉	통과 (0.02ms, 87.9MB)
테스트 5 〉	통과 (0.03ms, 71.8MB)
테스트 6 〉	통과 (0.03ms, 81.7MB)
테스트 7 〉	통과 (0.03ms, 80.2MB)
테스트 8 〉	통과 (0.01ms, 73.8MB)
테스트 9 〉	통과 (0.02ms, 73.1MB)
테스트 10 〉	통과 (0.02ms, 78.2MB)
테스트 11 〉	통과 (0.02ms, 72.4MB)
테스트 12 〉	통과 (0.03ms, 77MB)
테스트 13 〉	통과 (0.02ms, 78.4MB)
테스트 14 〉	통과 (0.04ms, 73.7MB)
테스트 15 〉	통과 (0.02ms, 74.6MB)
테스트 16 〉	통과 (0.02ms, 81.5MB)
테스트 17 〉	통과 (0.03ms, 77.6MB)
테스트 18 〉	통과 (0.02ms, 80.6MB)
 */

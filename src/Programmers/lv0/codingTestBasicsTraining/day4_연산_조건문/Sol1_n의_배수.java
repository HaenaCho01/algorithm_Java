package Programmers.lv0.codingTestBasicsTraining.day4_연산_조건문;

public class Sol1_n의_배수 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        System.out.println(sol.solution(98, 2));
        System.out.println(sol.solution(34, 3));
    }
}

class Solution1 {
    public int solution(int num, int n) {
        int answer = 0;
        if (num % n == 0) {
            answer = 1;
        } else if (num % n != 0) {
            answer = 0;
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.03ms, 72MB)
테스트 2 〉	통과 (0.03ms, 82.2MB)
테스트 3 〉	통과 (0.02ms, 77.2MB)
테스트 4 〉	통과 (0.02ms, 84.1MB)
테스트 5 〉	통과 (0.01ms, 76.6MB)
테스트 6 〉	통과 (0.02ms, 74.4MB)
테스트 7 〉	통과 (0.02ms, 74MB)
테스트 8 〉	통과 (0.02ms, 78.8MB)
테스트 9 〉	통과 (0.02ms, 72.3MB)
테스트 10 〉	통과 (0.02ms, 70.3MB)
테스트 11 〉	통과 (0.02ms, 75.9MB)
테스트 12 〉	통과 (0.01ms, 71.6MB)
테스트 13 〉	통과 (0.03ms, 72.3MB)
테스트 14 〉	통과 (0.01ms, 75.7MB)
테스트 15 〉	통과 (0.01ms, 71.5MB)
 */
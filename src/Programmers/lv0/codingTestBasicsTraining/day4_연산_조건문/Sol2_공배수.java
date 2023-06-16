package Programmers.lv0.codingTestBasicsTraining.day4_연산_조건문;

public class Sol2_공배수 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        System.out.println(sol.solution(60, 2, 3));
        System.out.println(sol.solution(55, 10, 5));
    }
}

class Solution2 {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if (number % n == 0 && number % m ==0) {
            answer = 1;
        } else answer = 0;
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.01ms, 73.7MB)
테스트 2 〉	통과 (0.02ms, 77MB)
테스트 3 〉	통과 (0.03ms, 74.3MB)
테스트 4 〉	통과 (0.03ms, 70.9MB)
테스트 5 〉	통과 (0.02ms, 80.6MB)
테스트 6 〉	통과 (0.03ms, 91.1MB)
테스트 7 〉	통과 (0.01ms, 74.3MB)
테스트 8 〉	통과 (0.02ms, 73.8MB)
테스트 9 〉	통과 (0.02ms, 71.9MB)
테스트 10 〉	통과 (0.02ms, 79.6MB)
테스트 11 〉	통과 (0.01ms, 74.6MB)
테스트 12 〉	통과 (0.03ms, 81MB)
테스트 13 〉	통과 (0.01ms, 73.4MB)
테스트 14 〉	통과 (0.02ms, 71.2MB)
테스트 15 〉	통과 (0.02ms, 86.1MB)
테스트 16 〉	통과 (0.02ms, 74.9MB)
테스트 17 〉	통과 (0.02ms, 83.1MB)
테스트 18 〉	통과 (0.01ms, 73MB)
테스트 19 〉	통과 (0.02ms, 75.7MB)
 */
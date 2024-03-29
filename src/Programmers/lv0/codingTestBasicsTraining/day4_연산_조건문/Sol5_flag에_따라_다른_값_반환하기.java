package Programmers.lv0.codingTestBasicsTraining.day4_연산_조건문;

public class Sol5_flag에_따라_다른_값_반환하기 {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        System.out.println(sol.solution(-4, 7, true));
        System.out.println(sol.solution(-4, 7, false));
    }
}

class Solution5 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if (flag == true) {
            answer = a + b;
        } else if (flag == false) {
            answer = a - b;
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 74.1MB)
테스트 2 〉	통과 (0.02ms, 71.5MB)
테스트 3 〉	통과 (0.03ms, 78.8MB)
테스트 4 〉	통과 (0.03ms, 69.7MB)
테스트 5 〉	통과 (0.02ms, 72.5MB)
테스트 6 〉	통과 (0.02ms, 72.2MB)
테스트 7 〉	통과 (0.03ms, 79.6MB)
테스트 8 〉	통과 (0.02ms, 72.9MB)
테스트 9 〉	통과 (0.03ms, 71.9MB)
테스트 10 〉	통과 (0.03ms, 80.5MB)
테스트 11 〉	통과 (0.03ms, 72.7MB)
테스트 12 〉	통과 (0.02ms, 76.8MB)
테스트 13 〉	통과 (0.02ms, 78.5MB)
테스트 14 〉	통과 (0.02ms, 74.1MB)
테스트 15 〉	통과 (0.03ms, 73.6MB)
테스트 16 〉	통과 (0.01ms, 63.2MB)
테스트 17 〉	통과 (0.03ms, 79.5MB)
테스트 18 〉	통과 (0.04ms, 79.7MB)
테스트 19 〉	통과 (0.02ms, 75.7MB)
테스트 20 〉	통과 (0.02ms, 77.8MB)
테스트 21 〉	통과 (0.01ms, 72.6MB)
테스트 22 〉	통과 (0.03ms, 76.2MB)
테스트 23 〉	통과 (0.01ms, 74.9MB)
테스트 24 〉	통과 (0.03ms, 87.9MB)
테스트 25 〉	통과 (0.02ms, 73.1MB)
테스트 26 〉	통과 (0.02ms, 73.6MB)
테스트 27 〉	통과 (0.02ms, 75.1MB)
테스트 28 〉	통과 (0.03ms, 73.7MB)
테스트 29 〉	통과 (0.02ms, 62.4MB)
테스트 30 〉	통과 (0.03ms, 66.6MB)
테스트 31 〉	통과 (0.02ms, 80.8MB)
테스트 32 〉	통과 (0.02ms, 77.1MB)
테스트 33 〉	통과 (0.02ms, 72.9MB)
테스트 34 〉	통과 (0.03ms, 79.4MB)
테스트 35 〉	통과 (0.03ms, 79.4MB)
테스트 36 〉	통과 (0.02ms, 78.6MB)
 */

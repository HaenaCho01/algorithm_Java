package Programmers.lv0.codingTestBasicsTraining.day4_연산_조건문;

public class Sol3_홀짝에_따라_다른_값_반환하기 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(sol.solution(7));
        System.out.println(sol.solution(10));
    }
}

class Solution3 {
    public int solution(int n) {
        int answer = 0;
        // n이 홀수일 때 n 이하의 모든 양의 정수의 합을 return
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    answer = answer + i;
                }
            }

        // n이 짝수일 때 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return
        } else if (n % 2 == 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    answer = answer + (i * i);
                }
            }
        }

        return answer;
    }
}

/*
테스트 1 〉	통과 (0.03ms, 76.1MB)
테스트 2 〉	통과 (0.02ms, 70.1MB)
테스트 3 〉	통과 (0.03ms, 74.4MB)
테스트 4 〉	통과 (0.02ms, 71.8MB)
테스트 5 〉	통과 (0.01ms, 76.4MB)
테스트 6 〉	통과 (0.03ms, 78.4MB)
테스트 7 〉	통과 (0.01ms, 76.3MB)
테스트 8 〉	통과 (0.02ms, 75.9MB)
테스트 9 〉	통과 (0.02ms, 78.4MB)
테스트 10 〉	통과 (0.05ms, 79.5MB)
테스트 11 〉	통과 (0.02ms, 79.1MB)
테스트 12 〉	통과 (0.02ms, 73.6MB)
테스트 13 〉	통과 (0.02ms, 73.5MB)
테스트 14 〉	통과 (0.02ms, 74.8MB)
테스트 15 〉	통과 (0.02ms, 78.5MB)
테스트 16 〉	통과 (0.03ms, 76.6MB)
테스트 17 〉	통과 (0.02ms, 77.6MB)
테스트 18 〉	통과 (0.02ms, 77.5MB)
테스트 19 〉	통과 (0.03ms, 73.6MB)
테스트 20 〉	통과 (0.03ms, 83.2MB)
 */

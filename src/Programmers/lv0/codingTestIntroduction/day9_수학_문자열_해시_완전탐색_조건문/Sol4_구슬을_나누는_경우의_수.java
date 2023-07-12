package Programmers.lv0.codingTestIntroduction.day9_수학_문자열_해시_완전탐색_조건문;

import java.math.BigInteger;

public class Sol4_구슬을_나누는_경우의_수 {
    public int solution(int balls, int share) {
        BigInteger answer = factorial(balls).divide((factorial(balls - share).multiply(factorial(share))));
        return answer.intValue();
    }

    public BigInteger factorial(int num) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(new BigInteger((Integer.toString(i))));
        }
        return factorial;
    }

    public static void main(String[] args) {
        Sol4_구슬을_나누는_경우의_수 sol = new Sol4_구슬을_나누는_경우의_수();
        System.out.println(sol.solution(3, 2));
        System.out.println(sol.solution(5, 3));
    }
}

/*
테스트 1 〉	통과 (1.47ms, 78.9MB)
테스트 2 〉	통과 (2.26ms, 76.9MB)
테스트 3 〉	통과 (2.44ms, 77.4MB)
테스트 4 〉	통과 (2.26ms, 70.8MB)
테스트 5 〉	통과 (1.31ms, 83.9MB)
테스트 6 〉	통과 (0.95ms, 73.2MB)
테스트 7 〉	통과 (1.18ms, 64.4MB)
테스트 8 〉	통과 (0.94ms, 66.4MB)
테스트 9 〉	통과 (1.15ms, 75.5MB)
테스트 10 〉	통과 (5.96ms, 93.2MB)
테스트 11 〉	통과 (0.73ms, 88.5MB)
테스트 12 〉	통과 (1.05ms, 81.9MB)
테스트 13 〉	통과 (0.70ms, 67.8MB)
테스트 14 〉	통과 (0.97ms, 74.9MB)
테스트 15 〉	통과 (1.12ms, 74.1MB)
테스트 16 〉	통과 (1.19ms, 74.6MB)
테스트 17 〉	통과 (1.12ms, 71.6MB)
테스트 18 〉	통과 (1.22ms, 72.4MB)
테스트 19 〉	통과 (0.85ms, 74.7MB)
테스트 20 〉	통과 (1.44ms, 73.7MB)
테스트 21 〉	통과 (1.15ms, 74.1MB)
테스트 22 〉	통과 (0.90ms, 82.4MB)
테스트 23 〉	통과 (1.12ms, 77.3MB)
테스트 24 〉	통과 (1.33ms, 70.9MB)
테스트 25 〉	통과 (1.21ms, 71.5MB)
테스트 26 〉	통과 (1.27ms, 74.8MB)
테스트 27 〉	통과 (1.46ms, 77.5MB)
테스트 28 〉	통과 (1.23ms, 67.4MB)
테스트 29 〉	통과 (1.28ms, 73.7MB)
테스트 30 〉	통과 (1.11ms, 75.6MB)
테스트 31 〉	통과 (1.24ms, 82.1MB)
테스트 32 〉	통과 (1.27ms, 84.2MB)
테스트 33 〉	통과 (1.03ms, 81.7MB)
테스트 34 〉	통과 (1.36ms, 72.4MB)
테스트 35 〉	통과 (1.57ms, 72.3MB)
 */

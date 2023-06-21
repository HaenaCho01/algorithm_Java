package Programmers.lv0.codingTestBasicsTraining.day8_조건문_문자열;

public class Sol2_주사위_게임_3 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        System.out.println(sol.solution(2, 2, 2, 2));
        System.out.println(sol.solution(4, 1, 4, 4));
        System.out.println(sol.solution(6, 3, 3, 6));
        System.out.println(sol.solution(2, 5, 2, 6));
        System.out.println(sol.solution(6, 4, 2, 5));
    }
}

class Solution2 {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        if (a == b && b == c && c == d) {
            p = a;
            answer = 1111 * p;
        } else if ((a == b && b == c) || (a == b && b == d) || (a == c && c == d) || (b == c && c == d)) {
            if (a == b && b == c) {
                p = a; q = d;
            } else if (a == b && b == d){
                p = a; q = c;
            } else if (a == c && c == d) {
                p = a; q = b;
            } else if (b == c && c == d) {
                p = b; q = a;
            }
            answer = (10 * p + q) * (10 * p + q);
        } else if ((a == b) || (a == c) || (a == d) || (b == c) || (b == d) || (c == d)) {
            if (a == b) {
                p = a; q = c; r = d;
            } else if (a == c) {
                p = a; q = b; r = d;
            } else if (a == d) {
                p = a; q = b; r = c;
            } else if (b == c) {
                p = b; q = a; r = d;
            } else if (b == d) {
                p = b; q = a; r = c;
            } else if (c == d) {
                p = c; q = a; r = b;
            }

            if (q == r) {
                answer = (p + q) * Math.abs(p - q);
            } else if (q != r) {
                answer = q * r;
            }
        } else {
            answer = Math.min(Math.min(a, b), Math.min(c, d));
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 75.8MB)
테스트 2 〉	통과 (0.01ms, 81.8MB)
테스트 3 〉	통과 (0.03ms, 63.8MB)
테스트 4 〉	통과 (0.01ms, 75.2MB)
테스트 5 〉	통과 (0.02ms, 73.5MB)
테스트 6 〉	통과 (0.02ms, 74.3MB)
테스트 7 〉	통과 (0.03ms, 75MB)
테스트 8 〉	통과 (0.04ms, 76.3MB)
테스트 9 〉	통과 (0.03ms, 78.3MB)
테스트 10 〉	통과 (0.02ms, 72.4MB)
테스트 11 〉	통과 (0.03ms, 79MB)
테스트 12 〉	통과 (0.03ms, 78MB)
테스트 13 〉	통과 (0.05ms, 78.9MB)
테스트 14 〉	통과 (0.02ms, 76.8MB)
테스트 15 〉	통과 (0.03ms, 73.1MB)
테스트 16 〉	통과 (0.01ms, 72.1MB)
테스트 17 〉	통과 (0.03ms, 79.6MB)
테스트 18 〉	통과 (0.03ms, 69.7MB)
테스트 19 〉	통과 (0.06ms, 71.1MB)
테스트 20 〉	통과 (0.79ms, 76.7MB)
테스트 21 〉	통과 (0.03ms, 72.9MB)
테스트 22 〉	통과 (0.03ms, 70.4MB)
테스트 23 〉	통과 (0.03ms, 77MB)
테스트 24 〉	통과 (0.03ms, 79.3MB)
테스트 25 〉	통과 (0.04ms, 79.4MB)
테스트 26 〉	통과 (0.02ms, 74.2MB)
테스트 27 〉	통과 (0.02ms, 77.6MB)
테스트 28 〉	통과 (0.03ms, 79.9MB)
테스트 29 〉	통과 (0.02ms, 82.5MB)
테스트 30 〉	통과 (0.08ms, 92MB)
테스트 31 〉	통과 (0.02ms, 75.9MB)
테스트 32 〉	통과 (0.03ms, 77.1MB)
테스트 33 〉	통과 (0.02ms, 74.2MB)
테스트 34 〉	통과 (0.02ms, 71.6MB)
테스트 35 〉	통과 (0.05ms, 67.7MB)
테스트 36 〉	통과 (0.02ms, 76.6MB)
테스트 37 〉	통과 (0.03ms, 77.8MB)
테스트 38 〉	통과 (0.03ms, 67.5MB)
테스트 39 〉	통과 (0.03ms, 79.3MB)
테스트 40 〉	통과 (0.03ms, 68.9MB)
테스트 41 〉	통과 (0.02ms, 75.4MB)
테스트 42 〉	통과 (0.01ms, 74MB)
 */

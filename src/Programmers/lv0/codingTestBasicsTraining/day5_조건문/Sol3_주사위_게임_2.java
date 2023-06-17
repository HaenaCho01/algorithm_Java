package Programmers.lv0.codingTestBasicsTraining.day5_조건문;

public class Sol3_주사위_게임_2 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(sol.solution(2, 6, 1));
        System.out.println(sol.solution(5, 3, 3));
        System.out.println(sol.solution(4, 4, 4));
    }
}

class Solution3 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a != b && b != c && a != c) {
            answer = a + b + c;
        } else if (a == b && b == c) {
            answer = (a + b + c) * ((a*a) + (b*b) + (c*c)) * ((a*a*a) + (b*b*b) + (c*c*c));
        } else {
            answer = (a + b + c) * ((a*a) + (b*b) + (c*c));
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.01ms, 66.7MB)
테스트 2 〉	통과 (0.01ms, 78.2MB)
테스트 3 〉	통과 (0.02ms, 70.7MB)
테스트 4 〉	통과 (0.03ms, 80.9MB)
테스트 5 〉	통과 (0.01ms, 76.5MB)
테스트 6 〉	통과 (0.03ms, 73.4MB)
테스트 7 〉	통과 (0.02ms, 76.3MB)
테스트 8 〉	통과 (0.02ms, 80.3MB)
테스트 9 〉	통과 (0.02ms, 78.4MB)
테스트 10 〉	통과 (0.03ms, 81.5MB)
테스트 11 〉	통과 (0.02ms, 77.6MB)
테스트 12 〉	통과 (0.03ms, 73.5MB)
테스트 13 〉	통과 (0.02ms, 78.3MB)
테스트 14 〉	통과 (0.02ms, 78MB)
테스트 15 〉	통과 (0.02ms, 73.8MB)
테스트 16 〉	통과 (0.02ms, 71MB)
테스트 17 〉	통과 (0.02ms, 71.8MB)
테스트 18 〉	통과 (0.02ms, 74.1MB)
테스트 19 〉	통과 (0.02ms, 66.8MB)
테스트 20 〉	통과 (0.02ms, 79.4MB)
테스트 21 〉	통과 (0.02ms, 67.5MB)
테스트 22 〉	통과 (0.01ms, 71.1MB)
테스트 23 〉	통과 (0.02ms, 77.6MB)
테스트 24 〉	통과 (0.01ms, 78.1MB)
테스트 25 〉	통과 (0.02ms, 67.4MB)
테스트 26 〉	통과 (0.01ms, 78MB)
테스트 27 〉	통과 (0.03ms, 73.3MB)
테스트 28 〉	통과 (0.02ms, 74.6MB)
테스트 29 〉	통과 (0.02ms, 69.1MB)
테스트 30 〉	통과 (0.02ms, 80.1MB)
테스트 31 〉	통과 (0.03ms, 79.4MB)
테스트 32 〉	통과 (0.03ms, 71.7MB)
테스트 33 〉	통과 (0.02ms, 73.3MB)
테스트 34 〉	통과 (0.02ms, 79.4MB)
테스트 35 〉	통과 (0.01ms, 78.2MB)
테스트 36 〉	통과 (0.03ms, 68.5MB)
테스트 37 〉	통과 (0.02ms, 80.8MB)
테스트 38 〉	통과 (0.02ms, 74.2MB)
테스트 39 〉	통과 (0.01ms, 74.6MB)
테스트 40 〉	통과 (0.02ms, 77.5MB)
테스트 41 〉	통과 (0.04ms, 79.3MB)
테스트 42 〉	통과 (0.02ms, 73.6MB)
테스트 43 〉	통과 (0.02ms, 74.5MB)
테스트 44 〉	통과 (0.02ms, 79.9MB)
테스트 45 〉	통과 (0.02ms, 73.3MB)
테스트 46 〉	통과 (0.03ms, 81.6MB)
테스트 47 〉	통과 (0.02ms, 78MB)
테스트 48 〉	통과 (0.02ms, 77.4MB)
테스트 49 〉	통과 (0.02ms, 74.1MB)
테스트 50 〉	통과 (0.02ms, 77.4MB)
테스트 51 〉	통과 (0.02ms, 83.6MB)
테스트 52 〉	통과 (0.02ms, 75.2MB)
테스트 53 〉	통과 (0.04ms, 77.6MB)
테스트 54 〉	통과 (0.02ms, 72.7MB)
테스트 55 〉	통과 (0.02ms, 74MB)
테스트 56 〉	통과 (0.02ms, 76.9MB)
 */
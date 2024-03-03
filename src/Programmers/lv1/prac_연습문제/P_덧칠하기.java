package Programmers.lv1.prac_연습문제;

public class P_덧칠하기 {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int paintEndPoint = section[0] + m - 1;
        for (int i = 1; i < section.length; i++) {
            if (paintEndPoint < section[i]) {
                answer++;
                paintEndPoint = section[i] + m - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P_덧칠하기 sol = new P_덧칠하기();
        System.out.println(sol.solution(8, 4, new int[] {2, 3, 6}));
        System.out.println(sol.solution(5, 4, new int[] {1, 3}));
        System.out.println(sol.solution(4, 1, new int[] {1, 2, 3, 4}));
        System.out.println(sol.solution(5, 2, new int[] {1, 4, 5}));
    }
}

/*
테스트 1 〉	통과 (0.71ms, 83.2MB)
테스트 2 〉	통과 (1.25ms, 82.2MB)
테스트 3 〉	통과 (1.36ms, 78.5MB)
테스트 4 〉	통과 (0.02ms, 76.9MB)
테스트 5 〉	통과 (1.22ms, 85.3MB)
테스트 6 〉	통과 (0.04ms, 77.1MB)
테스트 7 〉	통과 (0.02ms, 72.9MB)
테스트 8 〉	통과 (0.50ms, 76.2MB)
테스트 9 〉	통과 (0.04ms, 75.6MB)
테스트 10 〉	통과 (0.70ms, 79.1MB)
테스트 11 〉	통과 (0.05ms, 73.3MB)
테스트 12 〉	통과 (0.83ms, 83.4MB)
테스트 13 〉	통과 (2.12ms, 82.4MB)
테스트 14 〉	통과 (0.75ms, 75.4MB)
테스트 15 〉	통과 (0.02ms, 76.8MB)
테스트 16 〉	통과 (0.41ms, 85.6MB)
테스트 17 〉	통과 (1.47ms, 78.9MB)
테스트 18 〉	통과 (0.04ms, 70.6MB)
테스트 19 〉	통과 (0.74ms, 76.1MB)
테스트 20 〉	통과 (0.46ms, 75.1MB)
테스트 21 〉	통과 (0.73ms, 81.8MB)
테스트 22 〉	통과 (0.78ms, 76.6MB)
테스트 23 〉	통과 (0.80ms, 76.8MB)
테스트 24 〉	통과 (0.02ms, 71MB)
테스트 25 〉	통과 (1.19ms, 79.8MB)
테스트 26 〉	통과 (0.55ms, 85.1MB)
테스트 27 〉	통과 (0.25ms, 83.4MB)
테스트 28 〉	통과 (0.03ms, 72.7MB)
테스트 29 〉	통과 (0.03ms, 79.6MB)
테스트 30 〉	통과 (0.03ms, 77.4MB)
테스트 31 〉	통과 (0.03ms, 69.8MB)
테스트 32 〉	통과 (0.03ms, 78.6MB)
테스트 33 〉	통과 (0.02ms, 76.2MB)
테스트 34 〉	통과 (0.03ms, 72.5MB)
테스트 35 〉	통과 (0.88ms, 87.4MB)
테스트 36 〉	통과 (0.02ms, 74.8MB)
테스트 37 〉	통과 (0.43ms, 77.2MB)
테스트 38 〉	통과 (0.03ms, 77.7MB)
테스트 39 〉	통과 (0.44ms, 78MB)
테스트 40 〉	통과 (0.04ms, 74.2MB)
테스트 41 〉	통과 (1.17ms, 82.9MB)
테스트 42 〉	통과 (0.03ms, 75MB)
테스트 43 〉	통과 (0.03ms, 78.6MB)
테스트 44 〉	통과 (0.03ms, 79.7MB)
테스트 45 〉	통과 (0.78ms, 86.6MB)
테스트 46 〉	통과 (0.12ms, 72.9MB)
테스트 47 〉	통과 (0.93ms, 81.7MB)
테스트 48 〉	통과 (0.40ms, 79.1MB)
테스트 49 〉	통과 (1.00ms, 79.8MB)
테스트 50 〉	통과 (1.27ms, 76.5MB)
 */
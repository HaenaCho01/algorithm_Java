package Programmers.lv0.codingTestIntroduction.day8_배열_구현_수학;

import java.util.stream.IntStream;

public class Sol4_순서쌍의_개수 {
    public int solution(int n) {
        // 순서쌍은 약수의 개수와 같으므로 약수의 개수를 구하기
        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) cnt++;
            else if (n % i == 0) cnt += 2;
        }
        return cnt;
    }

    public int solutionOther(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }

    public static void main(String[] args) {
        Sol4_순서쌍의_개수 sol = new Sol4_순서쌍의_개수();
        System.out.println(sol.solution(20));
        System.out.println(sol.solutionOther(100));
    }
}

/*
테스트 1 〉	통과 (0.02ms, 74MB)
테스트 2 〉	통과 (0.03ms, 73.3MB)
테스트 3 〉	통과 (0.02ms, 79.7MB)
테스트 4 〉	통과 (0.02ms, 74.9MB)
테스트 5 〉	통과 (0.03ms, 74.8MB)
테스트 6 〉	통과 (0.06ms, 79.7MB)
테스트 7 〉	통과 (0.03ms, 71.4MB)
테스트 8 〉	통과 (0.02ms, 72.2MB)
테스트 9 〉	통과 (0.07ms, 71.6MB)
테스트 10 〉	통과 (0.06ms, 76.1MB)
 */

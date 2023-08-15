package Programmers.lv1.challenge_월간코드챌린지;

import java.util.Arrays;

public class P_없는_숫자_더하기 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        for (int i = 0, index = 0; i <= 9; i++) {
            if (i != numbers[index]) {
                answer += i;
            }
            if (i == numbers[index]) {
                if (index < numbers.length - 1) {
                    index++;
                }
            }
        }
        return answer;
    }

/*
테스트 1 〉	통과 (0.35ms, 70.7MB)
테스트 2 〉	통과 (0.49ms, 75.6MB)
테스트 3 〉	통과 (0.34ms, 74.6MB)
테스트 4 〉	통과 (0.46ms, 73.7MB)
테스트 5 〉	통과 (0.39ms, 75.4MB)
테스트 6 〉	통과 (0.46ms, 78.4MB)
테스트 7 〉	통과 (0.46ms, 75.8MB)
테스트 8 〉	통과 (0.48ms, 78.4MB)
테스트 9 〉	통과 (0.35ms, 72.3MB)
 */

    public static void main(String[] args) {
        P_없는_숫자_더하기 sol = new P_없는_숫자_더하기();
        System.out.println(sol.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0})); // 14
        System.out.println(sol.solution(new int[]{5,8,4,0,6,7,9})); // 6
    }
}

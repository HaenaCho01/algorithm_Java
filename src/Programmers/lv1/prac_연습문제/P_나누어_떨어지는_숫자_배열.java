package Programmers.lv1.prac_연습문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P_나누어_떨어지는_숫자_배열 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }

        Collections.sort(list);

        int answerSize = list.size() == 0? 1 : list.size();
        int[] answer = new int[answerSize];
        if (list.size() == 0) {
            answer[0] = -1;
        } else {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
        }
        return answer;
    }

/*
테스트 1 〉	통과 (0.21ms, 74.8MB)
테스트 2 〉	통과 (0.25ms, 77.2MB)
테스트 3 〉	통과 (0.26ms, 81MB)
테스트 4 〉	통과 (0.20ms, 76.2MB)
테스트 5 〉	통과 (0.29ms, 73.8MB)
테스트 6 〉	통과 (1.59ms, 81.2MB)
테스트 7 〉	통과 (0.26ms, 69MB)
테스트 8 〉	통과 (0.23ms, 78.4MB)
테스트 9 〉	통과 (0.24ms, 76MB)
테스트 10 〉	통과 (0.61ms, 77.3MB)
테스트 11 〉	통과 (0.23ms, 74.2MB)
테스트 12 〉	통과 (0.21ms, 84.9MB)
테스트 13 〉	통과 (0.28ms, 77.7MB)
테스트 14 〉	통과 (0.41ms, 76.7MB)
테스트 15 〉	통과 (0.36ms, 75.7MB)
테스트 16 〉	통과 (0.23ms, 74.8MB)
 */

    public static void main(String[] args) {
        P_나누어_떨어지는_숫자_배열 sol = new P_나누어_떨어지는_숫자_배열();
        System.out.println(Arrays.toString(sol.solution(new int[]{5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(sol.solution(new int[]{2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(sol.solution(new int[]{3, 2, 6}, 10)));
    }
}

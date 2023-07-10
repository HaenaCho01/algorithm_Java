package Programmers.lv0.codingTestIntroduction.day6_문자열_반복문_출력_배열_조건문;

import java.util.Arrays;

public class Sol3_짝수_홀수_개수 {
    public int[] solution(int[] num_list) {
        int evenCnt = 0; // 짝수 개수
        int oddCnt = 0; // 홀수 개수
        for (int i : num_list) {
            if (i % 2 == 0) {
                evenCnt++;
            } else {
                oddCnt++;
            }
        }
        return new int[] {evenCnt, oddCnt};
    }

    public int[] solutionOther(int[] num_list) {
        int[] answer = new int[2];
        for(int i = 0; i < num_list.length; i++) {
            answer[num_list[i] % 2]++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol3_짝수_홀수_개수 sol = new Sol3_짝수_홀수_개수();
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(sol.solutionOther(new int[]{1, 3, 5, 7})));
    }
}

/*
테스트 1 〉	통과 (0.02ms, 85.4MB)
테스트 2 〉	통과 (0.02ms, 73.6MB)
테스트 3 〉	통과 (0.02ms, 70.3MB)
테스트 4 〉	통과 (0.03ms, 74.6MB)
테스트 5 〉	통과 (0.02ms, 70.7MB)
 */

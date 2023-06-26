package Programmers.lv0.codingTestBasicsTraining.day15_리스트배열_문자열;

import java.util.Arrays;

class Solution2 {
    public int solution(int[] arr) {
        int cnt = 0;
        // 처음 배열과 똑같은 배열 만들기
        int[] afterArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            afterArr[i] = arr[i];
        }

        while (true) {
            // 바뀐 배열 만들기
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    afterArr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    afterArr[i] = (arr[i] * 2) + 1;
                }
            }

            // 바뀐 배열과 이전 배열 비교 후 같으면 멈추고, 다르면 비교 배열을 같은 상태로 만들어주기
            if (Arrays.equals(arr, afterArr)) {
                break;
            } else {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = afterArr[i];
                }
                cnt++;
            }
        }
        return cnt;
    }
}

/*
테스트 1 〉	통과 (0.07ms, 81.3MB)
테스트 2 〉	통과 (0.04ms, 81.3MB)
테스트 3 〉	통과 (0.04ms, 72MB)
테스트 4 〉	통과 (0.17ms, 68.8MB)
테스트 5 〉	통과 (0.05ms, 78.9MB)
테스트 6 〉	통과 (0.09ms, 70.6MB)
테스트 7 〉	통과 (0.68ms, 75.4MB)
테스트 8 〉	통과 (0.73ms, 82.5MB)
테스트 9 〉	통과 (0.39ms, 76.6MB)
테스트 10 〉	통과 (90.27ms, 138MB)
테스트 11 〉	통과 (22.13ms, 89.4MB)
테스트 12 〉	통과 (0.04ms, 83.7MB)
테스트 13 〉	통과 (0.05ms, 73.7MB)
 */

public class Sol2_조건에_맞게_수열_변환하기_2 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        System.out.println(sol.solution(new int[]{1, 2, 3, 100, 99, 98}));
    }
}

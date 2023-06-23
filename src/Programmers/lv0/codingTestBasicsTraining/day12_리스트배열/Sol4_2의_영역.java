package Programmers.lv0.codingTestBasicsTraining.day12_리스트배열;

import java.util.ArrayList;
import java.util.List;

class Solution4 {
    public int[] solution(int[] arr) {
        List<Integer> numList = new ArrayList<>();

        int start = 0; int end = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                start = i;
                break;
            }
        }

        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == 2) {
                end = i;
                break;
            }
        }

        for (int i = start; i <= end; i++) {
            numList.add(arr[i]);
        }

        if (numList.size() == 1 && numList.get(0) != 2) {
            numList.set(0, -1);
        }

        int[] answer = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }
        return answer;
    }
}


public class Sol4_2의_영역 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        for (int i : sol.solution(new int[]{1, 2, 1, 4, 5, 2, 9})) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : sol.solution(new int[]{1, 2, 1})) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : sol.solution(new int[]{1, 1, 1})) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : sol.solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1})) {
            System.out.print(i + " ");
        }
    }
}

/*
테스트 1 〉	통과 (1.54ms, 84.2MB)
테스트 2 〉	통과 (0.92ms, 86.2MB)
테스트 3 〉	통과 (4.29ms, 92.4MB)
테스트 4 〉	통과 (11.76ms, 94.7MB)
테스트 5 〉	통과 (7.79ms, 108MB)
테스트 6 〉	통과 (2.65ms, 86.6MB)
테스트 7 〉	통과 (7.66ms, 107MB)
테스트 8 〉	통과 (6.66ms, 99.4MB)
테스트 9 〉	통과 (3.32ms, 93.7MB)
테스트 10 〉	통과 (7.59ms, 102MB)
테스트 11 〉	통과 (4.01ms, 89MB)
테스트 12 〉	통과 (10.57ms, 95.2MB)
테스트 13 〉	통과 (1.79ms, 80.9MB)
테스트 14 〉	통과 (10.10ms, 112MB)
 */

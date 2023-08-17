package Programmers.lv1.prac_연습문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class P_명예의_전당_1 {
    public int[] solution (int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            Collections.sort(list,Collections.reverseOrder());
            if (i < k) {
                answer[i] = list.get(list.size() - 1);
            } else {
                answer[i] = list.get(k-1);
            }
        }
        return answer;
    }



/*
테스트 1 〉	통과 (0.40ms, 70.7MB)
테스트 2 〉	통과 (0.28ms, 76.4MB)
테스트 3 〉	통과 (0.37ms, 74.6MB)
테스트 4 〉	통과 (0.41ms, 72.2MB)
테스트 5 〉	통과 (0.52ms, 67.2MB)
테스트 6 〉	통과 (0.46ms, 76.6MB)
테스트 7 〉	통과 (0.74ms, 74.1MB)
테스트 8 〉	통과 (0.63ms, 83.6MB)
테스트 9 〉	통과 (0.66ms, 77.8MB)
테스트 10 〉	통과 (0.77ms, 74.2MB)
테스트 11 〉	통과 (1.43ms, 72.7MB)
테스트 12 〉	통과 (7.24ms, 75.9MB)
테스트 13 〉	통과 (4.64ms, 79.4MB)
테스트 14 〉	통과 (7.52ms, 84.3MB)
테스트 15 〉	통과 (12.88ms, 79MB)
테스트 16 〉	통과 (12.63ms, 86.7MB)
테스트 17 〉	통과 (13.14ms, 81.6MB)
테스트 18 〉	통과 (15.71ms, 81.7MB)
테스트 19 〉	통과 (10.95ms, 76.7MB)
테스트 20 〉	통과 (9.37ms, 83MB)
테스트 21 〉	통과 (9.41ms, 83.1MB)
테스트 22 〉	통과 (10.35ms, 78.8MB)
테스트 23 〉	통과 (11.88ms, 82.4MB)
테스트 24 〉	통과 (11.83ms, 81.9MB)
테스트 25 〉	통과 (9.32ms, 73.1MB)
테스트 26 〉	통과 (0.28ms, 74.2MB)
 */

    public int[] solutionOther(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int temp = 0;

        for(int i = 0; i < score.length; i++) {

            priorityQueue.add(score[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }

            answer[i] = priorityQueue.peek();
        }



        return answer;
    }

    public static void main(String[] args) {
        P_명예의_전당_1 sol = new P_명예의_전당_1();
        System.out.println(Arrays.toString(sol.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
        System.out.println(Arrays.toString(sol.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));
    }
}

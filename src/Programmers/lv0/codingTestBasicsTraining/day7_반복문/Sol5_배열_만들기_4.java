package Programmers.lv0.codingTestBasicsTraining.day7_반복문;

import java.util.ArrayList;
import java.util.List;

public class Sol5_배열_만들기_4 {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        for (int a : sol.solution(new int[] {1, 4, 2, 5, 3})) {
            System.out.print(a + " ");
        }
    }
}

class Solution5 {
    public int[] solution(int[] arr) {
        List<Integer> stkList = new ArrayList<>();
        for (int i = 0; i < arr.length;) {
            if (stkList.size() == 0) {
                stkList.add(arr[i]);
                i++;
            } else {
                if (stkList.get(stkList.size() - 1) < arr[i]) {
                    stkList.add(arr[i]); i++;
                } else if (stkList.get(stkList.size() - 1) >= arr[i]) {
                    stkList.remove(stkList.size() - 1);
                }
            }
        }
        int[] stk = stkList.stream().mapToInt(Integer::intValue).toArray();
        return stk;
    }
}

/*
테스트 1 〉	통과 (11.97ms, 77.4MB)
테스트 2 〉	통과 (61.64ms, 81MB)
테스트 3 〉	통과 (33.95ms, 95.5MB)
테스트 4 〉	통과 (41.22ms, 97MB)
테스트 5 〉	통과 (62.91ms, 92.8MB)
테스트 6 〉	통과 (16.42ms, 83.4MB)
테스트 7 〉	통과 (46.02ms, 91.9MB)
테스트 8 〉	통과 (52.37ms, 91.1MB)
테스트 9 〉	통과 (34.04ms, 91.1MB)
테스트 10 〉	통과 (37.99ms, 86.8MB)
테스트 11 〉	통과 (6.71ms, 82.9MB)
 */
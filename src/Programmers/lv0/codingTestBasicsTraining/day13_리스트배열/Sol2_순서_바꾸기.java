package Programmers.lv0.codingTestBasicsTraining.day13_리스트배열;

import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public int[] solution(int[] num_list, int n) {
        List<Integer> numList = new ArrayList<>();
        for (int i = n; i < num_list.length; i++) {
            numList.add(num_list[i]);
        }
        for (int i = 0; i < n; i++) {
            numList.add(num_list[i]);
        }

        int[] answer = new int[num_list.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numList.get(i);
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.05ms, 72.7MB)
테스트 2 〉	통과 (0.05ms, 72.2MB)
테스트 3 〉	통과 (0.05ms, 74.6MB)
테스트 4 〉	통과 (0.05ms, 73MB)
테스트 5 〉	통과 (0.04ms, 74.4MB)
테스트 6 〉	통과 (0.04ms, 76.4MB)
테스트 7 〉	통과 (0.06ms, 69.4MB)
테스트 8 〉	통과 (0.03ms, 78MB)
테스트 9 〉	통과 (0.02ms, 73.1MB)
테스트 10 〉	통과 (0.03ms, 74.8MB)
테스트 11 〉	통과 (0.05ms, 69.8MB)
테스트 12 〉	통과 (0.05ms, 73.4MB)
테스트 13 〉	통과 (0.07ms, 75.7MB)
테스트 14 〉	통과 (0.08ms, 76.2MB)
테스트 15 〉	통과 (0.05ms, 76.2MB)
테스트 16 〉	통과 (0.03ms, 75.3MB)
테스트 17 〉	통과 (0.07ms, 77.3MB)
테스트 18 〉	통과 (0.10ms, 71MB)
테스트 19 〉	통과 (0.05ms, 77.7MB)
테스트 20 〉	통과 (0.04ms, 78.1MB)
 */

public class Sol2_순서_바꾸기 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        for (int i : sol.solution(new int[]{2, 1, 6}, 1)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : sol.solution(new int[]{5,2,1,7,5}, 3)) {
            System.out.print(i + " ");
        }
    }
}

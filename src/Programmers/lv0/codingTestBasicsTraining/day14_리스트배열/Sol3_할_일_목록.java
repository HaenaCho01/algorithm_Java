package Programmers.lv0.codingTestBasicsTraining.day14_리스트배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution3 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> falseList = new ArrayList<>();
        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                falseList.add(todo_list[i]);
            }
        }
        String[] answer = new String[falseList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = falseList.get(i);
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 75.9MB)
테스트 2 〉	통과 (0.04ms, 77.3MB)
테스트 3 〉	통과 (0.02ms, 75.1MB)
테스트 4 〉	통과 (0.05ms, 79.5MB)
테스트 5 〉	통과 (0.04ms, 72.8MB)
테스트 6 〉	통과 (0.03ms, 80.6MB)
테스트 7 〉	통과 (0.06ms, 73.4MB)
테스트 8 〉	통과 (0.03ms, 76.4MB)
테스트 9 〉	통과 (0.04ms, 75MB)
테스트 10 〉	통과 (0.03ms, 70MB)
 */

public class Sol3_할_일_목록 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(Arrays.toString(sol.solution(
                new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"},
                new boolean[]{true, false, true, false})));
    }
}

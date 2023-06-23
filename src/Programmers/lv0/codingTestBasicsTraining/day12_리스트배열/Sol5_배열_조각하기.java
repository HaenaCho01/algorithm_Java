package Programmers.lv0.codingTestBasicsTraining.day12_리스트배열;

import java.util.ArrayList;
import java.util.List;

class Solution5 {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i : arr) {
            arrayList.add(i);
        }
        for (int i = 0; i < query.length; i++) {
            int flag = query[i];
            if (i % 2 == 0) {
                while (arrayList.size() != flag + 1) {
                    arrayList.remove(flag + 1);
                }
            } else {
                for (int j = 0; j < flag; j++) {
                    arrayList.remove(0);
                }
            }
        }

        int[] answer = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}

public class Sol5_배열_조각하기 {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        for (int i : sol.solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{4, 1, 2})) {
            System.out.print(i + " ");
        }
    }
}

/*
테스트 1 〉	통과 (235.11ms, 89.3MB)
테스트 2 〉	통과 (132.00ms, 101MB)
테스트 3 〉	통과 (9.39ms, 77.1MB)
테스트 4 〉	통과 (4.56ms, 75.4MB)
테스트 5 〉	통과 (30.59ms, 76.7MB)
테스트 6 〉	통과 (62.49ms, 80.5MB)
테스트 7 〉	통과 (117.36ms, 89.8MB)
테스트 8 〉	통과 (13.79ms, 79.7MB)
테스트 9 〉	통과 (45.47ms, 89MB)
테스트 10 〉	통과 (2.76ms, 81.7MB)
테스트 11 〉	통과 (2.28ms, 74.6MB)
 */
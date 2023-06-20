package Programmers.lv0.codingTestBasicsTraining.day7_반복문;

import java.util.ArrayList;
import java.util.List;

public class Sol4_콜라츠_수열_만들기 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        for (int a : sol.solution(10)) {
            System.out.print(a + " ");
        }
    }
}

class Solution4 {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        while (n != 1) {
            if (n % 2 == 0) {
                list.add(n);
                n = n / 2;
            } else if (n % 2 == 1) {
                list.add(n);
                n = 3 * n + 1;
            }
        }
        list.add(1);
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

/*
테스트 1 〉	통과 (2.26ms, 82.8MB)
테스트 2 〉	통과 (1.86ms, 66.8MB)
테스트 3 〉	통과 (1.90ms, 64.9MB)
테스트 4 〉	통과 (3.49ms, 73.8MB)
테스트 5 〉	통과 (2.59ms, 83.3MB)
테스트 6 〉	통과 (1.92ms, 80.3MB)
테스트 7 〉	통과 (2.68ms, 80.4MB)
테스트 8 〉	통과 (2.32ms, 75.9MB)
테스트 9 〉	통과 (2.01ms, 73.1MB)
테스트 10 〉	통과 (3.82ms, 78MB)
테스트 11 〉	통과 (2.06ms, 78.1MB)
 */
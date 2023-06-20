package Programmers.lv0.codingTestBasicsTraining.day7_반복문;

import java.util.ArrayList;
import java.util.List;

public class Sol2_배열_만들기_2 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        for (int a : sol.solution(5,555)) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a : sol.solution(10,20)) {
            System.out.print(a + " ");
        }
    }
}

class Solution2 {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String[] cut = Integer.toString(i).split("");
            int count = 0;
            for (int j = 0; j < cut.length; j++) {
                if(cut[j].equals("5")|| cut[j].equals("0")) {
                    count++;
                }
            }
            if (count == cut.length) {
                list.add(i);
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        int[] empty = {-1};
        if(answer.length == 0) return empty;
        return answer;
    }
}

/*
테스트 1 〉	통과 (7.77ms, 76.1MB)
테스트 2 〉	통과 (16.62ms, 79.7MB)
테스트 3 〉	통과 (75.31ms, 118MB)
테스트 4 〉	통과 (54.06ms, 118MB)
테스트 5 〉	통과 (27.22ms, 105MB)
테스트 6 〉	통과 (16.88ms, 81MB)
테스트 7 〉	통과 (123.11ms, 153MB)
테스트 8 〉	통과 (152.30ms, 179MB)
테스트 9 〉	통과 (248.05ms, 249MB)
테스트 10 〉	통과 (623.36ms, 405MB)
테스트 11 〉	통과 (115.36ms, 153MB)
테스트 12 〉	통과 (3.90ms, 75.3MB)
테스트 13 〉	통과 (6.80ms, 76.1MB)
테스트 14 〉	통과 (33.33ms, 113MB)
테스트 15 〉	통과 (16.90ms, 96.1MB)
테스트 16 〉	통과 (7.41ms, 77.9MB)
테스트 17 〉	통과 (13.13ms, 84.9MB)
테스트 18 〉	통과 (144.29ms, 143MB)
테스트 19 〉	통과 (38.86ms, 111MB)
테스트 20 〉	통과 (138.21ms, 167MB)
테스트 21 〉	통과 (558.46ms, 392MB)
테스트 22 〉	통과 (99.86ms, 129MB)
 */
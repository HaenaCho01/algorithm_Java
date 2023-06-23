package Programmers.lv0.codingTestBasicsTraining.day12_리스트배열;

import java.util.ArrayList;
import java.util.List;

class Solution1 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0]; int b = slicer[1]; int c = slicer[2];
        List<Integer> sliceList = new ArrayList<>();
        switch (n) {
            case 1 :
                for(int i = 0; i <= b; i++) {
                    sliceList.add(num_list[i]);
                }
                break;
            case 2 :
                for (int i = a; i < num_list.length; i++) {
                    sliceList.add(num_list[i]);
                }
                break;
            case 3 :
                for (int i = a; i <= b; i++) {
                    sliceList.add(num_list[i]);
                }
                break;
            case 4 :
                for (int i = a; i <= b;) {
                        sliceList.add(num_list[i]);
                    i += c;
                }
                break;
        }
        int[] answer = new int[sliceList.size()];
        for (int i = 0; i < sliceList.size(); i++) {
            answer[i] = sliceList.get(i);
        }
        return answer;
    }
}

public class Sol1_리스트_자르기 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        for (int i : sol.solution(3, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : sol.solution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})) {
            System.out.print(i + " ");
        }
    }
}

/*
테스트 1 〉	통과 (0.04ms, 75.5MB)
테스트 2 〉	통과 (0.03ms, 71.3MB)
테스트 3 〉	통과 (0.02ms, 71.8MB)
테스트 4 〉	통과 (0.02ms, 67.5MB)
테스트 5 〉	통과 (0.05ms, 74.6MB)
테스트 6 〉	통과 (0.03ms, 76.4MB)
테스트 7 〉	통과 (0.06ms, 75.7MB)
테스트 8 〉	통과 (0.04ms, 72.5MB)
테스트 9 〉	통과 (0.05ms, 73.9MB)
테스트 10 〉	통과 (0.05ms, 81.3MB)
테스트 11 〉	통과 (0.02ms, 74.1MB)
테스트 12 〉	통과 (0.03ms, 65.5MB)
테스트 13 〉	통과 (0.03ms, 75.8MB)
테스트 14 〉	통과 (0.04ms, 76.4MB)
테스트 15 〉	통과 (0.04ms, 76.1MB)
테스트 16 〉	통과 (0.05ms, 71.8MB)
테스트 17 〉	통과 (0.04ms, 80.3MB)
테스트 18 〉	통과 (0.04ms, 77.5MB)
테스트 19 〉	통과 (0.03ms, 70.7MB)
 */

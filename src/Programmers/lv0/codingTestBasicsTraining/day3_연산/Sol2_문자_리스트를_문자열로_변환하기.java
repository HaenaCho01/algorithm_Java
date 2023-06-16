package Programmers.lv0.codingTestBasicsTraining.day3_연산;

import java.util.Scanner;

public class Sol2_문자_리스트를_문자열로_변환하기 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        String[] arr = {"a", "b", "c"};
        System.out.println(sol.solution(arr));
    }
}

class Solution2 {
    public String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        String answer = sb.toString();
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.04ms, 78MB)
테스트 2 〉	통과 (0.03ms, 72.6MB)
테스트 3 〉	통과 (0.06ms, 76.8MB)
테스트 4 〉	통과 (0.03ms, 73.6MB)
테스트 5 〉	통과 (0.05ms, 72.1MB)
테스트 6 〉	통과 (0.03ms, 76.7MB)
테스트 7 〉	통과 (0.07ms, 78.1MB)
테스트 8 〉	통과 (0.02ms, 73.5MB)
테스트 9 〉	통과 (0.05ms, 72.5MB)
테스트 10 〉	통과 (0.02ms, 73.8MB)
테스트 11 〉	통과 (0.04ms, 75.2MB)
테스트 12 〉	통과 (0.03ms, 76.5MB)
테스트 13 〉	통과 (0.04ms, 73.4MB)
테스트 14 〉	통과 (0.04ms, 83MB)
테스트 15 〉	통과 (0.04ms, 75.2MB)
 */

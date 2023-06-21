package Programmers.lv0.codingTestBasicsTraining.day8_조건문_문자열;

public class Sol5_문자열_여러_번_뒤집기 {
    public static void main(String[] args) {
        Solution5 sol= new Solution5();
        System.out.println(sol.solution("rermgorpsam", new int[][] {{2, 3}, {0, 7}, {5, 9}, {6, 10}}));
    }
}

class Solution5 {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        StringBuilder reverse = new StringBuilder();
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0]; int end = queries[i][1];
            for (int j = start; j <= end; j++) { // 뒤집을 문자를 새로 만들기
                reverse.append(sb.charAt(j));
            }
            reverse.reverse(); // 뒤집기
            for (int j = start, k = 0; j <= end; j++, k++) {
                sb.setCharAt(j, reverse.charAt(k)); // 뒤집은 문자를 문자열에 바꿔 넣기
            }
        }
        return sb.toString();
    }
}

/*
테스트 1 〉	통과 (0.15ms, 81MB)
테스트 2 〉	통과 (0.49ms, 74MB)
테스트 3 〉	통과 (1.09ms, 79.2MB)
테스트 4 〉	통과 (3.96ms, 79.1MB)
테스트 5 〉	통과 (11.37ms, 79.3MB)
테스트 6 〉	통과 (0.59ms, 81.8MB)
테스트 7 〉	통과 (0.89ms, 69.5MB)
테스트 8 〉	통과 (6.12ms, 79MB)
테스트 9 〉	통과 (44.72ms, 78.3MB)
테스트 10 〉	통과 (54.61ms, 77.4MB)
테스트 11 〉	통과 (1.37ms, 71.8MB)
테스트 12 〉	통과 (2.94ms, 73.2MB)
테스트 13 〉	통과 (5.09ms, 80.2MB)
테스트 14 〉	통과 (31.36ms, 85.4MB)
테스트 15 〉	통과 (47.30ms, 85.5MB)
테스트 16 〉	통과 (2.67ms, 70.7MB)
테스트 17 〉	통과 (7.80ms, 82.3MB)
테스트 18 〉	통과 (9.16ms, 75MB)
테스트 19 〉	통과 (49.94ms, 88.8MB)
테스트 20 〉	통과 (55.62ms, 77.1MB)
테스트 21 〉	통과 (5.04ms, 77.6MB)
테스트 22 〉	통과 (7.35ms, 76MB)
테스트 23 〉	통과 (46.97ms, 90.5MB)
테스트 24 〉	통과 (57.89ms, 92.2MB)
테스트 25 〉	통과 (84.28ms, 91MB)
 */
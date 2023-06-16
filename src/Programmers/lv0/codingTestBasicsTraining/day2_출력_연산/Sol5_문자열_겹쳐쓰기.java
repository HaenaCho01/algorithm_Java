package Programmers.lv0.codingTestBasicsTraining.day2_출력_연산;

import java.util.Scanner;

public class Sol5_문자열_겹쳐쓰기 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("He11oWor1d", "lloWorl", 2));
        System.out.println(sol.solution("Program29b8UYP", "merS123", 7));
    }
}

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);
        for (int i = 0; i < overwrite_string.length(); i++) {
            sb.setCharAt(s, (char) overwrite_string.charAt(i));
            s++;
        }
        String answer = sb.toString();
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.05ms, 74MB)
테스트 2 〉	통과 (0.07ms, 76.8MB)
테스트 3 〉	통과 (0.04ms, 81.1MB)
테스트 4 〉	통과 (0.03ms, 77.2MB)
테스트 5 〉	통과 (0.05ms, 66.6MB)
테스트 6 〉	통과 (0.13ms, 71.4MB)
테스트 7 〉	통과 (0.05ms, 74.6MB)
테스트 8 〉	통과 (0.04ms, 81MB)
테스트 9 〉	통과 (0.06ms, 78.1MB)
테스트 10 〉	통과 (0.09ms, 73MB)
테스트 11 〉	통과 (0.07ms, 77.5MB)
테스트 12 〉	통과 (0.17ms, 75.7MB)
테스트 13 〉	통과 (0.08ms, 71.4MB)
테스트 14 〉	통과 (0.05ms, 75.5MB)
테스트 15 〉	통과 (0.20ms, 84.5MB)
테스트 16 〉	통과 (0.26ms, 77.1MB)
테스트 17 〉	통과 (0.35ms, 77.3MB)
테스트 18 〉	통과 (0.05ms, 74.1MB)
 */

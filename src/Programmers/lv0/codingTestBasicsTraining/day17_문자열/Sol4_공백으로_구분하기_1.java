package Programmers.lv0.codingTestBasicsTraining.day17_문자열;

import java.util.Arrays;

class Solution4 {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.22ms, 83MB)
테스트 2 〉	통과 (0.10ms, 73MB)
테스트 3 〉	통과 (0.09ms, 77.3MB)
테스트 4 〉	통과 (0.09ms, 76.8MB)
테스트 5 〉	통과 (0.02ms, 76.7MB)
테스트 6 〉	통과 (0.10ms, 73.2MB)
테스트 7 〉	통과 (0.02ms, 80.2MB)
 */

public class Sol4_공백으로_구분하기_1 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        System.out.println(Arrays.toString(sol.solution("i love you")));
        System.out.println(Arrays.toString(sol.solution("programmers")));
    }
}

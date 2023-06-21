package Programmers.lv0.codingTestBasicsTraining.day8_조건문_문자열;

public class Sol3_글자_이어_붙여_문자열_만들기 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(sol.solution("cvsgiorszzzmrpaqpe", new int[] {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}));
        System.out.println(sol.solution("zpiaz", new int[] {1, 2, 0, 0, 3}));
    }
}

class Solution3 {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index_list.length; i++) {
            sb.append(my_string.charAt(index_list[i]));
        }
        return sb.toString();
    }
}

/*
테스트 1 〉	통과 (0.03ms, 72.5MB)
테스트 2 〉	통과 (0.04ms, 76.7MB)
테스트 3 〉	통과 (0.05ms, 75.8MB)
테스트 4 〉	통과 (0.07ms, 74.9MB)
테스트 5 〉	통과 (0.13ms, 74.7MB)
테스트 6 〉	통과 (0.04ms, 77.3MB)
테스트 7 〉	통과 (0.03ms, 68.5MB)
테스트 8 〉	통과 (0.04ms, 78.4MB)
테스트 9 〉	통과 (0.11ms, 75.5MB)
테스트 10 〉	통과 (0.13ms, 72.1MB)
테스트 11 〉	통과 (0.05ms, 75MB)
테스트 12 〉	통과 (0.05ms, 90.2MB)
테스트 13 〉	통과 (0.05ms, 75.3MB)
테스트 14 〉	통과 (0.14ms, 77.1MB)
테스트 15 〉	통과 (0.15ms, 66.1MB)
테스트 16 〉	통과 (0.03ms, 74.1MB)
테스트 17 〉	통과 (0.05ms, 84.9MB)
테스트 18 〉	통과 (0.06ms, 73.9MB)
테스트 19 〉	통과 (0.11ms, 76.6MB)
테스트 20 〉	통과 (0.16ms, 74.5MB)
테스트 21 〉	통과 (0.03ms, 71.6MB)
테스트 22 〉	통과 (0.06ms, 76.7MB)
테스트 23 〉	통과 (0.05ms, 76.9MB)
테스트 24 〉	통과 (0.10ms, 77.8MB)
테스트 25 〉	통과 (0.11ms, 76.6MB)
테스트 26 〉	통과 (0.10ms, 78.6MB)
테스트 27 〉	통과 (0.03ms, 72.1MB)
 */
package Programmers.lv0.codingTestBasicsTraining.day5_조건문;

public class Sol1_코드_처리하기 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        System.out.println(sol.solution("abc1abc1abc"));
    }
}

class Solution1 {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if (code.charAt(i) == '1') {
                    mode = 1;
                } else {
                    if (i % 2 == 0) {
                        ret.append(code.charAt(i));
                    }
                }
            } else if (mode == 1) {
                if (code.charAt(i) == '1') {
                    mode = 0;
                } else {
                    if (i % 2 != 0) {
                        ret.append(code.charAt(i));
                    }
                }
            }
        }
        if (ret.length() == 0) {
            ret.append("EMPTY");
        }

        String answer = ret.toString();
        return answer;
    }
}

/*
테스트 1 〉	통과 (7.85ms, 76.4MB)
테스트 2 〉	통과 (7.06ms, 79.3MB)
테스트 3 〉	통과 (1.67ms, 77MB)
테스트 4 〉	통과 (1.04ms, 74.2MB)
테스트 5 〉	통과 (3.55ms, 76.6MB)
테스트 6 〉	통과 (6.51ms, 84.4MB)
테스트 7 〉	통과 (5.08ms, 78.8MB)
테스트 8 〉	통과 (8.42ms, 94.1MB)
테스트 9 〉	통과 (5.23ms, 78.7MB)
테스트 10 〉	통과 (8.20ms, 83.2MB)
테스트 11 〉	통과 (9.25ms, 80MB)
테스트 12 〉	통과 (0.03ms, 73.7MB)
테스트 13 〉	통과 (0.03ms, 74.1MB)
 */
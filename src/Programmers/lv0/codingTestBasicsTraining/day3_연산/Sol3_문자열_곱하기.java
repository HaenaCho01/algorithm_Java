package Programmers.lv0.codingTestBasicsTraining.day3_연산;

public class Sol3_문자열_곱하기 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(sol.solution("string", 3));
        System.out.println(sol.solution("love", 10));
    }
}

class Solution3 {
    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= k; i++) {
            sb.append(my_string);
        }
        String answer = sb.toString();
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 74.7MB)
테스트 2 〉	통과 (0.04ms, 77.2MB)
테스트 3 〉	통과 (0.10ms, 74.4MB)
테스트 4 〉	통과 (0.03ms, 72MB)
테스트 5 〉	통과 (0.06ms, 77.1MB)
테스트 6 〉	통과 (0.03ms, 81.3MB)
테스트 7 〉	통과 (0.05ms, 79.3MB)
테스트 8 〉	통과 (0.03ms, 75MB)
테스트 9 〉	통과 (0.04ms, 77.6MB)
테스트 10 〉	통과 (0.04ms, 71.6MB)
테스트 11 〉	통과 (0.05ms, 73.5MB)
테스트 12 〉	통과 (0.05ms, 76.9MB)
테스트 13 〉	통과 (0.05ms, 74.4MB)
테스트 14 〉	통과 (0.05ms, 77.9MB)
테스트 15 〉	통과 (0.06ms, 83.4MB)
테스트 16 〉	통과 (0.03ms, 74.5MB)
테스트 17 〉	통과 (0.04ms, 79.4MB)
테스트 18 〉	통과 (0.05ms, 71.7MB)
테스트 19 〉	통과 (0.07ms, 70.8MB)
테스트 20 〉	통과 (0.06ms, 81.7MB)
테스트 21 〉	통과 (0.04ms, 74.6MB)
테스트 22 〉	통과 (0.04ms, 73.4MB)
테스트 23 〉	통과 (0.04ms, 77.7MB)
테스트 24 〉	통과 (0.07ms, 78.3MB)
테스트 25 〉	통과 (0.08ms, 76.7MB)
 */

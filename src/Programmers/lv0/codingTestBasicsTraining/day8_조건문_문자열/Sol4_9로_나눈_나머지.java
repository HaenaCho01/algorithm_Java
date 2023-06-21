package Programmers.lv0.codingTestBasicsTraining.day8_조건문_문자열;

public class Sol4_9로_나눈_나머지 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        System.out.println(sol.solution("123"));
        System.out.println(sol.solution("78720646226947352489"));
    }
}

class Solution4 {
    public int solution(String number) {
        int cutSum = 0;
        for (int i = 0; i < number.length(); i++) {
            cutSum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return cutSum % 9;
    }
}

/*
테스트 1 〉	통과 (0.09ms, 75MB)
테스트 2 〉	통과 (0.05ms, 78.4MB)
테스트 3 〉	통과 (0.09ms, 70.1MB)
테스트 4 〉	통과 (0.21ms, 71MB)
테스트 5 〉	통과 (0.23ms, 72.5MB)
테스트 6 〉	통과 (0.51ms, 72.2MB)
테스트 7 〉	통과 (0.88ms, 85.8MB)
테스트 8 〉	통과 (2.48ms, 77.3MB)
테스트 9 〉	통과 (0.68ms, 79MB)
테스트 10 〉	통과 (1.72ms, 74.7MB)
테스트 11 〉	통과 (2.34ms, 73.2MB)
테스트 12 〉	통과 (2.29ms, 85.2MB)
테스트 13 〉	통과 (2.29ms, 73.1MB)
테스트 14 〉	통과 (2.40ms, 77.4MB)
테스트 15 〉	통과 (3.02ms, 75.3MB)
테스트 16 〉	통과 (7.66ms, 84.2MB)
테스트 17 〉	통과 (9.19ms, 79.1MB)
테스트 18 〉	통과 (9.36ms, 75.3MB)
테스트 19 〉	통과 (12.41ms, 78.2MB)
테스트 20 〉	통과 (11.48ms, 85.9MB)
테스트 21 〉	통과 (11.77ms, 84.9MB)
테스트 22 〉	통과 (12.96ms, 91.2MB)
테스트 23 〉	통과 (16.30ms, 89.6MB)
테스트 24 〉	통과 (16.24ms, 83.7MB)
테스트 25 〉	통과 (0.03ms, 73.5MB)
 */

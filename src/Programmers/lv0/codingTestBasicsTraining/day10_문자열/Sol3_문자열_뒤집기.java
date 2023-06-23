package Programmers.lv0.codingTestBasicsTraining.day10_문자열;

class Solution3 {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();

        StringBuilder midStr = new StringBuilder(my_string.substring(s, e + 1));
        midStr.reverse();

        answer.append(my_string.substring(0,s));
        answer.append(midStr);
        answer.append(my_string.substring(e + 1));

        return answer.toString();
    }
}
public class Sol3_문자열_뒤집기 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(sol.solution("Progra21Sremm3", 6, 12));
        System.out.println(sol.solution("Stanley1yelnatS", 4, 10));
    }
}

/*

테스트 1 〉	통과 (0.05ms, 72.6MB)
테스트 2 〉	통과 (0.05ms, 71.9MB)
테스트 3 〉	통과 (0.05ms, 76.4MB)
테스트 4 〉	통과 (0.06ms, 73.3MB)
테스트 5 〉	통과 (0.04ms, 73.5MB)
테스트 6 〉	통과 (0.06ms, 85.7MB)
테스트 7 〉	통과 (0.05ms, 72.7MB)
테스트 8 〉	통과 (0.05ms, 72.9MB)
테스트 9 〉	통과 (0.14ms, 79.1MB)
테스트 10 〉	통과 (0.05ms, 71.7MB)
테스트 11 〉	통과 (0.07ms, 78.3MB)
테스트 12 〉	통과 (0.05ms, 77.5MB)
테스트 13 〉	통과 (0.05ms, 75.3MB)
테스트 14 〉	통과 (0.05ms, 81.6MB)
테스트 15 〉	통과 (0.04ms, 77.6MB)
테스트 16 〉	통과 (0.06ms, 77.3MB)
테스트 17 〉	통과 (0.05ms, 77.9MB)
테스트 18 〉	통과 (0.05ms, 74.1MB)
 */

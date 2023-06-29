package Programmers.lv0.codingTestBasicsTraining.day23_조건문활용;

class Solution1 {
	public int solution(String str1, String str2) {
		return str2.contains(str1) ? 1 : 0;
	}
}

/*
테스트 1 〉	통과 (0.04ms, 73.4MB)
테스트 2 〉	통과 (0.02ms, 71.6MB)
테스트 3 〉	통과 (0.02ms, 74MB)
테스트 4 〉	통과 (0.03ms, 73MB)
테스트 5 〉	통과 (0.03ms, 72MB)
테스트 6 〉	통과 (0.03ms, 76.9MB)
테스트 7 〉	통과 (0.02ms, 78.2MB)
테스트 8 〉	통과 (0.02ms, 84MB)
테스트 9 〉	통과 (0.03ms, 74MB)
테스트 10 〉	통과 (0.02ms, 70.6MB)
 */

public class Sol1_부분_문자열 {
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		System.out.println(sol.solution("abc", "aabcc"));
		System.out.println(sol.solution("tbt", "tbbttb"));
	}
}

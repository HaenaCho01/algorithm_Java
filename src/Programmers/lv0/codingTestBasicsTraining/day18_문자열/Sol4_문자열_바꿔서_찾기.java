package Programmers.lv0.codingTestBasicsTraining.day18_문자열;

class Solution4 {
	public int solution(String myString, String pat) {
		StringBuilder sb = new StringBuilder(myString);
		for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) == 'A') {
				sb.setCharAt(i, 'B');
			} else {
				sb.setCharAt(i, 'A');
			}
		}
		int answer = 0;
		for (int i = 0; i <= sb.length() - pat.length(); i++) {
			if (sb.substring(i, i + pat.length()).equals(pat)) {
				answer = 1;
				break;
			}
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.04ms, 76.9MB)
테스트 2 〉	통과 (0.07ms, 67.7MB)
테스트 3 〉	통과 (0.05ms, 77.1MB)
테스트 4 〉	통과 (0.06ms, 66.7MB)
테스트 5 〉	통과 (0.10ms, 73MB)
테스트 6 〉	통과 (0.04ms, 81.5MB)
테스트 7 〉	통과 (0.04ms, 78.4MB)
 */

public class Sol4_문자열_바꿔서_찾기 {
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		System.out.println(sol.solution("ABBAA", "AABB"));
		System.out.println(sol.solution("ABAB", "ABAB"));
	}
}

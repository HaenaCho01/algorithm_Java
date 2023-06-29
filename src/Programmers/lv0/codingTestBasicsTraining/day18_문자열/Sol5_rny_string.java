package Programmers.lv0.codingTestBasicsTraining.day18_문자열;

class Solution5 {
	public String solution(String rny_string) {
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < rny_string.length(); i++) {
			if (rny_string.charAt(i) == 'm') {
				answer.append("rn");
			} else {
				answer.append(rny_string.charAt(i));
			}
		}
		return answer.toString();
	}
}

/*
테스트 1 〉	통과 (0.05ms, 72.8MB)
테스트 2 〉	통과 (0.03ms, 71.7MB)
테스트 3 〉	통과 (0.03ms, 75.9MB)
테스트 4 〉	통과 (0.05ms, 75.8MB)
테스트 5 〉	통과 (0.04ms, 75MB)
테스트 6 〉	통과 (0.03ms, 73.4MB)
테스트 7 〉	통과 (0.02ms, 73.2MB)
테스트 8 〉	통과 (0.03ms, 73.7MB)
테스트 9 〉	통과 (0.04ms, 73.1MB)
테스트 10 〉	통과 (0.03ms, 70.8MB)
테스트 11 〉	통과 (0.03ms, 82.5MB)
테스트 12 〉	통과 (0.06ms, 73.1MB)
테스트 13 〉	통과 (0.05ms, 71MB)
테스트 14 〉	통과 (0.03ms, 72.8MB)
테스트 15 〉	통과 (0.04ms, 77.9MB)
테스트 16 〉	통과 (0.03ms, 72.9MB)
테스트 17 〉	통과 (0.04ms, 77.9MB)
테스트 18 〉	통과 (0.02ms, 70.6MB)
테스트 19 〉	통과 (0.04ms, 74.1MB)
테스트 20 〉	통과 (0.04ms, 73.5MB)
 */

public class Sol5_rny_string {
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		System.out.println(sol.solution("masterpiece"));
		System.out.println(sol.solution("programmers"));
		System.out.println(sol.solution("jerry"));
		System.out.println(sol.solution("burn"));
	}
}

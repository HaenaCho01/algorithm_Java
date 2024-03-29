package Programmers.lv0.codingTestBasicsTraining.day21_함수메서드;

class Solution4 {
	public int solution(String num_str) {
		int answer = 0;
		for (int i = 0; i < num_str.length(); i++) {
			answer += num_str.charAt(i) - '0';
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.04ms, 66.5MB)
테스트 2 〉	통과 (0.04ms, 66.1MB)
테스트 3 〉	통과 (0.04ms, 67.7MB)
테스트 4 〉	통과 (0.02ms, 70.1MB)
테스트 5 〉	통과 (0.03ms, 66.5MB)
테스트 6 〉	통과 (0.04ms, 73.6MB)
테스트 7 〉	통과 (0.02ms, 81.9MB)
테스트 8 〉	통과 (0.04ms, 70.7MB)
테스트 9 〉	통과 (0.03ms, 82.7MB)
테스트 10 〉	통과 (0.03ms, 70.5MB)
테스트 11 〉	통과 (0.04ms, 77.4MB)
테스트 12 〉	통과 (0.04ms, 66.5MB)
테스트 13 〉	통과 (0.03ms, 64.4MB)
테스트 14 〉	통과 (0.04ms, 69.1MB)
테스트 15 〉	통과 (0.04ms, 68.7MB)
테스트 16 〉	통과 (0.03ms, 71.8MB)
테스트 17 〉	통과 (0.06ms, 70.5MB)
테스트 18 〉	통과 (0.03ms, 86MB)
테스트 19 〉	통과 (0.03ms, 77.6MB)
 */

public class Sol4_문자열_정수의_합 {
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		System.out.println(sol.solution("123456789"));
		System.out.println(sol.solution("1000000"));
	}
}

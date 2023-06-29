package Programmers.lv0.codingTestBasicsTraining.day18_문자열;

class Solution3 {
	public int solution(String binomial) {
		String[] split = binomial.split(" ");
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[2]);
		int answer = 0;
		switch (split[1]) {
			case "+": answer = a + b; break;
			case "-": answer = a - b; break;
			case "*": answer = a * b; break;
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.08ms, 77.4MB)
테스트 2 〉	통과 (0.13ms, 72.1MB)
테스트 3 〉	통과 (0.09ms, 71.8MB)
테스트 4 〉	통과 (0.07ms, 75.7MB)
테스트 5 〉	통과 (0.08ms, 73.1MB)
테스트 6 〉	통과 (0.12ms, 81MB)
테스트 7 〉	통과 (0.12ms, 79MB)
테스트 8 〉	통과 (0.11ms, 72.6MB)
테스트 9 〉	통과 (0.09ms, 76.5MB)
테스트 10 〉	통과 (0.11ms, 79.9MB)
테스트 11 〉	통과 (0.11ms, 78MB)
테스트 12 〉	통과 (3.49ms, 78.1MB)
테스트 13 〉	통과 (0.10ms, 75.6MB)
테스트 14 〉	통과 (0.10ms, 79.5MB)
테스트 15 〉	통과 (0.10ms, 75MB)
테스트 16 〉	통과 (0.11ms, 65.1MB)
테스트 17 〉	통과 (0.12ms, 79.3MB)
테스트 18 〉	통과 (0.11ms, 75.1MB)
테스트 19 〉	통과 (0.14ms, 72.6MB)
테스트 20 〉	통과 (0.11ms, 74.8MB)
테스트 21 〉	통과 (0.09ms, 71.1MB)
테스트 22 〉	통과 (0.08ms, 73.8MB)
테스트 23 〉	통과 (0.12ms, 74.7MB)
테스트 24 〉	통과 (0.10ms, 73.6MB)
테스트 25 〉	통과 (0.08ms, 70.7MB)
테스트 26 〉	통과 (0.11ms, 75MB)
테스트 27 〉	통과 (0.11ms, 67.9MB)
테스트 28 〉	통과 (0.16ms, 74.7MB)
테스트 29 〉	통과 (0.12ms, 78.2MB)
테스트 30 〉	통과 (0.11ms, 81.3MB)
테스트 31 〉	통과 (0.13ms, 83.8MB)
 */

public class Sol3_간단한_식_계산하기 {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		System.out.println(sol.solution("43 + 12"));
		System.out.println(sol.solution("0 - 7777"));
		System.out.println(sol.solution("40000 * 40000"));
	}
}

package Programmers.lv1.prac_연습문제;

public class P_두_정수_사이의_합 {
	public long solution(int a, int b) {
		int start = Math.min(a, b);
		int end = Math.max(a, b);
		long answer = 0;
		for (int i = start; i <= end; i++) {
			answer += i;
		}
		return answer;
	}

	public static void main(String[] args) {
		P_두_정수_사이의_합 sol = new P_두_정수_사이의_합();
		System.out.println(sol.solution(3, 5));
		System.out.println(sol.solution(3, 3));
		System.out.println(sol.solution(5, 3));
	}
}

/*
테스트 1 〉	통과 (0.08ms, 73.9MB)
테스트 2 〉	통과 (0.08ms, 72.3MB)
테스트 3 〉	통과 (0.08ms, 74.5MB)
테스트 4 〉	통과 (11.83ms, 74.5MB)
테스트 5 〉	통과 (8.60ms, 66.4MB)
테스트 6 〉	통과 (12.29ms, 73.3MB)
테스트 7 〉	통과 (5.99ms, 70.6MB)
테스트 8 〉	통과 (9.65ms, 79MB)
테스트 9 〉	통과 (5.39ms, 88MB)
테스트 10 〉	통과 (7.16ms, 81.4MB)
테스트 11 〉	통과 (0.11ms, 67.3MB)
테스트 12 〉	통과 (0.24ms, 73.6MB)
테스트 13 〉	통과 (0.23ms, 85.4MB)
테스트 14 〉	통과 (0.06ms, 74MB)
테스트 15 〉	통과 (0.08ms, 75.7MB)
테스트 16 〉	통과 (0.10ms, 72.4MB)
 */
package Programmers.lv1.prac_연습문제;

public class P_약수의_합 {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) answer += i;
		}
		return answer;
	}

	public static void main(String[] args) {
		P_약수의_합 sol = new P_약수의_합();
		System.out.println(sol.solution(12));
		System.out.println(sol.solution(5));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 76.8MB)
테스트 2 〉	통과 (0.03ms, 78.6MB)
테스트 3 〉	통과 (0.04ms, 73.9MB)
테스트 4 〉	통과 (0.03ms, 72.1MB)
테스트 5 〉	통과 (0.03ms, 75.3MB)
테스트 6 〉	통과 (0.04ms, 75.6MB)
테스트 7 〉	통과 (0.05ms, 74.8MB)
테스트 8 〉	통과 (0.04ms, 78.5MB)
테스트 9 〉	통과 (0.05ms, 71.8MB)
테스트 10 〉	통과 (0.11ms, 75.7MB)
테스트 11 〉	통과 (0.03ms, 67.6MB)
테스트 12 〉	통과 (0.09ms, 72.8MB)
테스트 13 〉	통과 (0.03ms, 76.1MB)
테스트 14 〉	통과 (0.05ms, 73.4MB)
테스트 15 〉	통과 (0.08ms, 74.6MB)
테스트 16 〉	통과 (0.02ms, 71.7MB)
테스트 17 〉	통과 (0.10ms, 72.1MB)
 */
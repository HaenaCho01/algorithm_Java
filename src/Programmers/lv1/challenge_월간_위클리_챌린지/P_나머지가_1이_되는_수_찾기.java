package Programmers.lv1.challenge_월간_위클리_챌린지;

public class P_나머지가_1이_되는_수_찾기 {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 1) {
				answer = i;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		P_나머지가_1이_되는_수_찾기 sol = new P_나머지가_1이_되는_수_찾기();
		System.out.println(sol.solution(10));
		System.out.println(sol.solution(12));
	}
}

/*
테스트 1 〉	통과 (4.85ms, 73.1MB)
테스트 2 〉	통과 (0.02ms, 73MB)
테스트 3 〉	통과 (0.02ms, 80MB)
테스트 4 〉	통과 (0.03ms, 68.5MB)
테스트 5 〉	통과 (0.02ms, 74MB)
테스트 6 〉	통과 (0.03ms, 74.3MB)
테스트 7 〉	통과 (0.05ms, 70.8MB)
테스트 8 〉	통과 (0.03ms, 72.7MB)
테스트 9 〉	통과 (0.02ms, 74.1MB)
테스트 10 〉	통과 (0.02ms, 77.4MB)
테스트 11 〉	통과 (0.01ms, 73.4MB)
 */
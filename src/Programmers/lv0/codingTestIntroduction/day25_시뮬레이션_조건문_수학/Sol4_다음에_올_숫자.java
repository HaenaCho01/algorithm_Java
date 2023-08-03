package Programmers.lv0.codingTestIntroduction.day25_시뮬레이션_조건문_수학;

public class Sol4_다음에_올_숫자 {
	public int solution(int[] common) {
		int answer = 0;
		if (common[2] - common[1] == common[1] - common[0]) {
			answer = common[common.length - 1] + (common[1] - common[0]);
		} else {
			answer = common[common.length - 1] * (common[1] / common[0]);
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol4_다음에_올_숫자 sol = new Sol4_다음에_올_숫자();
		System.out.println(sol.solution(new int[]{1, 2, 3, 4}));
		System.out.println(sol.solution(new int[]{2, 4, 8}));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 67.3MB)
테스트 2 〉	통과 (0.01ms, 71.4MB)
테스트 3 〉	통과 (0.02ms, 73.1MB)
테스트 4 〉	통과 (0.01ms, 73.6MB)
테스트 5 〉	통과 (0.02ms, 74.4MB)
테스트 6 〉	통과 (0.02ms, 78.2MB)
테스트 7 〉	통과 (0.01ms, 73.5MB)
테스트 8 〉	통과 (0.01ms, 73.8MB)
테스트 9 〉	통과 (0.03ms, 73.1MB)
 */
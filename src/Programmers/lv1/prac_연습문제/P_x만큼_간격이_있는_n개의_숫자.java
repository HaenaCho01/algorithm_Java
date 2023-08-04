package Programmers.lv1.prac_연습문제;

import java.util.Arrays;

public class P_x만큼_간격이_있는_n개의_숫자 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		answer[0] = x;
		for (int i = 1; i < answer.length; i++) {
			answer[i] = answer[i - 1] + x;
		}
		return answer;
	}

	public static void main(String[] args) {
		P_x만큼_간격이_있는_n개의_숫자 sol = new P_x만큼_간격이_있는_n개의_숫자();
		System.out.println(Arrays.toString(sol.solution(2, 5)));
		System.out.println(Arrays.toString(sol.solution(4, 3)));
		System.out.println(Arrays.toString(sol.solution(-4, 2)));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 72.6MB)
테스트 2 〉	통과 (0.01ms, 76MB)
테스트 3 〉	통과 (0.03ms, 79.5MB)
테스트 4 〉	통과 (0.03ms, 73.2MB)
테스트 5 〉	통과 (0.02ms, 70.2MB)
테스트 6 〉	통과 (0.02ms, 74.1MB)
테스트 7 〉	통과 (0.03ms, 79.9MB)
테스트 8 〉	통과 (0.03ms, 74.6MB)
테스트 9 〉	통과 (0.05ms, 78.3MB)
테스트 10 〉	통과 (0.01ms, 76.2MB)
테스트 11 〉	통과 (0.03ms, 87.3MB)
테스트 12 〉	통과 (0.06ms, 76.1MB)
테스트 13 〉	통과 (0.05ms, 72.5MB)
테스트 14 〉	통과 (0.06ms, 74.4MB)
 */
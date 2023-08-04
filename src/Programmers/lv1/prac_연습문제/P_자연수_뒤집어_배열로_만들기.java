package Programmers.lv1.prac_연습문제;

import java.util.Arrays;

public class P_자연수_뒤집어_배열로_만들기 {
	public int[] solution(long n) {
		StringBuilder sb = new StringBuilder(String.valueOf(n));
		sb.reverse();
		int[] answer = new int[sb.length()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = sb.charAt(i) - '0';
		}
		return answer;
	}

	public static void main(String[] args) {
		P_자연수_뒤집어_배열로_만들기 sol = new P_자연수_뒤집어_배열로_만들기();
		System.out.println(Arrays.toString(sol.solution(12345)));
	}
}

/*

테스트 1 〉	통과 (0.05ms, 77.6MB)
테스트 2 〉	통과 (0.05ms, 76.6MB)
테스트 3 〉	통과 (0.05ms, 68.9MB)
테스트 4 〉	통과 (0.04ms, 74.5MB)
테스트 5 〉	통과 (0.07ms, 74.8MB)
테스트 6 〉	통과 (0.04ms, 74.7MB)
테스트 7 〉	통과 (0.04ms, 77MB)
테스트 8 〉	통과 (0.06ms, 76.2MB)
테스트 9 〉	통과 (0.04ms, 85.3MB)
테스트 10 〉	통과 (0.06ms, 73.8MB)
테스트 11 〉	통과 (0.04ms, 72.4MB)
테스트 12 〉	통과 (0.07ms, 77.2MB)
테스트 13 〉	통과 (0.05ms, 77.6MB)
 */
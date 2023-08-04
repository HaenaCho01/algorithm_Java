package Programmers.lv1.prac_연습문제;

import java.util.Arrays;

public class P_정수_내림차순으로_배치하기 {
	public long solution(long n) {
		String num = String.valueOf(n);
		char[] arr = num.toCharArray();
		Arrays.sort(arr);
		return Long.parseLong(new StringBuilder(new String(arr)).reverse().toString());
	}

	public static void main(String[] args) {
		P_정수_내림차순으로_배치하기 sol = new P_정수_내림차순으로_배치하기();
		System.out.println(sol.solution(118372));
	}
}

/*
테스트 1 〉	통과 (0.55ms, 78.3MB)
테스트 2 〉	통과 (0.53ms, 76.9MB)
테스트 3 〉	통과 (0.51ms, 76.4MB)
테스트 4 〉	통과 (0.69ms, 71.5MB)
테스트 5 〉	통과 (0.37ms, 76MB)
테스트 6 〉	통과 (0.69ms, 76.1MB)
테스트 7 〉	통과 (0.51ms, 72.3MB)
테스트 8 〉	통과 (0.39ms, 84.4MB)
테스트 9 〉	통과 (0.40ms, 76.8MB)
테스트 10 〉	통과 (0.44ms, 71.1MB)
테스트 11 〉	통과 (0.40ms, 71.9MB)
테스트 12 〉	통과 (0.38ms, 72.4MB)
테스트 13 〉	통과 (0.39ms, 76.6MB)
테스트 14 〉	통과 (0.56ms, 78.2MB)
테스트 15 〉	통과 (0.55ms, 77MB)
테스트 16 〉	통과 (0.46ms, 76.1MB)
 */
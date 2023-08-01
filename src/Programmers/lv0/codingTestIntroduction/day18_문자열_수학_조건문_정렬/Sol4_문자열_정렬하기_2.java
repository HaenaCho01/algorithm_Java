package Programmers.lv0.codingTestIntroduction.day18_문자열_수학_조건문_정렬;

import java.util.Arrays;

public class Sol4_문자열_정렬하기_2 {
	public String solution(String my_string) {
		String lower = my_string.toLowerCase();
		String[] strArr = lower.split("");
		Arrays.sort(strArr);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strArr.length; i++) {
			sb.append(strArr[i]);
		}
		return sb.toString();
	}

	public String solutionOther(String my_string) {
		char[] c = my_string.toLowerCase().toCharArray();
		Arrays.sort(c);
		return new String(c);
	}

	public static void main(String[] args) {
		Sol4_문자열_정렬하기_2 sol = new Sol4_문자열_정렬하기_2();
		System.out.println(sol.solution("Bcad"));
		System.out.println(sol.solution("heLLo"));
		System.out.println(sol.solutionOther("Python"));
	}
}

/*
테스트 1 〉	통과 (0.30ms, 88.6MB)
테스트 2 〉	통과 (0.44ms, 77.1MB)
테스트 3 〉	통과 (0.49ms, 76.7MB)
테스트 4 〉	통과 (0.43ms, 77.7MB)
테스트 5 〉	통과 (0.92ms, 77.7MB)
테스트 6 〉	통과 (1.30ms, 74.4MB)
 */
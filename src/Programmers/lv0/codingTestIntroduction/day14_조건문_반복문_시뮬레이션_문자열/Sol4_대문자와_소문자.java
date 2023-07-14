package Programmers.lv0.codingTestIntroduction.day14_조건문_반복문_시뮬레이션_문자열;

public class Sol4_대문자와_소문자 {
	public String solution(String my_string) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) <= 'Z') {
				sb.append((char) (my_string.charAt(i) + ' '));
			} else {
				sb.append((char) (my_string.charAt(i) - ' '));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Sol4_대문자와_소문자 sol = new Sol4_대문자와_소문자();
		System.out.println(sol.solution("cccCCC"));
		System.out.println(sol.solution("abCdEfghIJ"));
	}
}

/*
테스트 1 〉	통과 (0.05ms, 75.3MB)
테스트 2 〉	통과 (0.05ms, 74.6MB)
테스트 3 〉	통과 (0.03ms, 76.1MB)
테스트 4 〉	통과 (0.07ms, 72.1MB)
테스트 5 〉	통과 (0.14ms, 74.4MB)
테스트 6 〉	통과 (0.16ms, 74.9MB)
테스트 7 〉	통과 (0.71ms, 79.3MB)
 */
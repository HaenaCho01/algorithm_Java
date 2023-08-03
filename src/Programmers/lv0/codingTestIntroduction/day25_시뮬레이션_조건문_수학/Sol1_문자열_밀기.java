package Programmers.lv0.codingTestIntroduction.day25_시뮬레이션_조건문_수학;

public class Sol1_문자열_밀기 {
	public int solution(String A, String B) {
		int answer = -1;
		StringBuilder compare = new StringBuilder(A);
		for (int i = 0; i < A.length(); i++) {
			if (compare.toString().equals(B)) {
				answer = i;
				break;
			}
			char lastChar = compare.charAt(compare.length() - 1);
			compare.insert(0, lastChar);
			compare.deleteCharAt(compare.length() - 1);
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol1_문자열_밀기 sol = new Sol1_문자열_밀기();
		System.out.println(sol.solution("hello", "ohell"));
		System.out.println(sol.solution("apple", "elppa"));
		System.out.println(sol.solution("atat", "tata"));
		System.out.println(sol.solution("abc", "abc"));
	}
}

/*
테스트 1 〉	통과 (0.05ms, 75.7MB)
테스트 2 〉	통과 (0.05ms, 73.9MB)
테스트 3 〉	통과 (0.03ms, 72MB)
테스트 4 〉	통과 (0.07ms, 71.6MB)
테스트 5 〉	통과 (0.05ms, 77MB)
테스트 6 〉	통과 (0.05ms, 73.2MB)
테스트 7 〉	통과 (0.06ms, 76.7MB)
테스트 8 〉	통과 (0.04ms, 75MB)
 */
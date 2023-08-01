package Programmers.lv0.codingTestIntroduction.day18_문자열_수학_조건문_정렬;

public class Sol1_문자열안에_문자열 {
	public int solution(String str1, String str2) {
		return str1.contains(str2)? 1 : 2;
	}

	public static void main(String[] args) {
		Sol1_문자열안에_문자열 sol = new Sol1_문자열안에_문자열();
		System.out.println(sol.solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
		System.out.println(sol.solution("ppprrrogrammers", "pppp"));
		System.out.println(sol.solution("AbcAbcA", "AAA"));
	}
}

/*
테스트 1 〉	통과 (0.03ms, 74.1MB)
테스트 2 〉	통과 (0.03ms, 74.4MB)
테스트 3 〉	통과 (0.03ms, 70.7MB)
테스트 4 〉	통과 (0.04ms, 73.3MB)
테스트 5 〉	통과 (0.03ms, 64.1MB)
테스트 6 〉	통과 (0.04ms, 80.5MB)
테스트 7 〉	통과 (0.04ms, 72.3MB)
테스트 8 〉	통과 (0.05ms, 73.4MB)
테스트 9 〉	통과 (0.05ms, 82MB)
테스트 10 〉	통과 (0.03ms, 93MB)
테스트 11 〉	통과 (0.05ms, 76.3MB)
 */
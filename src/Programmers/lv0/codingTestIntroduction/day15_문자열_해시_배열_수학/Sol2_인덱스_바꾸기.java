package Programmers.lv0.codingTestIntroduction.day15_문자열_해시_배열_수학;

public class Sol2_인덱스_바꾸기 {
	public String solution(String my_string, int num1, int num2) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < my_string.length(); i++) {
			if (i == num1) {
				sb.append(my_string.charAt(num2));
			} else if (i == num2) {
				sb.append(my_string.charAt(num1));
			} else {
				sb.append(my_string.charAt(i));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Sol2_인덱스_바꾸기 sol = new Sol2_인덱스_바꾸기();
		System.out.println(sol.solution("hello", 1, 2));
		System.out.println(sol.solution("I love you", 3, 6));
	}
}

/*
테스트 1 〉	통과 (0.06ms, 72.9MB)
테스트 2 〉	통과 (0.03ms, 73.3MB)
테스트 3 〉	통과 (0.03ms, 76.8MB)
테스트 4 〉	통과 (0.12ms, 72.8MB)
 */
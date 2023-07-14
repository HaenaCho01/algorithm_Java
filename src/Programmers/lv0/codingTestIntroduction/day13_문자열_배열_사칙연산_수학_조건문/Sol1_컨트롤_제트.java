package Programmers.lv0.codingTestIntroduction.day13_문자열_배열_사칙연산_수학_조건문;

public class Sol1_컨트롤_제트 {
	public int solution(String s) {
		int answer = 0;
		String[] strArr = s.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			if (!strArr[i].equals("Z")) {
				answer += Integer.parseInt(strArr[i]);
			} else {
				answer -= Integer.parseInt(strArr[i - 1]);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol1_컨트롤_제트 sol = new Sol1_컨트롤_제트();
		System.out.println(sol.solution("1 2 Z 3"));
		System.out.println(sol.solution("10 20 30 40"));
		System.out.println(sol.solution("10 Z 20 Z 1"));
		System.out.println(sol.solution("10 Z 20 Z"));
		System.out.println(sol.solution("-1 -2 -3 Z"));
	}
}

/*
테스트 1 〉	통과 (0.14ms, 75.5MB)
테스트 2 〉	통과 (0.13ms, 80.8MB)
테스트 3 〉	통과 (0.18ms, 63.5MB)
테스트 4 〉	통과 (0.17ms, 73.4MB)
테스트 5 〉	통과 (0.09ms, 72.5MB)
테스트 6 〉	통과 (0.05ms, 71.8MB)
테스트 7 〉	통과 (0.03ms, 69.9MB)
테스트 8 〉	통과 (0.05ms, 80.2MB)
테스트 9 〉	통과 (0.11ms, 81.6MB)
테스트 10 〉	통과 (0.08ms, 78.7MB)
테스트 11 〉	통과 (0.09ms, 75.6MB)
테스트 12 〉	통과 (0.14ms, 69.5MB)
테스트 13 〉	통과 (0.13ms, 75.6MB)
테스트 14 〉	통과 (0.12ms, 71MB)
테스트 15 〉	통과 (0.12ms, 84.6MB)
테스트 16 〉	통과 (0.21ms, 74MB)
테스트 17 〉	통과 (0.14ms, 75MB)
테스트 18 〉	통과 (0.13ms, 74.4MB)
테스트 19 〉	통과 (0.11ms, 82MB)
테스트 20 〉	통과 (0.17ms, 65.7MB)
 */
package Programmers.lv0.codingTestIntroduction.day24_수학_시뮬레이션_문자열_조건문_반복문;

public class Sol2_이진수_더하기 {
	public String solution(String bin1, String bin2) {
		return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
	}

	public static void main(String[] args) {
		Sol2_이진수_더하기 sol = new Sol2_이진수_더하기();
		System.out.println(sol.solution("10", "11"));
		System.out.println(sol.solution("1001", "1111"));
	}
}

/*
테스트 1 〉	통과 (0.04ms, 71MB)
테스트 2 〉	통과 (0.04ms, 75.9MB)
테스트 3 〉	통과 (0.04ms, 76.1MB)
테스트 4 〉	통과 (0.04ms, 76MB)
테스트 5 〉	통과 (0.03ms, 73.3MB)
테스트 6 〉	통과 (0.04ms, 77.1MB)
테스트 7 〉	통과 (0.04ms, 69.7MB)
테스트 8 〉	통과 (0.04ms, 76.1MB)
테스트 9 〉	통과 (0.03ms, 75.2MB)
 */
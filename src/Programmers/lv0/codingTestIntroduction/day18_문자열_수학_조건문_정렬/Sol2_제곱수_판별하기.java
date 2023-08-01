package Programmers.lv0.codingTestIntroduction.day18_문자열_수학_조건문_정렬;

public class Sol2_제곱수_판별하기 {
	public int solution(int n) {
		return n % Math.sqrt(n) == 0? 1 : 2;
	}

	public static void main(String[] args) {
		Sol2_제곱수_판별하기 sol = new Sol2_제곱수_판별하기();
		System.out.println(sol.solution(144));
		System.out.println(sol.solution(976));
	}
}

/*
테스트 1 〉	통과 (0.03ms, 79.7MB)
테스트 2 〉	통과 (0.04ms, 71.7MB)
테스트 3 〉	통과 (0.03ms, 77.6MB)
테스트 4 〉	통과 (0.04ms, 76.2MB)
테스트 5 〉	통과 (0.03ms, 72.7MB)
테스트 6 〉	통과 (0.03ms, 76.4MB)
테스트 7 〉	통과 (0.04ms, 79.9MB)
테스트 8 〉	통과 (0.03ms, 76.7MB)
테스트 9 〉	통과 (0.04ms, 77MB)
테스트 10 〉	통과 (0.04ms, 74.1MB)
 */
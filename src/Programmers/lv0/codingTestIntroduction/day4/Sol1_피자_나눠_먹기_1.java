package Programmers.lv0.codingTestIntroduction.day4;

public class Sol1_피자_나눠_먹기_1 {
	public int solution(int n) {
		return n % 7 == 0 ? n / 7 : n / 7 + 1;
	}

	public static void main(String[] args) {
		Sol1_피자_나눠_먹기_1 sol = new Sol1_피자_나눠_먹기_1();
		System.out.println(sol.solution(7));
		System.out.println(sol.solution(1));
		System.out.println(sol.solution(15));
	}
}

/*
테스트 1 〉	통과 (0.01ms, 72.4MB)
테스트 2 〉	통과 (0.02ms, 74.7MB)
테스트 3 〉	통과 (0.02ms, 70.4MB)
테스트 4 〉	통과 (0.02ms, 78.4MB)
테스트 5 〉	통과 (0.02ms, 81MB)
테스트 6 〉	통과 (0.02ms, 71.1MB)
테스트 7 〉	통과 (0.02ms, 74.2MB)
테스트 8 〉	통과 (0.02ms, 74.3MB)
테스트 9 〉	통과 (0.02ms, 76.2MB)
테스트 10 〉	통과 (0.02ms, 73MB)
테스트 11 〉	통과 (0.02ms, 71.9MB)
 */
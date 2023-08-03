package Programmers.lv0.codingTestIntroduction.day25_시뮬레이션_조건문_수학;

public class Sol2_종이_자르기 {
	public int solution(int M, int N) {
		return M * N - 1;
	}

	public static void main(String[] args) {
		Sol2_종이_자르기 sol = new Sol2_종이_자르기();
		System.out.println(sol.solution(2, 2));
		System.out.println(sol.solution(2, 5));
		System.out.println(sol.solution(1, 1));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 76.8MB)
테스트 2 〉	통과 (0.02ms, 78.9MB)
테스트 3 〉	통과 (0.03ms, 85.3MB)
테스트 4 〉	통과 (0.01ms, 73.5MB)
테스트 5 〉	통과 (0.02ms, 81.6MB)
테스트 6 〉	통과 (0.03ms, 77.4MB)
테스트 7 〉	통과 (0.02ms, 74.1MB)
테스트 8 〉	통과 (0.02ms, 78.5MB)
 */
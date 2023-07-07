package Programmers.lv0.codingTestIntroduction.day4;

public class Sol2_피자_나눠_먹기_2 {
	public int solution(int n) {
		int pizza = n % 6 == 0 ? n / 6 : n / 6 + 1;
		while ((pizza * 6) % n != 0) {
			pizza++;
		}
		return pizza;
	}

	public static void main(String[] args) {
		Sol2_피자_나눠_먹기_2 sol = new Sol2_피자_나눠_먹기_2();
		System.out.println(sol.solution(6));
		System.out.println(sol.solution(10));
		System.out.println(sol.solution(4));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 66.6MB)
테스트 2 〉	통과 (0.02ms, 77.6MB)
테스트 3 〉	통과 (0.03ms, 72.6MB)
테스트 4 〉	통과 (0.03ms, 76MB)
테스트 5 〉	통과 (0.02ms, 71.9MB)
테스트 6 〉	통과 (0.02ms, 78.6MB)
테스트 7 〉	통과 (0.03ms, 72.6MB)
테스트 8 〉	통과 (0.02ms, 77.1MB)
테스트 9 〉	통과 (0.01ms, 72.7MB)
테스트 10 〉	통과 (0.02ms, 76.9MB)
테스트 11 〉	통과 (0.02ms, 73.1MB)
테스트 12 〉	통과 (0.01ms, 78.5MB)
테스트 13 〉	통과 (0.03ms, 76.9MB)
 */

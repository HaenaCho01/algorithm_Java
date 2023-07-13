package Programmers.lv0.codingTestIntroduction.day11_수학_반복문;

public class Sol4_팩토리얼 {
	public int solution(int n) {
		int factorial = 1;
		int answer = 0;
		for (int i = 1; i <= 11; i++) {
			if (i * factorial > n) {
				answer = i - 1;
				break;
			}
			factorial *= i;
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol4_팩토리얼 sol = new Sol4_팩토리얼();
		System.out.println(sol.solution(3628800));
		System.out.println(sol.solution(7));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 72.7MB)
테스트 2 〉	통과 (0.03ms, 82.2MB)
테스트 3 〉	통과 (0.02ms, 68.9MB)
테스트 4 〉	통과 (0.02ms, 79.1MB)
테스트 5 〉	통과 (0.02ms, 78.6MB)
테스트 6 〉	통과 (0.02ms, 74.4MB)
 */

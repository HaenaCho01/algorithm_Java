package Programmers.lv0.codingTestIntroduction.day4;

public class Sol4_배열의_평균값 {
	public double solution(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return (double) sum / numbers.length;
	}

	public static void main(String[] args) {
		Sol4_배열의_평균값 sol = new Sol4_배열의_평균값();
		System.out.println(sol.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
		System.out.println(sol.solution(new int[]{89,90,91,92,93,94,95,96,97,98,99}));
	}
}

/*
테스트 1 〉	통과 (0.04ms, 72.8MB)
테스트 2 〉	통과 (0.03ms, 74.1MB)
테스트 3 〉	통과 (0.03ms, 76.9MB)
테스트 4 〉	통과 (0.02ms, 76MB)
테스트 5 〉	통과 (0.12ms, 77.9MB)
 */

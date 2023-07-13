package Programmers.lv0.codingTestIntroduction.day11_수학_반복문;

public class Sol1_주사위의_개수 {
	public int solution(int[] box, int n) {
		return (box[0] / n) * (box[1] / n) * (box[2] / n);
	}

	public static void main(String[] args) {
		Sol1_주사위의_개수 sol = new Sol1_주사위의_개수();
		System.out.println(sol.solution(new int[]{1, 1, 1}, 1));
		System.out.println(sol.solution(new int[]{10, 8, 6}, 3));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 74.1MB)
테스트 2 〉	통과 (0.01ms, 72.5MB)
테스트 3 〉	통과 (0.03ms, 77.9MB)
테스트 4 〉	통과 (0.03ms, 87.2MB)
 */

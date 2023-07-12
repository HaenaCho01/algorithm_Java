package Programmers.lv0.codingTestIntroduction.day10_조건문_배열_수학_시뮬레이션;

public class Sol3_공_던지기 {
	public int solution(int[] numbers, int k) {
		int cnt = 0;
		int answer = 0;
		for (int i = 0; i < numbers.length;) {
			++cnt;
			answer = numbers[i];
			i = i + 2 >= numbers.length ? i - numbers.length + 2 : i + 2;
			if (cnt == k) break;
		}
		return answer;
	}

	public int solutionOther(int[] numbers, int k) {
		return numbers[((k-1)*2)%numbers.length];
	}

	public static void main(String[] args) {
		Sol3_공_던지기 sol = new Sol3_공_던지기();
		System.out.println(sol.solution(new int[]{1, 2, 3, 4}, 2));
		System.out.println(sol.solution(new int[]{1, 2, 3, 4, 5, 6}, 5));
		System.out.println(sol.solutionOther(new int[]{1, 2, 3}, 3));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 80.8MB)
테스트 2 〉	통과 (0.04ms, 78.8MB)
테스트 3 〉	통과 (0.02ms, 73.1MB)
테스트 4 〉	통과 (0.06ms, 71.6MB)
테스트 5 〉	통과 (0.03ms, 76.4MB)
테스트 6 〉	통과 (0.03ms, 71.8MB)
테스트 7 〉	통과 (0.02ms, 74.8MB)
테스트 8 〉	통과 (0.03ms, 73.7MB)
테스트 9 〉	통과 (0.02ms, 73.5MB)
테스트 10 〉	통과 (0.02ms, 75.2MB)
테스트 11 〉	통과 (0.04ms, 74.3MB)
테스트 12 〉	통과 (0.04ms, 78.8MB)
테스트 13 〉	통과 (0.04ms, 76.5MB)
테스트 14 〉	통과 (0.03ms, 73.9MB)
테스트 15 〉	통과 (0.02ms, 74.4MB)
테스트 16 〉	통과 (0.04ms, 74.2MB)
테스트 17 〉	통과 (0.04ms, 75.1MB)
테스트 18 〉	통과 (0.03ms, 72.9MB)
테스트 19 〉	통과 (0.02ms, 71.1MB)
테스트 20 〉	통과 (0.04ms, 70.2MB)
테스트 21 〉	통과 (0.04ms, 78.2MB)
테스트 22 〉	통과 (0.05ms, 77.5MB)
테스트 23 〉	통과 (0.03ms, 72.9MB)
테스트 24 〉	통과 (0.04ms, 76.8MB)
테스트 25 〉	통과 (0.03ms, 76.4MB)
테스트 26 〉	통과 (0.03ms, 77.6MB)
테스트 27 〉	통과 (0.03ms, 70.6MB)
테스트 28 〉	통과 (0.06ms, 77.5MB)
테스트 29 〉	통과 (0.03ms, 78.8MB)
테스트 30 〉	통과 (0.04ms, 71MB)
테스트 31 〉	통과 (0.04ms, 75.9MB)
테스트 32 〉	통과 (0.04ms, 74.8MB)
테스트 33 〉	통과 (0.03ms, 78MB)
테스트 34 〉	통과 (0.04ms, 77.2MB)
테스트 35 〉	통과 (0.03ms, 74.3MB)
테스트 36 〉	통과 (0.04ms, 76.1MB)
테스트 37 〉	통과 (0.06ms, 73.1MB)
테스트 38 〉	통과 (0.04ms, 77.6MB)
테스트 39 〉	통과 (0.03ms, 69.6MB)
테스트 40 〉	통과 (0.03ms, 75.1MB)
테스트 41 〉	통과 (0.03ms, 82.6MB)
테스트 42 〉	통과 (0.02ms, 71.2MB)
테스트 43 〉	통과 (0.05ms, 80.9MB)
테스트 44 〉	통과 (0.05ms, 72.2MB)
테스트 45 〉	통과 (0.03ms, 75.7MB)
테스트 46 〉	통과 (0.04ms, 70.5MB)
테스트 47 〉	통과 (0.06ms, 76.6MB)
 */
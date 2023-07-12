package Programmers.lv0.codingTestIntroduction.day10_조건문_배열_수학_시뮬레이션;

public class Sol1_점의_위치_구하기 {
	public int solution(int[] dot) {
		int x = dot[0]; int y = dot[1];
		int answer = x > 0 ? (y > 0 ? 1 : 4) : (y > 0 ? 2 : 3);
		return answer;
	}

	public static void main(String[] args) {
		Sol1_점의_위치_구하기 sol = new Sol1_점의_위치_구하기();
		System.out.println(sol.solution(new int[]{2, 4}));
		System.out.println(sol.solution(new int[]{-7,9}));
	}
}

/*
테스트 1 〉	통과 (0.01ms, 73.6MB)
테스트 2 〉	통과 (0.03ms, 84.8MB)
테스트 3 〉	통과 (0.03ms, 72.1MB)
테스트 4 〉	통과 (0.03ms, 75.7MB)
테스트 5 〉	통과 (0.03ms, 76.5MB)
테스트 6 〉	통과 (0.01ms, 70.4MB)
테스트 7 〉	통과 (0.01ms, 74.8MB)
테스트 8 〉	통과 (0.02ms, 77.5MB)
테스트 9 〉	통과 (0.02ms, 72.3MB)
테스트 10 〉	통과 (0.03ms, 82.7MB)
테스트 11 〉	통과 (0.01ms, 72.4MB)
테스트 12 〉	통과 (0.02ms, 71.4MB)
테스트 13 〉	통과 (0.03ms, 78.2MB)
테스트 14 〉	통과 (0.02ms, 78.6MB)
테스트 15 〉	통과 (0.02ms, 76.4MB)
테스트 16 〉	통과 (0.02ms, 74.5MB)
 */

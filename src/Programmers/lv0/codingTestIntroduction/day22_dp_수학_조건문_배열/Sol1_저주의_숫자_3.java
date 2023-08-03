package Programmers.lv0.codingTestIntroduction.day22_dp_수학_조건문_배열;

public class Sol1_저주의_숫자_3 {
	public int solution(int n) {
		int[] arr = new int[n];
		int value = 1;
		for (int i = 0; i < arr.length;) {
			if (value >= 3 && value % 3 == 0) value++;
			else if (Integer.toString(value).contains("3")) value++;
			else {
				arr[i] = value;
				i++;
				value++;
			}
		}
		return arr[n - 1];
	}

	public static void main(String[] args) {
		Sol1_저주의_숫자_3 sol = new Sol1_저주의_숫자_3();
		System.out.println(sol.solution(15));
		System.out.println(sol.solution(40));
	}
}

/*
테스트 1 〉	통과 (0.04ms, 74.3MB)
테스트 2 〉	통과 (0.03ms, 74.9MB)
테스트 3 〉	통과 (0.03ms, 77.8MB)
테스트 4 〉	통과 (0.21ms, 76.5MB)
테스트 5 〉	통과 (0.26ms, 73.7MB)
테스트 6 〉	통과 (0.20ms, 79.3MB)
테스트 7 〉	통과 (0.09ms, 73.8MB)
테스트 8 〉	통과 (0.05ms, 74MB)
테스트 9 〉	통과 (0.07ms, 67.6MB)
테스트 10 〉	통과 (0.07ms, 74.2MB)
테스트 11 〉	통과 (0.09ms, 77MB)
 */
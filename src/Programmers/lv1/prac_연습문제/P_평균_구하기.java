package Programmers.lv1.prac_연습문제;

public class P_평균_구하기 {
	public double solution(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (double) sum / arr.length;
	}

	public static void main(String[] args) {
		P_평균_구하기 sol = new P_평균_구하기();
		System.out.println(sol.solution(new int[]{1, 2, 3, 4}));
		System.out.println(sol.solution(new int[]{5, 5}));
	}
}

/*
테스트 1 〉	통과 (0.03ms, 79.3MB)
테스트 2 〉	통과 (0.04ms, 67.5MB)
테스트 3 〉	통과 (0.03ms, 76.1MB)
테스트 4 〉	통과 (0.04ms, 76.8MB)
테스트 5 〉	통과 (0.04ms, 79.3MB)
테스트 6 〉	통과 (0.02ms, 73.8MB)
테스트 7 〉	통과 (0.03ms, 81.2MB)
테스트 8 〉	통과 (0.04ms, 75.4MB)
테스트 9 〉	통과 (0.05ms, 79.2MB)
테스트 10 〉	통과 (0.04ms, 73.8MB)
테스트 11 〉	통과 (0.03ms, 74.8MB)
테스트 12 〉	통과 (0.03ms, 72.9MB)
테스트 13 〉	통과 (0.03ms, 75.5MB)
테스트 14 〉	통과 (0.03ms, 72.2MB)
테스트 15 〉	통과 (0.03ms, 77.4MB)
테스트 16 〉	통과 (0.03ms, 76MB)
 */
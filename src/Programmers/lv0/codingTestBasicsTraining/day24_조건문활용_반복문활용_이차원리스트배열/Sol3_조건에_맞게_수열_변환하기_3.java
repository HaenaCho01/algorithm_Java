package Programmers.lv0.codingTestBasicsTraining.day24_조건문활용_반복문활용_이차원리스트배열;

import java.util.Arrays;

class Solution3 {
	public int[] solution(int[] arr, int k) {
		if (k % 2 == 1) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] *= k;
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				arr[i] += k;
			}
		}
		return arr;
	}
}

/*
테스트 1 〉	통과 (0.02ms, 79MB)
테스트 2 〉	통과 (0.02ms, 75.7MB)
테스트 3 〉	통과 (0.01ms, 66.8MB)
테스트 4 〉	통과 (0.02ms, 77.8MB)
테스트 5 〉	통과 (0.02ms, 82.2MB)
테스트 6 〉	통과 (0.02ms, 78.5MB)
테스트 7 〉	통과 (0.03ms, 75.2MB)
테스트 8 〉	통과 (0.03ms, 80.1MB)
테스트 9 〉	통과 (0.03ms, 73.2MB)
테스트 10 〉	통과 (6.33ms, 167MB)
테스트 11 〉	통과 (1.57ms, 108MB)
 */

public class Sol3_조건에_맞게_수열_변환하기_3 {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 100, 99, 98}, 3)));
		System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 100, 99, 98}, 2)));
	}
}

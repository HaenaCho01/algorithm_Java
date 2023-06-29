package Programmers.lv0.codingTestBasicsTraining.day20_함수메서드;

import java.util.Arrays;

class Solution4 {
	public int[] solution(int[] arr, int n) {
		if (arr.length % 2 == 1) {
			for (int i = 0; i < arr.length; i = i + 2) {
				arr[i] = arr[i] + n;
			}
		} else {
			for (int i = 1; i < arr.length; i = i + 2) {
				arr[i] = arr[i] + n;
			}
		}
		return arr;
	}
}

/*
테스트 1 〉	통과 (0.01ms, 77.8MB)
테스트 2 〉	통과 (0.02ms, 73.7MB)
테스트 3 〉	통과 (0.02ms, 70.6MB)
테스트 4 〉	통과 (0.02ms, 73.1MB)
테스트 5 〉	통과 (0.02ms, 73.1MB)
테스트 6 〉	통과 (0.02ms, 80.4MB)
테스트 7 〉	통과 (0.02ms, 87.3MB)
테스트 8 〉	통과 (0.03ms, 78.2MB)
테스트 9 〉	통과 (0.02ms, 73.5MB)
테스트 10 〉	통과 (0.03ms, 77.8MB)
테스트 11 〉	통과 (0.02ms, 76.4MB)
테스트 12 〉	통과 (0.02ms, 77.1MB)
테스트 13 〉	통과 (0.03ms, 81.3MB)
테스트 14 〉	통과 (0.04ms, 77.9MB)
테스트 15 〉	통과 (0.04ms, 79.2MB)
테스트 16 〉	통과 (0.04ms, 71.6MB)
테스트 17 〉	통과 (0.04ms, 75.3MB)
테스트 18 〉	통과 (0.03ms, 71.1MB)
테스트 19 〉	통과 (0.02ms, 75.2MB)
테스트 20 〉	통과 (0.02ms, 72.7MB)
 */

public class Sol4_배열의_길이에_따라_다른_연산하기 {
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		System.out.println(Arrays.toString(sol.solution(new int[]{49, 12, 100, 276, 33}, 27)));
		System.out.println(Arrays.toString(sol.solution(new int[]{444, 555, 666, 777}, 100)));
	}
}

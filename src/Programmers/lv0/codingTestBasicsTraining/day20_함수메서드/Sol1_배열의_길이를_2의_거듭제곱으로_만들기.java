package Programmers.lv0.codingTestBasicsTraining.day20_함수메서드;

import java.util.Arrays;

class Solution1 {
	public int[] solution(int[] arr) {
		int size = arr.length;
		while ((size & (size - 1)) != 0) {
			size++;
		}
		int[] answer = new int[size];
		for (int i = 0;i < arr.length; i++) {
			answer[i] = arr[i];
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.02ms, 80.1MB)
테스트 2 〉	통과 (0.03ms, 76.3MB)
테스트 3 〉	통과 (0.03ms, 69MB)
테스트 4 〉	통과 (0.02ms, 74.5MB)
테스트 5 〉	통과 (0.02ms, 73.4MB)
테스트 6 〉	통과 (0.03ms, 83.5MB)
테스트 7 〉	통과 (0.03ms, 79.9MB)
테스트 8 〉	통과 (0.05ms, 76.9MB)
테스트 9 〉	통과 (0.04ms, 74.5MB)
테스트 10 〉	통과 (0.04ms, 79.3MB)
테스트 11 〉	통과 (0.02ms, 88.1MB)
테스트 12 〉	통과 (0.03ms, 78.8MB)
테스트 13 〉	통과 (0.01ms, 72.4MB)
테스트 14 〉	통과 (0.02ms, 77.1MB)
테스트 15 〉	통과 (0.03ms, 70.5MB)
테스트 16 〉	통과 (0.01ms, 77.2MB)
테스트 17 〉	통과 (0.03ms, 76.4MB)
테스트 18 〉	통과 (0.03ms, 77.7MB)
테스트 19 〉	통과 (0.04ms, 74.7MB)
테스트 20 〉	통과 (0.03ms, 66.4MB)
테스트 21 〉	통과 (0.05ms, 89.1MB)
테스트 22 〉	통과 (0.01ms, 73.7MB)
 */

public class Sol1_배열의_길이를_2의_거듭제곱으로_만들기 {
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5, 6})));
		System.out.println(Arrays.toString(sol.solution(new int[]{58, 172, 746, 89})));
	}
}

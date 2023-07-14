package Programmers.lv0.codingTestIntroduction.day14_조건문_반복문_시뮬레이션_문자열;

import java.util.Arrays;

public class Sol1_가까운_수 {
	public int solution(int[] array, int n) {
		int answer = 250;
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if (Math.abs(array[i] - n) < Math.abs(answer - n)) {
				answer = array[i];
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol1_가까운_수 sol = new Sol1_가까운_수();
		System.out.println(sol.solution(new int[]{3, 10, 28}, 20));
		System.out.println(sol.solution(new int[]{10, 11, 12}, 13));
		System.out.println(sol.solution(new int[]{2, 3, 4}, 1));
	}
}

/*
테스트 1 〉	통과 (0.53ms, 67.8MB)
테스트 2 〉	통과 (0.47ms, 76.2MB)
테스트 3 〉	통과 (0.51ms, 65.8MB)
테스트 4 〉	통과 (0.36ms, 78.9MB)
테스트 5 〉	통과 (0.35ms, 74.9MB)
테스트 6 〉	통과 (0.53ms, 73.8MB)
테스트 7 〉	통과 (0.43ms, 80.2MB)
테스트 8 〉	통과 (0.38ms, 74.5MB)
테스트 9 〉	통과 (0.38ms, 74.8MB)
테스트 10 〉	통과 (0.44ms, 78.5MB)
테스트 11 〉	통과 (0.45ms, 73.1MB)
테스트 12 〉	통과 (0.43ms, 75.3MB)
테스트 13 〉	통과 (0.42ms, 80.1MB)
테스트 14 〉	통과 (0.41ms, 74.3MB)
테스트 15 〉	통과 (0.34ms, 77.6MB)
테스트 16 〉	통과 (0.40ms, 70.3MB)
테스트 17 〉	통과 (0.53ms, 78.2MB)
테스트 18 〉	통과 (0.50ms, 77.5MB)
 */
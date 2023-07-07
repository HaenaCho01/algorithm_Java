package Programmers.lv0.codingTestIntroduction.day3_사칙연산_배열_수학;

import java.util.Arrays;
import java.util.Comparator;

public class Sol3_최빈값_구하기 {
	public static void main(String[] args) {
		Sol3_최빈값_구하기 sol = new Sol3_최빈값_구하기();
		System.out.println(sol.solution(new int[]{1,2,3,3,3,4}));
		System.out.println(sol.solution(new int[]{1,1,2,2}));
		System.out.println(sol.solution(new int[]{1}));
		System.out.println(sol.solution(new int[]{1,2}));
		System.out.println(sol.solution(new int[]{1,2,3}));
		System.out.println(sol.solution(new int[]{1,1,2,2,3,3,3}));
		System.out.println(sol.solution(new int[]{0,0,1}));
		System.out.println(sol.solution(new int[]{0}));
	}

	public int solution(int[] array) {
		int mode = 0;

		// 배열의 길이가 1일 경우 최빈값은 해당 값
		if (array.length == 1) {
			mode = array[0];

		// 그 외의 경우
		} else {
			// 배열을 내림차순으로 정렬
			Arrays.sort(array);

			// 배열의 숫자 빈도를 카운트 할 새로운 2차원 배열 만들기
			int [][] cntArr = new int[array.length][2]; // [숫자][빈도 카운트]

			int cnt = 1; // 같은 값이 몇개인지 카운트
			int index = 0; // cntArr의 index

			// 주어진 배열을 돌며 값과 카운트 값 2차원 배열에 담기
			for (int i = 0; i < array.length; i++) {
				if (i == array.length - 1) {
					cntArr[index][0] = array[i];
					cntArr[index][1] = cnt;
					break;
				}
				if (array[i] == array[i+1]) {
					cnt++;
				}
				if (array[i] != array[i+1]) {
					cntArr[index][0] = array[i];
					cntArr[index][1] = cnt;
					index++;
					cnt = 1;
				}
			}

			// 2차원 배열의 카운트 값을 기준으로 정렬하기
			Arrays.sort(cntArr, Comparator.comparingInt((int[] o) -> o[1]).reversed());

			// 정렬된 가장 앞의 숫자 return(만약 뒤에 같은 최빈값이 있을 경우 -1 return)
			if (cntArr[0][1] == cntArr[1][1]) {
				mode = -1;
			} else {
				mode = cntArr[0][0];
			}
		}
		return mode;
	}
}

/*
테스트 1 〉	통과 (3.15ms, 76.3MB)
테스트 2 〉	통과 (3.23ms, 82.9MB)
테스트 3 〉	통과 (2.39ms, 81.6MB)
테스트 4 〉	통과 (2.41ms, 72.5MB)
테스트 5 〉	통과 (2.14ms, 78.9MB)
테스트 6 〉	통과 (3.08ms, 84.8MB)
테스트 7 〉	통과 (2.40ms, 72MB)
테스트 8 〉	통과 (2.35ms, 78.6MB)
테스트 9 〉	통과 (2.39ms, 73.8MB)
테스트 10 〉	통과 (0.02ms, 80.6MB)
테스트 11 〉	통과 (2.04ms, 73.9MB)
테스트 12 〉	통과 (2.29ms, 79.2MB)
테스트 13 〉	통과 (2.16ms, 75.8MB)
테스트 14 〉	통과 (2.64ms, 73.3MB)
테스트 15 〉	통과 (2.44ms, 74.3MB)
테스트 16 〉	통과 (2.41ms, 72MB)
 */

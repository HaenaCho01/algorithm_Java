package Programmers.lv0.codingTestIntroduction.day10_조건문_배열_수학_시뮬레이션;

import java.util.Arrays;

public class Sol2_2차원으로_만들기 {
	public int[][] solution(int[] num_list, int n) {
		int[][] answer = new int[num_list.length/n][n];
		int index = 0;
		for (int i = 0, j = 0; i < num_list.length; i++) {
			if (i != 0 && i % n == 0) {
				index++;
				j = 0;
			}
			answer[index][j++] = num_list[i];
		}
		return answer;
	}

	public int[][] solutionOther(int[] num_list, int n) {
		int[][] answer = {};

		int length = num_list.length;

		answer = new int[length/n][n];

		for(int i=0; i<length; i++){
			answer[i/n][i%n]=num_list[i];
		}

		return answer;
	}

	public static void main(String[] args) {
		Sol2_2차원으로_만들기 sol = new Sol2_2차원으로_만들기();
		System.out.println(Arrays.deepToString(sol.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
		System.out.println(Arrays.deepToString(sol.solutionOther(new int[]{100,95,2,4,5,6,18,33,948}, 3)));
	}
}

/*
테스트 1 〉	통과 (0.01ms, 73.3MB)
테스트 2 〉	통과 (0.02ms, 72.2MB)
테스트 3 〉	통과 (0.04ms, 76.6MB)
테스트 4 〉	통과 (0.02ms, 72.9MB)
테스트 5 〉	통과 (0.02ms, 71.5MB)
테스트 6 〉	통과 (0.02ms, 75.9MB)
테스트 7 〉	통과 (0.02ms, 75.9MB)
 */
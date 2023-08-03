package Programmers.lv0.codingTestIntroduction.day23_배열_정렬_문자열;

import java.util.Arrays;
import java.util.Comparator;

public class Sol1_특이한_정렬 {
	public int[] solution(int[] numlist, int n) {
		Arrays.sort(numlist);
		int[] answer = new int[numlist.length];
		int[][] distanceIndex = new int[numlist.length][2];
		for (int i = 0; i < numlist.length; i++) {
			distanceIndex[i][0] = Math.abs(numlist[i] - n);
			distanceIndex[i][1] = i;
		}
		Arrays.sort(distanceIndex, Comparator.comparingInt((int[] o) -> o[1]).reversed());
		Arrays.sort(distanceIndex, Comparator.comparingInt((int[] o) -> o[0]));
		for (int i = 0; i < answer.length; i++) {
			int index = distanceIndex[i][1];
			answer[i] = numlist[index];
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol1_특이한_정렬 sol = new Sol1_특이한_정렬();
		System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5, 6}, 4)));
		System.out.println(Arrays.toString(sol.solution(new int[]{10000,20,36,47,40,6,10,7000}, 30)));
		System.out.println(Arrays.toString(sol.solution(new int[]{10, 2}, 6)));
	}
}

/*
테스트 1 〉	통과 (4.20ms, 79.4MB)
테스트 2 〉	통과 (4.91ms, 84.4MB)
테스트 3 〉	통과 (8.43ms, 79.1MB)
테스트 4 〉	통과 (3.13ms, 80.6MB)
테스트 5 〉	통과 (3.45ms, 73.4MB)
테스트 6 〉	통과 (2.58ms, 78.1MB)
테스트 7 〉	통과 (2.74ms, 73.8MB)
 */
package Programmers.lv0.codingTestBasicsTraining.day21_함수메서드;

import java.util.*;

class Solution2 {
	public int solution(int[] rank, boolean[] attendance) {
		// 참가 가능 인원 수 세기
		int cnt = 0;
		for (int i = 0; i < attendance.length; i++) {
			if (attendance[i]) {
				cnt++;
			}
		}

		// 참가 가능 인원 중 등수 매기기
		int[] attendanceArr = new int[cnt];
		int idx = 0;
		for (int i = 0; i < rank.length; i++) {
			if (attendance[i]) {
				attendanceArr[idx++] = rank[i];
			}
		}
		Arrays.sort(attendanceArr);

		// 1, 2, 3등 선발하기
		int a = 0; int b = 0; int c = 0;
		for (int i = 0; i < rank.length; i++) {
			if (rank[i] == attendanceArr[0]) {
				a = i;
			} else if (rank[i] == attendanceArr[1]) {
				b = i;
			} else if (rank[i] == attendanceArr[2]) {
				c = i;
			}
		}
		return 10000*a + 100*b + c;
	}
}

/*
테스트 1 〉	통과 (0.38ms, 85MB)
테스트 2 〉	통과 (0.48ms, 73.2MB)
테스트 3 〉	통과 (0.37ms, 72.8MB)
테스트 4 〉	통과 (0.48ms, 76.1MB)
테스트 5 〉	통과 (0.36ms, 73.2MB)
테스트 6 〉	통과 (0.42ms, 73MB)
테스트 7 〉	통과 (0.33ms, 72.8MB)
테스트 8 〉	통과 (0.35ms, 76.7MB)
테스트 9 〉	통과 (0.37ms, 77.8MB)
테스트 10 〉	통과 (0.35ms, 76.1MB)
테스트 11 〉	통과 (0.49ms, 72.3MB)
테스트 12 〉	통과 (0.34ms, 77.1MB)
테스트 13 〉	통과 (0.52ms, 72.3MB)
테스트 14 〉	통과 (0.34ms, 73.5MB)
테스트 15 〉	통과 (0.55ms, 72.5MB)
테스트 16 〉	통과 (0.39ms, 74.5MB)
테스트 17 〉	통과 (0.33ms, 83.2MB)
테스트 18 〉	통과 (0.48ms, 76.8MB)
테스트 19 〉	통과 (0.32ms, 75.7MB)
 */

public class Sol2_전국_대회_선발_고사 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		System.out.println(sol.solution(new int[]{3, 7, 2, 5, 4, 6, 1}, new boolean[]{false, true, true, true, true, false, false}));
		System.out.println(sol.solution(new int[]{1, 2, 3}, new boolean[]{true, true, true}));
		System.out.println(sol.solution(new int[]{6, 1, 5, 2, 3, 4}, new boolean[]{true, false, true, false, false, true}));
	}
}

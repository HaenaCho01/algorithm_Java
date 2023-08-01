package Programmers.lv0.codingTestIntroduction.day20_수학_시뮬레이션_문자열_사칙연산;

import java.util.Arrays;

public class Sol1_직사각형_넓이_구하기 {
	public int solution(int[][] dots) {
		int x1 = dots[0][0];
		int y1 = dots[0][1];
		int x2 = x1 != dots[1][0]? dots[1][0] : (x1 != dots[2][0] ? dots[2][0] : dots[3][0]);
		int y2 = y1 != dots[1][1]? dots[1][1] : (y1 != dots[2][1] ? dots[2][1] : dots[3][1]);
		return Math.abs(x1 - x2) * Math.abs(y1 - y2);
	}

	public static void main(String[] args) {
		Sol1_직사각형_넓이_구하기 sol = new Sol1_직사각형_넓이_구하기();
		System.out.println(sol.solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}));
		System.out.println(sol.solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}));
	}
}

/*
테스트 1 〉	통과 (0.06ms, 77.9MB)
테스트 2 〉	통과 (0.02ms, 83.3MB)
테스트 3 〉	통과 (0.03ms, 72.4MB)
테스트 4 〉	통과 (0.04ms, 76.7MB)
테스트 5 〉	통과 (0.03ms, 78MB)
 */
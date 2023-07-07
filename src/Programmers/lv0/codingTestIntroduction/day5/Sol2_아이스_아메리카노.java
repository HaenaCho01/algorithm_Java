package Programmers.lv0.codingTestIntroduction.day5;

import java.util.Arrays;

public class Sol2_아이스_아메리카노 {
	public int[] solution(int money) {
		return new int[] {money / 5500, money % 5500};
	}

	public static void main(String[] args) {
		Sol2_아이스_아메리카노 sol = new Sol2_아이스_아메리카노();
		System.out.println(Arrays.toString(sol.solution(5500)));
		System.out.println(Arrays.toString(sol.solution(15000)));
	}
}

/*
테스트 1 〉	통과 (0.01ms, 74.5MB)
테스트 2 〉	통과 (0.02ms, 77MB)
테스트 3 〉	통과 (0.01ms, 74.3MB)
테스트 4 〉	통과 (0.02ms, 75.8MB)
테스트 5 〉	통과 (0.02ms, 77MB)
 */

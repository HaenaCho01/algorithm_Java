package Programmers.lv0.codingTestBasicsTraining.day23_조건문활용;

import java.time.LocalDate;

class Solution5 {
	//방법1
	public int solution1(int[] date1, int[] date2) {
		StringBuilder date1Str = new StringBuilder();
		StringBuilder date2Str = new StringBuilder();
		for (int i = 0; i < date1.length; i++) {
			date1Str.append(date1[i]);
			date2Str.append(date2[i]);
		}
		int answer = Integer.parseInt(String.valueOf(date1Str)) < Integer.parseInt(String.valueOf(date2Str)) ? 1 : 0;
		return answer;
	}

	//방법2
	public int solution2(int[] date1, int[] date2) {
		LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
		LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);
		int answer = dateA.isBefore(dateB) ? 1 : 0;
		return answer;
	}
}

/*
//방법1
테스트 1 〉	통과 (0.05ms, 76.1MB)
테스트 2 〉	통과 (0.05ms, 75.5MB)
테스트 3 〉	통과 (0.04ms, 75.8MB)
테스트 4 〉	통과 (0.04ms, 75MB)
테스트 5 〉	통과 (0.05ms, 70.1MB)
테스트 6 〉	통과 (0.04ms, 72.5MB)
테스트 7 〉	통과 (0.06ms, 74.4MB)
테스트 8 〉	통과 (0.06ms, 78.4MB)
테스트 9 〉	통과 (0.04ms, 74.1MB)
테스트 10 〉	통과 (0.03ms, 74.2MB)
테스트 11 〉	통과 (0.04ms, 67MB)
테스트 12 〉	통과 (0.05ms, 82.3MB)
테스트 13 〉	통과 (0.05ms, 69.9MB)
테스트 14 〉	통과 (0.05ms, 74.7MB)
테스트 15 〉	통과 (0.06ms, 78.3MB)

// 방법2
테스트 1 〉	통과 (1.25ms, 78.9MB)
테스트 2 〉	통과 (0.85ms, 73.5MB)
테스트 3 〉	통과 (0.99ms, 72.6MB)
테스트 4 〉	통과 (0.86ms, 74.1MB)
테스트 5 〉	통과 (0.86ms, 74.8MB)
테스트 6 〉	통과 (0.80ms, 75.6MB)
테스트 7 〉	통과 (0.76ms, 77.6MB)
테스트 8 〉	통과 (0.69ms, 73.5MB)
테스트 9 〉	통과 (1.11ms, 92.3MB)
테스트 10 〉	통과 (0.73ms, 76.2MB)
테스트 11 〉	통과 (0.66ms, 75.9MB)
테스트 12 〉	통과 (1.05ms, 73.6MB)
테스트 13 〉	통과 (0.93ms, 73.5MB)
테스트 14 〉	통과 (0.71ms, 75.7MB)
테스트 15 〉	통과 (0.72ms, 77MB)
 */

public class Sol5_날짜_비교하기 {
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		System.out.println(sol.solution2(new int[]{2021, 12, 28}, new int[]{2021, 12, 29}));
		System.out.println(sol.solution2(new int[]{1024, 10, 24}, new int[]{1024, 10, 24}));
	}
}

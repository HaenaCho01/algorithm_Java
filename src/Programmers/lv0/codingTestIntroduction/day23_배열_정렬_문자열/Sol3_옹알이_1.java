package Programmers.lv0.codingTestIntroduction.day23_배열_정렬_문자열;

import java.util.Arrays;

public class Sol3_옹알이_1 {
	public int solution(String[] babbling) {
		String[] canBabbling = {"aya", "ye", "woo", "ma"};
		int cnt = 0;
		for (int i = 0; i < babbling.length; i++) {
			String str = babbling[i];
			for (int j = 0; j < canBabbling.length; j++) {
				str = str.replace(canBabbling[j], " ");
			}
			str = str.replace(" ", "");
			if (str.equals("")) cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		Sol3_옹알이_1 sol = new Sol3_옹알이_1();
		System.out.println(sol.solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
		System.out.println(sol.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
	}
}

/*
테스트 1 〉	통과 (0.35ms, 73.3MB)
테스트 2 〉	통과 (1.02ms, 72.8MB)
테스트 3 〉	통과 (0.70ms, 76MB)
테스트 4 〉	통과 (0.64ms, 76.7MB)
테스트 5 〉	통과 (1.17ms, 76.8MB)
테스트 6 〉	통과 (0.37ms, 74.8MB)
테스트 7 〉	통과 (0.38ms, 74.7MB)
테스트 8 〉	통과 (1.23ms, 76.3MB)
테스트 9 〉	통과 (0.28ms, 72.1MB)
테스트 10 〉	통과 (0.36ms, 76.9MB)
테스트 11 〉	통과 (0.18ms, 78.3MB)
테스트 12 〉	통과 (0.05ms, 74.1MB)
테스트 13 〉	통과 (0.09ms, 76.6MB)
테스트 14 〉	통과 (0.11ms, 75.5MB)
테스트 15 〉	통과 (0.13ms, 77.9MB)
테스트 16 〉	통과 (0.11ms, 77.3MB)
테스트 17 〉	통과 (0.15ms, 75.9MB)
 */
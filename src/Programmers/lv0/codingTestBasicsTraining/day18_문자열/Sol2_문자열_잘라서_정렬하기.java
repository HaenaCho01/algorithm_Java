package Programmers.lv0.codingTestBasicsTraining.day18_문자열;

import java.util.Arrays;

class Solution2 {
	public String[] solution(String myString) {
		StringBuilder sb = new StringBuilder();
		if (myString.charAt(0) != 'x') {
			sb.append(myString.charAt(0));
		}
		for (int i = 1; i < myString.length(); i++) {
			if (!(myString.charAt(i) == 'x' && myString.charAt(i-1) == 'x')) {
				sb.append(myString.charAt(i));
			}
		}
		String[] answer = sb.toString().split("x");
		Arrays.sort(answer);
		return answer;
	}
}

/*
테스트 1 〉	통과 (26.56ms, 88.1MB)
테스트 2 〉	통과 (23.67ms, 77.9MB)
테스트 3 〉	통과 (6.66ms, 74.4MB)
테스트 4 〉	통과 (4.32ms, 77.8MB)
테스트 5 〉	통과 (9.86ms, 84.3MB)
테스트 6 〉	통과 (14.83ms, 81MB)
테스트 7 〉	통과 (10.86ms, 91.8MB)
테스트 8 〉	통과 (23.68ms, 77.1MB)
테스트 9 〉	통과 (22.88ms, 79.3MB)
테스트 10 〉	통과 (25.22ms, 82.7MB)
테스트 11 〉	통과 (15.13ms, 83.4MB)
 */

public class Sol2_문자열_잘라서_정렬하기 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		System.out.println(Arrays.toString(sol.solution("axbxcxdx")));
		System.out.println(Arrays.toString(sol.solution("dxccxbbbxaaaa")));
		System.out.println(Arrays.toString(sol.solution("axbxxxc")));
		System.out.println(Arrays.toString(sol.solution("xaxbxcx")));
	}
}

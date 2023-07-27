package Programmers.lv0.codingTestIntroduction.day15_문자열_해시_배열_수학;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol4_약수_구하기 {
	public int[] solution(int n) {
		List<Integer> answerList = new ArrayList<>();
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				answerList.add(i);
				if (n / i != i) {
					answerList.add(n / i);
				}
			}
		}
		int[] answer = new int[answerList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = answerList.get(i);
		}
		Arrays.sort(answer);
		return answer;
	}

/*
테스트 1 〉	통과 (0.54ms, 79.4MB)
테스트 2 〉	통과 (0.46ms, 75.4MB)
테스트 3 〉	통과 (0.53ms, 78.7MB)
테스트 4 〉	통과 (0.47ms, 70.9MB)
테스트 5 〉	통과 (0.61ms, 71.8MB)
테스트 6 〉	통과 (0.58ms, 74.4MB)
테스트 7 〉	통과 (0.51ms, 67.8MB)
테스트 8 〉	통과 (0.56ms, 69.7MB)
테스트 9 〉	통과 (0.39ms, 71.8MB)
테스트 10 〉	통과 (0.45ms, 94.5MB)
테스트 11 〉	통과 (0.57ms, 65.4MB)
테스트 12 〉	통과 (0.53ms, 68.5MB)
 */

	public static void main(String[] args) {
		Sol4_약수_구하기 sol = new Sol4_약수_구하기();
		System.out.println(Arrays.toString(sol.solution(24)));
		System.out.println(Arrays.toString(sol.solution(29)));
	}
}

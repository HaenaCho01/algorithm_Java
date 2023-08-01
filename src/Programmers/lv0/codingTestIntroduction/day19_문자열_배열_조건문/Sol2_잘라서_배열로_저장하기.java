package Programmers.lv0.codingTestIntroduction.day19_문자열_배열_조건문;

import java.util.Arrays;

public class Sol2_잘라서_배열로_저장하기 {
	public String[] solution(String my_str, int n) {
		int length = my_str.length();
		int size = length % n == 0 ? length / n : length / n + 1;
		String[] answer = new String[size];
		for (int i = 0, index = 0; i < length; i += n, index++) {
			if (i + n > length) answer[index] = my_str.substring(i);
			else answer[index] = my_str.substring(i, i + n);
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol2_잘라서_배열로_저장하기 sol = new Sol2_잘라서_배열로_저장하기();
		System.out.println(Arrays.toString(sol.solution("abc1Addfggg4556b", 6)));
		System.out.println(Arrays.toString(sol.solution("abcdef123", 3)));
	}
}

/*
테스트 1 〉	통과 (0.03ms, 72.9MB)
테스트 2 〉	통과 (0.02ms, 76.8MB)
테스트 3 〉	통과 (0.02ms, 77.2MB)
테스트 4 〉	통과 (0.02ms, 69.6MB)
테스트 5 〉	통과 (0.02ms, 85.6MB)
테스트 6 〉	통과 (0.02ms, 77.2MB)
테스트 7 〉	통과 (0.01ms, 79.3MB)
테스트 8 〉	통과 (0.03ms, 75.3MB)
 */
package Programmers.lv0.codingTestIntroduction.day13_문자열_배열_사칙연산_수학_조건문;

import java.util.Arrays;

public class Sol2_배열_원소의_길이 {
	public int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length];
		for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}
		return answer;
	}

	public int[] solutionOther(String[] strList) {
		return Arrays.stream(strList).mapToInt(String::length).toArray();
	}

	public static void main(String[] args) {
		Sol2_배열_원소의_길이 sol = new Sol2_배열_원소의_길이();
		System.out.println(Arrays.toString(sol.solution(new String[]{"We", "are", "the", "world!"})));
		System.out.println(Arrays.toString(sol.solutionOther(new String[]{"I", "love", "Programmers."})));
	}
}

/*
테스트 1 〉	통과 (0.01ms, 73.4MB)
테스트 2 〉	통과 (0.01ms, 74.6MB)
테스트 3 〉	통과 (0.02ms, 73.2MB)
테스트 4 〉	통과 (0.02ms, 78.9MB)
테스트 5 〉	통과 (0.02ms, 78MB)
테스트 6 〉	통과 (0.02ms, 72.6MB)
 */
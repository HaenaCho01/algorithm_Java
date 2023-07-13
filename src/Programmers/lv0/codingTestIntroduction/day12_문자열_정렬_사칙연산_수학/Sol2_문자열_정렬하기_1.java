package Programmers.lv0.codingTestIntroduction.day12_문자열_정렬_사칙연산_수학;

import java.util.Arrays;

public class Sol2_문자열_정렬하기_1 {
	public int[] solution(String my_string) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
				sb.append(my_string.charAt(i));
			}
		}
		int[] answer = new int[sb.length()];
		for (int i = 0; i < sb.length(); i++) {
			answer[i] = sb.charAt(i) - '0';
		}
		Arrays.sort(answer);
		return answer;
	}

	public int[] solutionOther1(String my_string) {
		my_string = my_string.replaceAll("[a-z]","");
		int[] answer = new int[my_string.length()];
		for(int i =0; i<my_string.length(); i++){
			answer[i] = my_string.charAt(i) - '0';
		}
		Arrays.sort(answer);
		return answer;
	}

	public int[] solutionOther2(String myString) {
		return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
	}

	public static void main(String[] args) {
		Sol2_문자열_정렬하기_1 sol = new Sol2_문자열_정렬하기_1();
		System.out.println(Arrays.toString(sol.solution("hi12392")));
		System.out.println(Arrays.toString(sol.solutionOther1("p2o4i8gj2")));
		System.out.println(Arrays.toString(sol.solutionOther2("abcde0")));
	}
}

/*
테스트 1 〉	통과 (1.09ms, 77.7MB)
테스트 2 〉	통과 (0.53ms, 84.2MB)
테스트 3 〉	통과 (0.53ms, 76.8MB)
테스트 4 〉	통과 (0.51ms, 65MB)
 */
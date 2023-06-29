package Programmers.lv0.codingTestBasicsTraining.day19_문자열_리스트배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1 {
	public String[] solution(String myStr) {
		List<String> strList = new ArrayList<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < myStr.length(); i++) {
			if (myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c') {
				if (sb.length() != 0) {
					strList.add(sb.toString());
				}
				sb = new StringBuilder();
			} else {
				sb.append(myStr.charAt(i));
			}

			if (i == myStr.length() - 1 && sb.length() != 0) {
				strList.add(sb.toString());
			}
		}

		if (strList.size() == 0) {
			strList.add("EMPTY");
		}

		String[] answer = new String[strList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = strList.get(i);
		}

		return answer;
	}
}

/*
테스트 1 〉	통과 (51.28ms, 105MB)
테스트 2 〉	통과 (44.50ms, 96.3MB)
테스트 3 〉	통과 (22.89ms, 94.3MB)
테스트 4 〉	통과 (18.18ms, 96.7MB)
테스트 5 〉	통과 (36.58ms, 101MB)
테스트 6 〉	통과 (34.60ms, 108MB)
테스트 7 〉	통과 (42.84ms, 104MB)
테스트 8 〉	통과 (40.94ms, 107MB)
테스트 9 〉	통과 (35.63ms, 108MB)
테스트 10 〉	통과 (44.17ms, 114MB)
테스트 11 〉	통과 (52.02ms, 96.7MB)
 */

public class Sol1_세_개의_구분자 {
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		System.out.println(Arrays.toString(sol.solution("baconlettucetomato")));
		System.out.println(Arrays.toString(sol.solution("abcd")));
		System.out.println(Arrays.toString(sol.solution("cabab")));
	}
}

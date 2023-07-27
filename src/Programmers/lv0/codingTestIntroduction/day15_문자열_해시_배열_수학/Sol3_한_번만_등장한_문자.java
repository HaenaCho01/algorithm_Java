package Programmers.lv0.codingTestIntroduction.day15_문자열_해시_배열_수학;

import java.util.*;

public class Sol3_한_번만_등장한_문자 {
	public String solution(String s) {
		Map <Character, Integer> strCnt = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			Character key = s.charAt(i);
			if (strCnt.containsKey(key)) {
				int value = strCnt.get(key) + 1;
				strCnt.put(key, value);
			} else {
				strCnt.put(key, 1);
			}
		}

		List<Character> strList = new ArrayList<>();
		for (Map.Entry<Character, Integer> entry : strCnt.entrySet()) {
			if (entry.getValue().equals(1)) {
				strList.add(entry.getKey());
			}
		}

		Collections.sort(strList);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strList.size(); i++) {
			sb.append(strList.get(i));
		}

		return sb.toString();
	}

/*
테스트 1 〉	통과 (0.50ms, 77.3MB)
테스트 2 〉	통과 (0.32ms, 74.9MB)
테스트 3 〉	통과 (0.38ms, 75MB)
테스트 4 〉	통과 (0.57ms, 73.9MB)
테스트 5 〉	통과 (0.44ms, 76.9MB)
테스트 6 〉	통과 (0.42ms, 77.9MB)
테스트 7 〉	통과 (0.49ms, 73.9MB)
테스트 8 〉	통과 (0.32ms, 79MB)
테스트 9 〉	통과 (0.32ms, 73.4MB)
테스트 10 〉	통과 (0.56ms, 77.1MB)
 */

	// 다른 사람의 풀이
	public String solutionOther(String s) {
		int[] alpha = new int[26];
		for(char c : s.toCharArray()){
			alpha[c - 'a']++;
		}

		StringBuilder answer = new StringBuilder();
		for(int i = 0; i < 26; i++){
			if(alpha[i] == 1){
				answer.append((char)(i + 'a'));
			}
		}
		return answer.toString();
	}

	public static void main(String[] args) {
		Sol3_한_번만_등장한_문자 sol = new Sol3_한_번만_등장한_문자();
		System.out.println(sol.solution("abcabcadc"));
		System.out.println(sol.solution("abdc"));
		System.out.println(sol.solution("hello"));
	}
}

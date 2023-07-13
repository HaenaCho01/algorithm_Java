package Programmers.lv0.codingTestIntroduction.day12_문자열_정렬_사칙연산_수학;

public class Sol1_모음_제거 {
	public String solution(String my_string) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < my_string.length(); i++) {
			char target = my_string.charAt(i);
			if(!(target == 'a' || target == 'e' || target == 'i' || target == 'o' || target == 'u')) {
				sb.append(target);
			}
		}
		return sb.toString();
	}

	public String solutionOther(String my_string) {
		return my_string.replaceAll("[aeiou]", "");
	}

	public static void main(String[] args) {
		Sol1_모음_제거 sol = new Sol1_모음_제거();
		System.out.println(sol.solution("bus"));
		System.out.println(sol.solutionOther("nice to meet you"));
	}
}

/*
테스트 1 〉	통과 (0.05ms, 74.6MB)
테스트 2 〉	통과 (0.04ms, 73.4MB)
테스트 3 〉	통과 (0.05ms, 77.3MB)
테스트 4 〉	통과 (0.02ms, 73MB)
테스트 5 〉	통과 (0.03ms, 79.8MB)
테스트 6 〉	통과 (0.03ms, 73.8MB)
 */
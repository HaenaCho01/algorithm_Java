package Programmers.lv0.codingTestIntroduction.day21_문자열_사칙연산_시뮬레이션_2차원배열_수학_배열;

public class Sol4_외계어_사전 {
	public int solution(String[] spell, String[] dic) {
		int answer = 0;
		for (int i = 0; i < dic.length; i++) {
			if (!(dic[i].length() == spell.length)) {
				answer = 2;
			}
			for (int j = 0; j < spell.length; j++) {
				if (!dic[i].contains(spell[j])) {
					answer = 2;
					break;
				}
				if (dic[i].contains(spell[j])) answer = 1;
			}
			if (answer == 1) break;
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol4_외계어_사전 sol = new Sol4_외계어_사전();
		System.out.println(sol.solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
		System.out.println(sol.solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
		System.out.println(sol.solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
	}
}

/*
테스트 1 〉	통과 (0.04ms, 75.9MB)
테스트 2 〉	통과 (0.05ms, 70.6MB)
테스트 3 〉	통과 (0.05ms, 74.8MB)
테스트 4 〉	통과 (0.05ms, 71.2MB)
테스트 5 〉	통과 (0.03ms, 79MB)
테스트 6 〉	통과 (0.05ms, 74.1MB)
테스트 7 〉	통과 (0.03ms, 80.3MB)
테스트 8 〉	통과 (0.03ms, 72.2MB)
테스트 9 〉	통과 (0.05ms, 75.4MB)
 */
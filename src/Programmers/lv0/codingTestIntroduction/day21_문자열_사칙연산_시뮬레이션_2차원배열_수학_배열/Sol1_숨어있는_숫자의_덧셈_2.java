package Programmers.lv0.codingTestIntroduction.day21_문자열_사칙연산_시뮬레이션_2차원배열_수학_배열;

public class Sol1_숨어있는_숫자의_덧셈_2 {
	public int solution(String my_string) {
		int answer = 0;
		StringBuilder num = new StringBuilder();
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
				num.append(my_string.charAt(i));
				if (i == my_string.length() - 1) {
					answer += Integer.parseInt(num.toString());
				}
			}
			else {
				if (num.length() > 0) {
					answer += Integer.parseInt(num.toString());
					num.setLength(0);
				}
			}
		}
		return answer;
	}

	public int solutionOther(String my_string) {
		int answer = 0;

		String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

		for(String s : str){
			if(!s.equals("")) answer += Integer.valueOf(s);
		}

		return answer;
	}

	public static void main(String[] args) {
		Sol1_숨어있는_숫자의_덧셈_2 sol = new Sol1_숨어있는_숫자의_덧셈_2();
		System.out.println(sol.solution("aAb1B2cC34oOp"));
		System.out.println(sol.solution("1a2b3c4d123Z"));
	}
}

/*
테스트 1 〉	통과 (0.06ms, 76.5MB)
테스트 2 〉	통과 (0.04ms, 74.1MB)
테스트 3 〉	통과 (0.06ms, 81.5MB)
테스트 4 〉	통과 (0.04ms, 75.7MB)
테스트 5 〉	통과 (0.07ms, 72.6MB)
테스트 6 〉	통과 (0.04ms, 72.4MB)
테스트 7 〉	통과 (0.05ms, 77.4MB)
테스트 8 〉	통과 (0.05ms, 75.5MB)
테스트 9 〉	통과 (0.06ms, 73.4MB)
테스트 10 〉	통과 (0.06ms, 84MB)
 */
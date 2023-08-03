package Programmers.lv0.codingTestIntroduction.day24_수학_시뮬레이션_문자열_조건문_반복문;

import java.util.Arrays;

public class Sol3_A로_B_만들기 {
	public int solution(String before, String after) {
		int answer = 1;
		String[] beforeArr = before.split("");
		String[] afterArr = after.split("");
		Arrays.sort(beforeArr);
		Arrays.sort(afterArr);
		for (int i = 0; i < beforeArr.length; i++) {
			if (!beforeArr[i].equals(afterArr[i])) {
				answer = 0;
				break;
			}
		}
		return answer;
	}

	public int solutionOther(String before, String after) {
		char[] a = before.toCharArray();
		char[] b = after.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);

		return new String(a).equals(new String(b)) ? 1 :0;
	}

	public static void main(String[] args) {
		Sol3_A로_B_만들기 sol = new Sol3_A로_B_만들기();
		System.out.println(sol.solution("olleh", "hello"));
		System.out.println(sol.solutionOther("allpe", "apple"));
	}
}

/*
테스트 1 〉	통과 (0.60ms, 80MB)
테스트 2 〉	통과 (0.35ms, 77.3MB)
테스트 3 〉	통과 (0.49ms, 76.9MB)
테스트 4 〉	통과 (0.58ms, 76.4MB)
테스트 5 〉	통과 (4.51ms, 74.8MB)
테스트 6 〉	통과 (0.40ms, 72.2MB)
테스트 7 〉	통과 (0.46ms, 72.1MB)
테스트 8 〉	통과 (4.29ms, 85.3MB)
테스트 9 〉	통과 (0.50ms, 77.6MB)
테스트 10 〉	통과 (2.23ms, 71.8MB)
테스트 11 〉	통과 (4.35ms, 84.1MB)
테스트 12 〉	통과 (5.73ms, 74.8MB)
테스트 13 〉	통과 (0.36ms, 77.4MB)
테스트 14 〉	통과 (0.31ms, 75.4MB)
테스트 15 〉	통과 (2.45ms, 74.1MB)
테스트 16 〉	통과 (3.61ms, 80.1MB)
테스트 17 〉	통과 (3.82ms, 76.7MB)
테스트 18 〉	통과 (6.35ms, 79.5MB)
테스트 19 〉	통과 (6.16ms, 72.2MB)
테스트 20 〉	통과 (4.46ms, 74.4MB)
테스트 21 〉	통과 (6.27ms, 81.9MB)
테스트 22 〉	통과 (0.35ms, 77.9MB)
테스트 23 〉	통과 (0.45ms, 73.7MB)
 */
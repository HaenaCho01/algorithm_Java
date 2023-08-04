package Programmers.lv1.prac_연습문제;

public class P_문자열_내_p와_y의_개수 {
	boolean solution(String s) {
		s = s.toUpperCase();
		int pCnt = 0; int yCnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'P') pCnt++;
			if (s.charAt(i) == 'Y') yCnt++;
		}
		return pCnt == yCnt;
	}

	public static void main(String[] args) {
		P_문자열_내_p와_y의_개수 sol = new P_문자열_내_p와_y의_개수();
		System.out.println(sol.solution("pPoooyY"));
		System.out.println(sol.solution("Pyy"));
	}
}

/*

테스트 1 〉	통과 (0.03ms, 74.8MB)
테스트 2 〉	통과 (0.03ms, 72.8MB)
테스트 3 〉	통과 (0.02ms, 71.9MB)
테스트 4 〉	통과 (0.02ms, 75.6MB)
테스트 5 〉	통과 (0.04ms, 79.5MB)
테스트 6 〉	통과 (0.03ms, 73.6MB)
테스트 7 〉	통과 (0.03ms, 78.5MB)
테스트 8 〉	통과 (0.03ms, 75.4MB)
테스트 9 〉	통과 (0.03ms, 72.4MB)
테스트 10 〉	통과 (0.04ms, 75.1MB)
테스트 11 〉	통과 (0.06ms, 77.7MB)
테스트 12 〉	통과 (0.06ms, 71.9MB)
테스트 13 〉	통과 (0.03ms, 75.8MB)
테스트 14 〉	통과 (0.03ms, 73.7MB)
테스트 15 〉	통과 (0.05ms, 72.9MB)
테스트 16 〉	통과 (0.03ms, 74MB)
테스트 17 〉	통과 (0.04ms, 76.2MB)
테스트 18 〉	통과 (0.03ms, 73.4MB)
테스트 19 〉	통과 (0.04ms, 78.3MB)
테스트 20 〉	통과 (0.03ms, 76.7MB)
테스트 21 〉	통과 (0.03ms, 77.8MB)
테스트 22 〉	통과 (0.03ms, 77.6MB)
테스트 23 〉	통과 (0.04ms, 70.6MB)
테스트 24 〉	통과 (0.04ms, 74.4MB)
테스트 25 〉	통과 (0.03ms, 72.1MB)
테스트 26 〉	통과 (0.03ms, 75MB)
테스트 27 〉	통과 (0.03ms, 73.7MB)
테스트 28 〉	통과 (0.04ms, 80.3MB)
테스트 29 〉	통과 (0.03ms, 74.9MB)
테스트 30 〉	통과 (0.03ms, 75.9MB)
 */
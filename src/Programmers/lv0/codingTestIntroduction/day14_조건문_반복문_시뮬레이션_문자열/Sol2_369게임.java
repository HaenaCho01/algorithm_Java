package Programmers.lv0.codingTestIntroduction.day14_조건문_반복문_시뮬레이션_문자열;

public class Sol2_369게임 {
	public int solution(int order) {
		int answer = 0;
		String str = Integer.toString(order);
		for (int i = 0; i < str.length(); i++) {
			char target = str.charAt(i);
			if (target == '3' || target == '6' || target == '9') answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol2_369게임 sol = new Sol2_369게임();
		System.out.println(sol.solution(3));
		System.out.println(sol.solution(29423));
	}
}

/*
테스트 1 〉	통과 (0.04ms, 78MB)
테스트 2 〉	통과 (0.03ms, 73.2MB)
테스트 3 〉	통과 (0.02ms, 74.1MB)
테스트 4 〉	통과 (0.03ms, 75.4MB)
테스트 5 〉	통과 (0.02ms, 77.8MB)
테스트 6 〉	통과 (0.02ms, 76.9MB)
테스트 7 〉	통과 (0.03ms, 82.6MB)
테스트 8 〉	통과 (0.02ms, 84.9MB)
테스트 9 〉	통과 (0.03ms, 76.8MB)
테스트 10 〉	통과 (0.02ms, 71.4MB)
테스트 11 〉	통과 (0.03ms, 73.7MB)
테스트 12 〉	통과 (0.03ms, 77.9MB)
테스트 13 〉	통과 (0.02ms, 74MB)
테스트 14 〉	통과 (0.03ms, 71.4MB)
 */
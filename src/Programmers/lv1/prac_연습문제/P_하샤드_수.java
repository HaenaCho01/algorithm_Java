package Programmers.lv1.prac_연습문제;

public class P_하샤드_수 {
	public boolean solution(int x) {
		String str = String.valueOf(x);
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		return x % sum == 0;
	}

	public static void main(String[] args) {
		P_하샤드_수 sol = new P_하샤드_수();
		System.out.println(sol.solution(10));
		System.out.println(sol.solution(12));
		System.out.println(sol.solution(11));
		System.out.println(sol.solution(13));
	}
}

/*
테스트 1 〉	통과 (0.03ms, 77.4MB)
테스트 2 〉	통과 (0.03ms, 81.8MB)
테스트 3 〉	통과 (0.04ms, 72.5MB)
테스트 4 〉	통과 (0.02ms, 76.2MB)
테스트 5 〉	통과 (0.04ms, 70MB)
테스트 6 〉	통과 (0.03ms, 76.9MB)
테스트 7 〉	통과 (0.03ms, 72.4MB)
테스트 8 〉	통과 (0.03ms, 75.7MB)
테스트 9 〉	통과 (0.04ms, 73.5MB)
테스트 10 〉	통과 (0.04ms, 78.5MB)
테스트 11 〉	통과 (0.03ms, 71.4MB)
테스트 12 〉	통과 (0.03ms, 74.5MB)
테스트 13 〉	통과 (0.03ms, 76MB)
테스트 14 〉	통과 (0.03ms, 77.7MB)
테스트 15 〉	통과 (0.03ms, 73.8MB)
테스트 16 〉	통과 (0.03ms, 79.6MB)
테스트 17 〉	통과 (0.02ms, 73.5MB)
 */
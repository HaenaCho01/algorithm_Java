package Programmers.lv1.prac_연습문제;

public class P_자릿수_더하기 {
	public int solution(int n) {
		String num = String.valueOf(n);
		int answer = 0;
		for (int i = 0; i < num.length(); i++) {
			answer += num.charAt(i) - '0';
		}
		return answer;
	}

	public static void main(String[] args) {
		P_자릿수_더하기 sol = new P_자릿수_더하기();
		System.out.println(sol.solution(123));
		System.out.println(sol.solution(987));
	}
}

/*
테스트 1 〉	통과 (0.04ms, 66.4MB)
테스트 2 〉	통과 (0.03ms, 82MB)
테스트 3 〉	통과 (0.02ms, 76.2MB)
테스트 4 〉	통과 (0.02ms, 81.6MB)
테스트 5 〉	통과 (0.02ms, 78.7MB)
테스트 6 〉	통과 (0.03ms, 73.1MB)
테스트 7 〉	통과 (0.03ms, 73.7MB)
테스트 8 〉	통과 (0.04ms, 91.7MB)
테스트 9 〉	통과 (0.03ms, 80.2MB)
테스트 10 〉	통과 (0.02ms, 75.9MB)
테스트 11 〉	통과 (0.03ms, 81.7MB)
테스트 12 〉	통과 (0.04ms, 75.8MB)
테스트 13 〉	통과 (0.04ms, 72.8MB)
테스트 14 〉	통과 (0.03ms, 75.1MB)
테스트 15 〉	통과 (0.03ms, 72.9MB)
테스트 16 〉	통과 (0.03ms, 75.6MB)
테스트 17 〉	통과 (0.02ms, 76MB)
테스트 18 〉	통과 (0.03ms, 72.4MB)
테스트 19 〉	통과 (0.03ms, 70.6MB)
테스트 20 〉	통과 (0.03ms, 72.3MB)
테스트 21 〉	통과 (0.03ms, 75.3MB)
 */
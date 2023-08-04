package Programmers.lv1.prac_연습문제;

public class P_짝수와_홀수 {
	public String solution(int num) {
		return num % 2 == 0 ? "Even" : "Odd";
	}

	public static void main(String[] args) {
		P_짝수와_홀수 sol = new P_짝수와_홀수();
		System.out.println(sol.solution(3));
		System.out.println(sol.solution(4));
	}
}

/*
테스트 1 〉	통과 (0.03ms, 71.4MB)
테스트 2 〉	통과 (0.02ms, 73.6MB)
테스트 3 〉	통과 (0.02ms, 73.3MB)
테스트 4 〉	통과 (0.02ms, 73.9MB)
테스트 5 〉	통과 (0.03ms, 75.3MB)
테스트 6 〉	통과 (0.01ms, 75.6MB)
테스트 7 〉	통과 (0.01ms, 72.6MB)
테스트 8 〉	통과 (0.02ms, 70.4MB)
테스트 9 〉	통과 (0.01ms, 75.6MB)
테스트 10 〉	통과 (0.01ms, 73.2MB)
테스트 11 〉	통과 (0.02ms, 78.5MB)
테스트 12 〉	통과 (0.01ms, 75MB)
테스트 13 〉	통과 (0.02ms, 77.5MB)
테스트 14 〉	통과 (0.01ms, 76.1MB)
테스트 15 〉	통과 (0.01ms, 73.4MB)
테스트 16 〉	통과 (0.02ms, 76.4MB)
 */
package Programmers.lv1.prac_연습문제;

public class P_정수_제곱근_판별 {
	public long solution(long n) {
		double sqrt = Math.sqrt(n);
		return sqrt == (int) sqrt ? (long) ((sqrt + 1) * (sqrt + 1)) : -1;
	}

	public static void main(String[] args) {
		P_정수_제곱근_판별 sol = new P_정수_제곱근_판별();
		System.out.println(sol.solution(121));
		System.out.println(sol.solution(3));
		System.out.println(sol.solution(101));
	}
}

/*
테스트 1 〉	통과 (0.06ms, 77.4MB)
테스트 2 〉	통과 (0.03ms, 84.6MB)
테스트 3 〉	통과 (0.05ms, 76.8MB)
테스트 4 〉	통과 (0.03ms, 76MB)
테스트 5 〉	통과 (0.05ms, 72.9MB)
테스트 6 〉	통과 (0.15ms, 72.2MB)
테스트 7 〉	통과 (0.03ms, 74.8MB)
테스트 8 〉	통과 (0.03ms, 83.3MB)
테스트 9 〉	통과 (0.02ms, 74.2MB)
테스트 10 〉	통과 (0.03ms, 73.9MB)
테스트 11 〉	통과 (0.02ms, 72.3MB)
테스트 12 〉	통과 (0.02ms, 73.8MB)
테스트 13 〉	통과 (0.09ms, 66.5MB)
테스트 14 〉	통과 (0.03ms, 79.4MB)
테스트 15 〉	통과 (0.03ms, 76.4MB)
테스트 16 〉	통과 (0.04ms, 77.9MB)
테스트 17 〉	통과 (0.02ms, 78.7MB)
테스트 18 〉	통과 (0.02ms, 85.1MB)
 */
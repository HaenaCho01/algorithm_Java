package Programmers.lv0.codingTestBasicsTraining.day21_함수메서드;

class Solution3 {
	public int solution(double flo) {
		return (int) flo;
	}
}

/*
테스트 1 〉	통과 (0.02ms, 65.9MB)
테스트 2 〉	통과 (0.02ms, 75.5MB)
테스트 3 〉	통과 (0.02ms, 79.7MB)
테스트 4 〉	통과 (0.02ms, 74.9MB)
테스트 5 〉	통과 (0.02ms, 73.1MB)
테스트 6 〉	통과 (0.03ms, 71.2MB)
테스트 7 〉	통과 (0.03ms, 76.3MB)
테스트 8 〉	통과 (0.02ms, 76.8MB)
테스트 9 〉	통과 (0.03ms, 73.1MB)
테스트 10 〉	통과 (0.04ms, 72MB)
 */

public class Sol3_정수_부분 {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		System.out.println(sol.solution(1.42));
		System.out.println(sol.solution(69.32));
	}
}

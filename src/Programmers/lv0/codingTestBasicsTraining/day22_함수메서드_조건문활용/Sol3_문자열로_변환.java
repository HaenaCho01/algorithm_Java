package Programmers.lv0.codingTestBasicsTraining.day22_함수메서드_조건문활용;

class Solution3 {
	public String solution(int n) {
		return String.valueOf(n);
	}
}

/*
테스트 1 〉	통과 (0.03ms, 77MB)
테스트 2 〉	통과 (0.03ms, 73.9MB)
테스트 3 〉	통과 (0.03ms, 71.2MB)
테스트 4 〉	통과 (0.03ms, 74.4MB)
테스트 5 〉	통과 (0.03ms, 77.7MB)
테스트 6 〉	통과 (0.02ms, 76.4MB)
테스트 7 〉	통과 (0.02ms, 77.7MB)
테스트 8 〉	통과 (0.03ms, 77.8MB)
테스트 9 〉	통과 (0.02ms, 78.8MB)
테스트 10 〉	통과 (0.02ms, 75.6MB)
 */

public class Sol3_문자열로_변환 {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		System.out.println(sol.solution(123));
		System.out.println(sol.solution(2573));
	}
}

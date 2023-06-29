package Programmers.lv0.codingTestBasicsTraining.day22_함수메서드_조건문활용;

class Solution1 {
	public String solution(String n_str) {
		return String.valueOf(Integer.parseInt(n_str));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 74.8MB)
테스트 2 〉	통과 (0.02ms, 64.9MB)
테스트 3 〉	통과 (0.02ms, 70.1MB)
테스트 4 〉	통과 (0.03ms, 77.3MB)
테스트 5 〉	통과 (0.03ms, 67.1MB)
테스트 6 〉	통과 (0.04ms, 74.2MB)
테스트 7 〉	통과 (0.03ms, 73.9MB)
테스트 8 〉	통과 (0.04ms, 75.7MB)
테스트 9 〉	통과 (0.03ms, 74MB)
테스트 10 〉	통과 (0.04ms, 72.1MB)
 */

public class Sol1_0_떼기 {
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		System.out.println(sol.solution("0010"));
		System.out.println(sol.solution("854020"));
	}
}

package Programmers.lv0.codingTestBasicsTraining.day22_함수메서드_조건문활용;

class Solution5 {
	public int solution(String my_string, String target) {
		int answer = 0;
		if (my_string.contains(target)) {
			answer = 1;
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.02ms, 71.8MB)
테스트 2 〉	통과 (0.03ms, 74.7MB)
테스트 3 〉	통과 (0.03ms, 73.7MB)
테스트 4 〉	통과 (0.03ms, 77.3MB)
테스트 5 〉	통과 (0.02ms, 65.5MB)
테스트 6 〉	통과 (0.03ms, 76.9MB)
테스트 7 〉	통과 (0.02ms, 75.3MB)
테스트 8 〉	통과 (0.02ms, 73.2MB)
테스트 9 〉	통과 (0.04ms, 77MB)
테스트 10 〉	통과 (0.03ms, 89.4MB)
테스트 11 〉	통과 (0.03ms, 73.3MB)
테스트 12 〉	통과 (0.03ms, 79.2MB)
테스트 13 〉	통과 (0.02ms, 67.7MB)
테스트 14 〉	통과 (0.03ms, 73.1MB)
테스트 15 〉	통과 (0.06ms, 77MB)
테스트 16 〉	통과 (0.04ms, 74.9MB)
테스트 17 〉	통과 (0.03ms, 90.8MB)
테스트 18 〉	통과 (0.02ms, 77.5MB)
테스트 19 〉	통과 (0.03ms, 72.8MB)
테스트 20 〉	통과 (0.03ms, 71.1MB)
테스트 21 〉	통과 (0.02ms, 75.9MB)
 */

public class Sol5_부분_문자열인지_확인하기 {
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		System.out.println(sol.solution("banana", "ana"));
		System.out.println(sol.solution("banana", "wxyz"));
	}
}

package Programmers.lv0.codingTestBasicsTraining.day23_조건문활용;

class Solution4 {
	public int solution(int a, int b) {
		int answer = 0;
		if (a % 2 == 1 && b % 2 == 1) {
			answer = a*a + b*b;
		} else if (a % 2 == 0 && b % 2 == 0) {
			answer = a - b > 0 ? a - b : -(a - b);
		} else {
			answer = 2 * (a + b);
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.02ms, 70.9MB)
테스트 2 〉	통과 (0.03ms, 74MB)
테스트 3 〉	통과 (0.01ms, 74.4MB)
테스트 4 〉	통과 (0.02ms, 78.1MB)
테스트 5 〉	통과 (0.03ms, 77.3MB)
테스트 6 〉	통과 (0.02ms, 75.6MB)
테스트 7 〉	통과 (0.03ms, 71.8MB)
테스트 8 〉	통과 (0.01ms, 73MB)
테스트 9 〉	통과 (0.01ms, 73.5MB)
테스트 10 〉	통과 (0.01ms, 78.8MB)
테스트 11 〉	통과 (0.01ms, 70.6MB)
테스트 12 〉	통과 (0.02ms, 73.8MB)
테스트 13 〉	통과 (0.02ms, 77.7MB)
테스트 14 〉	통과 (0.01ms, 78.7MB)
테스트 15 〉	통과 (0.02ms, 73.2MB)
테스트 16 〉	통과 (0.02ms, 73.7MB)
테스트 17 〉	통과 (0.02ms, 74.7MB)
테스트 18 〉	통과 (0.02ms, 73.1MB)
테스트 19 〉	통과 (0.01ms, 77.7MB)
테스트 20 〉	통과 (0.01ms, 76.5MB)
테스트 21 〉	통과 (0.02ms, 76.1MB)
테스트 22 〉	통과 (0.01ms, 73.3MB)
테스트 23 〉	통과 (0.02ms, 77.1MB)
테스트 24 〉	통과 (0.02ms, 83.4MB)
테스트 25 〉	통과 (0.02ms, 73.1MB)
테스트 26 〉	통과 (0.01ms, 74MB)
테스트 27 〉	통과 (0.03ms, 75.8MB)
테스트 28 〉	통과 (0.01ms, 72.5MB)
테스트 29 〉	통과 (0.01ms, 71.8MB)
테스트 30 〉	통과 (0.03ms, 66.5MB)
테스트 31 〉	통과 (0.02ms, 73.3MB)
테스트 32 〉	통과 (0.02ms, 74.9MB)
테스트 33 〉	통과 (0.02ms, 79.4MB)
테스트 34 〉	통과 (0.02ms, 69.9MB)
테스트 35 〉	통과 (0.02ms, 72.3MB)
테스트 36 〉	통과 (0.01ms, 71.5MB)
 */

public class Sol4_주사위_게임_1 {
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		System.out.println(sol.solution(3, 5));
		System.out.println(sol.solution(6, 1));
		System.out.println(sol.solution(2, 4));
	}
}

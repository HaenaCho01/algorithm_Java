package Programmers.lv0.codingTestBasicsTraining.day23_조건문활용;

class Solution3 {
	public int solution(int[] num_list, int n) {
		int answer = 0;
		for (int i : num_list) {
			if (i == n) {
				answer = 1;
				break;
			}
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.02ms, 76.4MB)
테스트 2 〉	통과 (0.03ms, 75.9MB)
테스트 3 〉	통과 (0.02ms, 76.2MB)
테스트 4 〉	통과 (0.03ms, 72.7MB)
테스트 5 〉	통과 (0.02ms, 79.3MB)
테스트 6 〉	통과 (0.02ms, 72.2MB)
테스트 7 〉	통과 (0.02ms, 79.3MB)
테스트 8 〉	통과 (0.02ms, 77.4MB)
테스트 9 〉	통과 (0.03ms, 67.5MB)
테스트 10 〉	통과 (0.01ms, 71.9MB)
테스트 11 〉	통과 (0.02ms, 66.8MB)
테스트 12 〉	통과 (0.02ms, 71.9MB)
테스트 13 〉	통과 (0.02ms, 72.5MB)
테스트 14 〉	통과 (0.02ms, 74.8MB)
테스트 15 〉	통과 (0.02ms, 68.7MB)
테스트 16 〉	통과 (0.03ms, 81MB)
테스트 17 〉	통과 (0.02ms, 72MB)
테스트 18 〉	통과 (0.02ms, 71.1MB)
테스트 19 〉	통과 (0.03ms, 71.9MB)
 */

public class Sol3_정수_찾기 {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		System.out.println(sol.solution(new int[]{1, 2, 3, 4, 5}, 3));
		System.out.println(sol.solution(new int[]{15,98,23,2,15}, 20));
	}
}

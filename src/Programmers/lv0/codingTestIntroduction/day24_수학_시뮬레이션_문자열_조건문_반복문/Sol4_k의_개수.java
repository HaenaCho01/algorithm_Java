package Programmers.lv0.codingTestIntroduction.day24_수학_시뮬레이션_문자열_조건문_반복문;

public class Sol4_k의_개수 {
	public int solution(int i, int j, int k) {
		int cnt = 0;
		for (int num = i; num <= j; num++) {
			if (Integer.toString(num).contains(Integer.toString(k))) {
				for (int target = 0; target < Integer.toString(num).length(); target++) {
					if (Integer.toString(num).charAt(target) - '0' == k) cnt++;
				}
			}
		}
		return cnt;
	}

	public int solutionOther(int i, int j, int k) {
		int answer = 0;

		for (int num = i; num <= j; num++){
			int tmp = num;
			while (tmp != 0){
				if (tmp % 10 == k)
					answer++;
				tmp /= 10;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol4_k의_개수 sol = new Sol4_k의_개수();
		System.out.println(sol.solution(1, 13, 1));
		System.out.println(sol.solution(10, 50, 5));
		System.out.println(sol.solutionOther(3, 10, 2));
	}
}

/*
테스트 1 〉	통과 (48.81ms, 106MB)
테스트 2 〉	통과 (0.04ms, 67.6MB)
테스트 3 〉	통과 (0.05ms, 72.7MB)
테스트 4 〉	통과 (9.27ms, 78.8MB)
테스트 5 〉	통과 (3.91ms, 74.2MB)
테스트 6 〉	통과 (0.06ms, 81.1MB)
테스트 7 〉	통과 (1.36ms, 78.1MB)
테스트 8 〉	통과 (11.99ms, 80.7MB)
 */
package Programmers.lv0.codingTestIntroduction.day11_수학_반복문;

public class Sol2_합성수_찾기 {
	public int solution(int n) {
		int answer = 0;
		for (int num = 1; num <= n; num++) {
			int measureCnt = 0;
			for (int i = 1; i * i <= num; i++) {
				if(i * i == num) measureCnt++;
				else if (num % i == 0) measureCnt += 2;
				if(measureCnt >= 3) {answer++; break;}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol2_합성수_찾기 sol = new Sol2_합성수_찾기();
		System.out.println(sol.solution(10));
		System.out.println(sol.solution(15));
	}
}

/*
테스트 1 〉	통과 (0.04ms, 78.9MB)
테스트 2 〉	통과 (0.03ms, 76.1MB)
테스트 3 〉	통과 (0.03ms, 75.5MB)
테스트 4 〉	통과 (0.02ms, 78.2MB)
테스트 5 〉	통과 (0.02ms, 76.4MB)
테스트 6 〉	통과 (0.02ms, 73.8MB)
 */
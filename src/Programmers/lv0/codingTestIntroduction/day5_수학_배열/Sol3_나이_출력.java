package Programmers.lv0.codingTestIntroduction.day5_수학_배열;

public class Sol3_나이_출력 {
	public int solution(int age) {
		return 2022 - age + 1;
	}

	public static void main(String[] args) {
		Sol3_나이_출력 sol = new Sol3_나이_출력();
		System.out.println(sol.solution(40));
		System.out.println(sol.solution(23));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 75.7MB)
테스트 2 〉	통과 (0.02ms, 76.1MB)
테스트 3 〉	통과 (0.02ms, 70.4MB)
테스트 4 〉	통과 (0.03ms, 78.9MB)
테스트 5 〉	통과 (0.03ms, 80.4MB)
테스트 6 〉	통과 (0.02ms, 77.3MB)
테스트 7 〉	통과 (0.01ms, 79.4MB)
테스트 8 〉	통과 (0.02ms, 73MB)
테스트 9 〉	통과 (0.03ms, 74MB)
테스트 10 〉	통과 (0.03ms, 71.5MB)
테스트 11 〉	통과 (0.03ms, 78.3MB)
테스트 12 〉	통과 (0.02ms, 79.7MB)
 */

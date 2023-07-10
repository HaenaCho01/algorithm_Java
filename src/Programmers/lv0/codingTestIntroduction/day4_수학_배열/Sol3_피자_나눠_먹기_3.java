package Programmers.lv0.codingTestIntroduction.day4_수학_배열;

public class Sol3_피자_나눠_먹기_3 {
	public int solution(int slice, int n) {
		return n % slice == 0 ? n / slice : n / slice + 1;
	}

	public static void main(String[] args) {
		Sol3_피자_나눠_먹기_3 sol = new Sol3_피자_나눠_먹기_3();
		System.out.println(sol.solution(7, 10));
		System.out.println(sol.solution(4,12));
	}
}

/*
테스트 1 〉	통과 (0.01ms, 75.3MB)
테스트 2 〉	통과 (0.01ms, 83.5MB)
테스트 3 〉	통과 (0.01ms, 74.3MB)
테스트 4 〉	통과 (0.01ms, 73.6MB)
테스트 5 〉	통과 (0.02ms, 69.8MB)
테스트 6 〉	통과 (0.02ms, 73.8MB)
테스트 7 〉	통과 (0.01ms, 78.2MB)
테스트 8 〉	통과 (0.02ms, 71.9MB)
테스트 9 〉	통과 (0.01ms, 74.6MB)
테스트 10 〉	통과 (0.03ms, 79.7MB)
테스트 11 〉	통과 (0.05ms, 73.6MB)
테스트 12 〉	통과 (0.04ms, 75.8MB)
테스트 13 〉	통과 (0.01ms, 73.2MB)
테스트 14 〉	통과 (0.02ms, 73.7MB)
테스트 15 〉	통과 (0.02ms, 73.7MB)
테스트 16 〉	통과 (0.01ms, 76.8MB)
테스트 17 〉	통과 (0.02ms, 74.6MB)
테스트 18 〉	통과 (0.01ms, 72.5MB)
테스트 19 〉	통과 (0.02ms, 68.9MB)
테스트 20 〉	통과 (0.02ms, 81.9MB)
테스트 21 〉	통과 (0.02ms, 73.2MB)
테스트 22 〉	통과 (0.02ms, 75.4MB)
테스트 23 〉	통과 (0.03ms, 73.6MB)
테스트 24 〉	통과 (0.02ms, 79.7MB)
테스트 25 〉	통과 (0.01ms, 80.3MB)
 */
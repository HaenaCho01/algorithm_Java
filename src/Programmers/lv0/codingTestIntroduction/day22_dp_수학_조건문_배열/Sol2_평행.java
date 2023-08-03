package Programmers.lv0.codingTestIntroduction.day22_dp_수학_조건문_배열;

public class Sol2_평행 {
	public int solution(int[][] dots) {
		int[] a = dots[0]; int[] b = dots[1]; int[] c = dots[2]; int[] d = dots[3];
		// 직선의 기울기 = y 값의 증가량 / x 값의 증가량
		double ab = (double) (a[1] - b[1]) / (a[0] - b[0]);
		double ac = (double) (a[1] - c[1]) / (a[0] - c[0]);
		double ad = (double) (a[1] - d[1]) / (a[0] - d[0]);
		double bc = (double) (b[1] - c[1]) / (b[0] - c[0]);
		double bd = (double) (b[1] - d[1]) / (b[0] - d[0]);
		double cd = (double) (c[1] - d[1]) / (c[0] - d[0]);
		return (ab == cd || ac == bd || ad == bc) ? 1 : 0;
	}

	public static void main(String[] args) {
		Sol2_평행 sol = new Sol2_평행();
		System.out.println(sol.solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}}));
		System.out.println(sol.solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}}));
		System.out.println(sol.solution(new int[][]{{3, 5}, {4, 4}, {8, 9}, {6, 11}}));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 76.1MB)
테스트 2 〉	통과 (0.04ms, 76.8MB)
테스트 3 〉	통과 (0.04ms, 77.8MB)
테스트 4 〉	통과 (0.03ms, 69.9MB)
테스트 5 〉	통과 (0.02ms, 81.4MB)
테스트 6 〉	통과 (0.03ms, 71.1MB)
테스트 7 〉	통과 (0.02ms, 78.9MB)
테스트 8 〉	통과 (0.02ms, 74MB)
테스트 9 〉	통과 (0.01ms, 79.7MB)
테스트 10 〉	통과 (0.01ms, 78.6MB)
테스트 11 〉	통과 (0.03ms, 70.2MB)
테스트 12 〉	통과 (0.01ms, 73.9MB)
테스트 13 〉	통과 (0.03ms, 72.5MB)
테스트 14 〉	통과 (0.02ms, 71.7MB)
테스트 15 〉	통과 (0.02ms, 74.2MB)
테스트 16 〉	통과 (0.01ms, 72.8MB)
테스트 17 〉	통과 (0.02ms, 77.6MB)
 */
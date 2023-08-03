package Programmers.lv0.codingTestIntroduction.day24_수학_시뮬레이션_문자열_조건문_반복문;

public class Sol1_치킨_쿠폰 {
	public int solution(int chicken) {
		int coupon = chicken;
		int service = 0;
		while (true) {
			int order = coupon / 10;
			service += order;
			coupon = coupon - (order * 10) + order;
			if (coupon < 10) break;
		}
		return service;
	}

	public static void main(String[] args) {
		Sol1_치킨_쿠폰 sol = new Sol1_치킨_쿠폰();
		System.out.println(sol.solution(100));
		System.out.println(sol.solution(1081));
	}
}

/*

테스트 1 〉	통과 (0.02ms, 76.8MB)
테스트 2 〉	통과 (0.01ms, 78.8MB)
테스트 3 〉	통과 (0.02ms, 79.5MB)
테스트 4 〉	통과 (0.03ms, 76MB)
테스트 5 〉	통과 (0.03ms, 83.4MB)
테스트 6 〉	통과 (0.02ms, 76.4MB)
테스트 7 〉	통과 (0.01ms, 76.8MB)
테스트 8 〉	통과 (0.03ms, 91.7MB)
테스트 9 〉	통과 (0.01ms, 77.2MB)
테스트 10 〉	통과 (0.02ms, 72.3MB)
 */
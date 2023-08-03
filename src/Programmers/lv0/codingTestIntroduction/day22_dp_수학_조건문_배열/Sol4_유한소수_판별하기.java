package Programmers.lv0.codingTestIntroduction.day22_dp_수학_조건문_배열;

import java.util.HashSet;

public class Sol4_유한소수_판별하기 {
	public int solution(int a, int b) {
		// 기약분수 만들기
		for (int i = 2; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				a /= i; b /= i;
			}
		}

		// 분모 소인수분해
		HashSet<Integer> primeFactor = new HashSet<>();
		for(int i = 2; i <= b; i++) {
			while(b % i == 0) {
				primeFactor.add(i);
				b /= i;
			}
		}

		// 소인수가 1만 있거나, 2와 5만 존재하는 경우 1 return / 아닐 경우 2 return
		return (primeFactor.size() == 0
				|| (primeFactor.size() == 1 && (primeFactor.contains(2) || primeFactor.contains(5)))
				|| (primeFactor.size() == 2 && (primeFactor.contains(2) && primeFactor.contains(5)))) ? 1 : 2;
	}

	public static void main(String[] args) {
		Sol4_유한소수_판별하기 sol = new Sol4_유한소수_판별하기();
		System.out.println(sol.solution(7, 20));
		System.out.println(sol.solution(11, 22));
		System.out.println(sol.solution(12, 21));
		System.out.println(sol.solution(3500, 500));
	}
}

/*
테스트 1 〉	통과 (0.18ms, 76.8MB)
테스트 2 〉	통과 (0.08ms, 73.1MB)
테스트 3 〉	통과 (0.07ms, 74.2MB)
테스트 4 〉	통과 (0.04ms, 75.6MB)
테스트 5 〉	통과 (0.09ms, 73.2MB)
테스트 6 〉	통과 (0.04ms, 73.7MB)
테스트 7 〉	통과 (0.05ms, 76.1MB)
테스트 8 〉	통과 (0.04ms, 72.3MB)
테스트 9 〉	통과 (0.05ms, 81.7MB)
테스트 10 〉	통과 (0.06ms, 74.7MB)
테스트 11 〉	통과 (0.07ms, 74MB)
테스트 12 〉	통과 (0.09ms, 77.9MB)
테스트 13 〉	통과 (0.12ms, 70.9MB)
테스트 14 〉	통과 (0.05ms, 72MB)
테스트 15 〉	통과 (0.04ms, 77.8MB)
테스트 16 〉	통과 (0.13ms, 75.4MB)
테스트 17 〉	통과 (0.19ms, 71MB)
테스트 18 〉	통과 (0.11ms, 77.1MB)
테스트 19 〉	통과 (0.16ms, 71.8MB)
테스트 20 〉	통과 (0.06ms, 71MB)
테스트 21 〉	통과 (0.05ms, 75.2MB)
테스트 22 〉	통과 (0.07ms, 74.9MB)
테스트 23 〉	통과 (0.15ms, 73.8MB)
테스트 24 〉	통과 (0.04ms, 83.5MB)
테스트 25 〉	통과 (0.10ms, 76.5MB)
테스트 26 〉	통과 (0.06ms, 73.1MB)
테스트 27 〉	통과 (0.05ms, 75.6MB)
테스트 28 〉	통과 (0.13ms, 75.5MB)
테스트 29 〉	통과 (0.14ms, 77.3MB)
테스트 30 〉	통과 (0.06ms, 77.4MB)
테스트 31 〉	통과 (0.04ms, 75.9MB)
테스트 32 〉	통과 (0.07ms, 83.4MB)
테스트 33 〉	통과 (0.09ms, 73.8MB)
테스트 34 〉	통과 (0.09ms, 74.1MB)
테스트 35 〉	통과 (0.06ms, 73.8MB)
테스트 36 〉	통과 (0.06ms, 73.4MB)
테스트 37 〉	통과 (0.08ms, 77.1MB)
테스트 38 〉	통과 (0.06ms, 77.6MB)
테스트 39 〉	통과 (0.06ms, 72.7MB)
테스트 40 〉	통과 (0.05ms, 76.8MB)
테스트 41 〉	통과 (0.05ms, 75.3MB)
테스트 42 〉	통과 (0.06ms, 73.3MB)
테스트 43 〉	통과 (0.10ms, 71.5MB)
테스트 44 〉	통과 (0.07ms, 75.5MB)
테스트 45 〉	통과 (0.09ms, 70.9MB)
테스트 46 〉	통과 (0.07ms, 74.7MB)
테스트 47 〉	통과 (0.05ms, 73.5MB)
테스트 48 〉	통과 (0.11ms, 74.8MB)
 */
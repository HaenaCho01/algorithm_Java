package Programmers.lv0.codingTestIntroduction.day12_문자열_정렬_사칙연산_수학;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol4_소인수분해 {
	public int[] solution(int n) {
		List<Integer> list = new ArrayList<>();
		// 자연수 n의 소인수를 구하기 위한 반복문
		for (int i = 2; i <= n; i++) {
			// 나누어 떨어지면 i는 소인수, 몫이 2 이상인 경우도 있기 때문에 안 나눠질 때까지 나눠주기
			if (n % i == 0) {
				while (n % i == 0) {
					n /= i;
				}
				list.add(i); // 구한 소인수를 list에 넣어줌
			}
		}
		// list의 값들을 answer 배열에 넣기
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol4_소인수분해 sol = new Sol4_소인수분해();
		System.out.println(Arrays.toString(sol.solution(12)));
		System.out.println(Arrays.toString(sol.solution(17)));
		System.out.println(Arrays.toString(sol.solution(420)));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 73.3MB)
테스트 2 〉	통과 (0.03ms, 67.4MB)
테스트 3 〉	통과 (0.03ms, 70.5MB)
테스트 4 〉	통과 (0.03ms, 74MB)
테스트 5 〉	통과 (0.07ms, 78.7MB)
테스트 6 〉	통과 (0.03ms, 79.1MB)
테스트 7 〉	통과 (0.03ms, 72.5MB)
테스트 8 〉	통과 (0.03ms, 73MB)
테스트 9 〉	통과 (0.20ms, 73.7MB)
테스트 10 〉	통과 (0.03ms, 79.9MB)
테스트 11 〉	통과 (0.04ms, 78.3MB)
테스트 12 〉	통과 (0.02ms, 74.2MB)
테스트 13 〉	통과 (0.04ms, 73.2MB)
테스트 14 〉	통과 (0.09ms, 74.4MB)
테스트 15 〉	통과 (0.04ms, 73.7MB)
테스트 16 〉	통과 (0.03ms, 77.8MB)
테스트 17 〉	통과 (0.02ms, 75.4MB)
테스트 18 〉	통과 (0.03ms, 76.5MB)
테스트 19 〉	통과 (0.02ms, 72MB)
테스트 20 〉	통과 (0.03ms, 80.2MB)
테스트 21 〉	통과 (0.03ms, 69.9MB)
테스트 22 〉	통과 (0.02ms, 84.5MB)
테스트 23 〉	통과 (0.02ms, 75.4MB)
테스트 24 〉	통과 (0.02ms, 72.1MB)
 */
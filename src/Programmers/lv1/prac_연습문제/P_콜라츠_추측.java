package Programmers.lv1.prac_연습문제;

public class P_콜라츠_추측 {
	public int solution(int num) {
		long target = num;
		int cnt = 0;
		while (num != 1) {
			target = target % 2 == 0 ? target / 2 : (target * 3) + 1;
			cnt++;
			if (target == 1) {
				break;
			}
			if (cnt >= 500) {
				cnt = -1;
				break;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		P_콜라츠_추측 sol = new P_콜라츠_추측();
		System.out.println(sol.solution(6));
		System.out.println(sol.solution(16));
		System.out.println(sol.solution(626331));
		System.out.println(sol.solution(1));
	}
}

/*
테스트 1 〉	통과 (0.03ms, 74.6MB)
테스트 2 〉	통과 (0.05ms, 72.4MB)
테스트 3 〉	통과 (0.02ms, 73MB)
테스트 4 〉	통과 (0.02ms, 74.3MB)
테스트 5 〉	통과 (0.06ms, 70.3MB)
테스트 6 〉	통과 (0.03ms, 78.9MB)
테스트 7 〉	통과 (0.07ms, 76.3MB)
테스트 8 〉	통과 (0.03ms, 75.5MB)
테스트 9 〉	통과 (0.04ms, 77.3MB)
테스트 10 〉	통과 (0.05ms, 77.8MB)
테스트 11 〉	통과 (0.04ms, 78.9MB)
테스트 12 〉	통과 (0.04ms, 77MB)
테스트 13 〉	통과 (0.02ms, 79.1MB)
테스트 14 〉	통과 (0.02ms, 65.6MB)
테스트 15 〉	통과 (0.05ms, 80MB)
테스트 16 〉	통과 (0.02ms, 75.2MB)
 */
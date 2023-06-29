package Programmers.lv0.codingTestBasicsTraining.day24_조건문활용_반복문활용_이차원리스트배열;

class Solution4 {
	// 방법1
	public String solution1(String myString) {
		StringBuilder sb = new StringBuilder(myString);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) < 'l') {
				sb.setCharAt(i, 'l');
			}
		}
		return sb.toString();
	}

	// 방법2
	public String solution2(String myString) {
		return myString.replaceAll("[^l-z]", "l");
	}
}

/*
//방법1
테스트 1 〉	통과 (5.56ms, 73.8MB)
테스트 2 〉	통과 (5.63ms, 81.3MB)
테스트 3 〉	통과 (1.56ms, 75.5MB)
테스트 4 〉	통과 (1.61ms, 77.4MB)
테스트 5 〉	통과 (3.48ms, 77.8MB)
테스트 6 〉	통과 (3.94ms, 77.2MB)
테스트 7 〉	통과 (2.95ms, 77.1MB)
테스트 8 〉	통과 (5.69ms, 82.3MB)
테스트 9 〉	통과 (4.66ms, 78.1MB)
테스트 10 〉	통과 (12.22ms, 85.2MB)
테스트 11 〉	통과 (6.18ms, 74.5MB)

// 방법2
테스트 1 〉	통과 (16.66ms, 85.6MB)
테스트 2 〉	통과 (14.11ms, 73.2MB)
테스트 3 〉	통과 (8.60ms, 75.9MB)
테스트 4 〉	통과 (6.44ms, 77.4MB)
테스트 5 〉	통과 (13.12ms, 80MB)
테스트 6 〉	통과 (9.87ms, 90.7MB)
테스트 7 〉	통과 (8.77ms, 80.9MB)
테스트 8 〉	통과 (20.24ms, 83.5MB)
테스트 9 〉	통과 (11.32ms, 84.2MB)
테스트 10 〉	통과 (16.52ms, 87.5MB)
테스트 11 〉	통과 (15.71ms, 82.8MB)
 */

public class Sol4_l로_만들기 {
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		System.out.println(sol.solution1("abcdevwxyz"));
		System.out.println(sol.solution2("jjnnllkkmm"));
	}
}

package Programmers.lv0.codingTestBasicsTraining.day20_함수메서드;

import java.util.*;

class Solution3 {
	public int solution(String[] strArr) {
		int[] intArr = new int[31];
		for (int i = 0; i < strArr.length; i++) {
			int index = strArr[i].length();
			intArr[index]++;
		}
		Arrays.sort(intArr);
		return intArr[intArr.length-1];
	}
}

/*
테스트 1 〉	통과 (5.46ms, 122MB)
테스트 2 〉	통과 (0.55ms, 72.7MB)
테스트 3 〉	통과 (7.78ms, 109MB)
테스트 4 〉	통과 (11.85ms, 113MB)
테스트 5 〉	통과 (6.38ms, 107MB)
테스트 6 〉	통과 (4.57ms, 87.9MB)
테스트 7 〉	통과 (9.32ms, 126MB)
테스트 8 〉	통과 (2.86ms, 100MB)
테스트 9 〉	통과 (17.27ms, 101MB)
테스트 10 〉	통과 (1.40ms, 80.6MB)
테스트 11 〉	통과 (1.06ms, 81.7MB)
테스트 12 〉	통과 (4.29ms, 121MB)
테스트 13 〉	통과 (6.78ms, 104MB)
테스트 14 〉	통과 (3.42ms, 108MB)
테스트 15 〉	통과 (4.65ms, 95.3MB)
테스트 16 〉	통과 (2.86ms, 89.2MB)
테스트 17 〉	통과 (3.96ms, 99.5MB)
테스트 18 〉	통과 (3.45ms, 101MB)
테스트 19 〉	통과 (5.05ms, 99.2MB)
테스트 20 〉	통과 (4.78ms, 116MB)
테스트 21 〉	통과 (5.44ms, 116MB)
테스트 22 〉	통과 (3.81ms, 110MB)
테스트 23 〉	통과 (4.61ms, 98.4MB)
테스트 24 〉	통과 (5.17ms, 120MB)
 */

public class Sol3_문자열_묶기 {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		System.out.println(sol.solution(new String[]{"a", "bc", "d", "efg", "hi"}));
	}
}

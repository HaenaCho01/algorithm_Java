package Programmers.lv0.codingTestBasicsTraining.day22_함수메서드_조건문활용;

import java.math.BigInteger;

class Solution2 {
	public String solution(String a, String b) {
		BigInteger intA = new BigInteger(a);
		BigInteger intB = new BigInteger(b);
		return intA.add(intB).toString();
	}
}

/*
테스트 1 〉	통과 (1.23ms, 71.4MB)
테스트 2 〉	통과 (3.31ms, 72.8MB)
테스트 3 〉	통과 (29.08ms, 81.9MB)
테스트 4 〉	통과 (82.97ms, 83MB)
테스트 5 〉	통과 (248.38ms, 108MB)
테스트 6 〉	통과 (1.27ms, 70.9MB)
테스트 7 〉	통과 (4.45ms, 69.2MB)
테스트 8 〉	통과 (20.47ms, 79MB)
테스트 9 〉	통과 (88.01ms, 90.2MB)
테스트 10 〉	통과 (220.75ms, 117MB)
테스트 11 〉	통과 (4.98ms, 76.9MB)
테스트 12 〉	통과 (14.44ms, 76.1MB)
테스트 13 〉	통과 (34.08ms, 88MB)
테스트 14 〉	통과 (48.59ms, 87.4MB)
테스트 15 〉	통과 (245.87ms, 102MB)
테스트 16 〉	통과 (93.69ms, 93.4MB)
테스트 17 〉	통과 (77.97ms, 98.3MB)
테스트 18 〉	통과 (32.52ms, 86.3MB)
테스트 19 〉	통과 (103.78ms, 111MB)
테스트 20 〉	통과 (212.59ms, 97.7MB)
테스트 21 〉	통과 (179.13ms, 104MB)
테스트 22 〉	통과 (243.06ms, 95.8MB)
테스트 23 〉	통과 (234.22ms, 102MB)
테스트 24 〉	통과 (251.43ms, 107MB)
테스트 25 〉	통과 (345.86ms, 105MB)
테스트 26 〉	통과 (430.62ms, 122MB)
테스트 27 〉	통과 (411.53ms, 102MB)
테스트 28 〉	통과 (459.63ms, 107MB)
테스트 29 〉	통과 (283.55ms, 117MB)
테스트 30 〉	통과 (321.46ms, 111MB)
테스트 31 〉	통과 (248.59ms, 111MB)
 */

public class Sol2_두_수의_합 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		System.out.println(sol.solution("582", "734"));
		System.out.println(sol.solution("18446744073709551615", "287346502836570928366"));
		System.out.println(sol.solution("0", "0"));
	}
}

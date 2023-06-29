package Programmers.lv0.codingTestBasicsTraining.day24_조건문활용_반복문활용_이차원리스트배열;

class Solution1 {
	public int solution(String[] order) {
		int answer = 0;
		for (String s : order) {
			if (s.contains("americano") || s.equals("anything")) {
				answer += 4500;
			} else if (s.contains("cafelatte")) {
				answer += 5000;
			}
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.12ms, 75.7MB)
테스트 2 〉	통과 (0.11ms, 72.5MB)
테스트 3 〉	통과 (0.07ms, 72.2MB)
테스트 4 〉	통과 (0.19ms, 78.1MB)
테스트 5 〉	통과 (0.16ms, 82MB)
테스트 6 〉	통과 (0.26ms, 74.2MB)
테스트 7 〉	통과 (0.30ms, 76.5MB)
테스트 8 〉	통과 (0.43ms, 77.3MB)
테스트 9 〉	통과 (0.40ms, 77.5MB)
테스트 10 〉	통과 (0.75ms, 76.9MB)
테스트 11 〉	통과 (0.55ms, 79.8MB)
테스트 12 〉	통과 (0.80ms, 83.8MB)
테스트 13 〉	통과 (0.88ms, 80.3MB)
테스트 14 〉	통과 (1.00ms, 76.5MB)
테스트 15 〉	통과 (1.69ms, 75.3MB)
테스트 16 〉	통과 (1.19ms, 85.4MB)
테스트 17 〉	통과 (0.88ms, 73.5MB)
테스트 18 〉	통과 (1.03ms, 79.3MB)
테스트 19 〉	통과 (0.97ms, 77.8MB)
테스트 20 〉	통과 (0.02ms, 78.1MB)
 */

public class Sol1_커피_심부름 {
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		System.out.println(sol.solution(new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"}));
		System.out.println(sol.solution(new String[]{"americanoice", "americano", "iceamericano"}));
	}


}

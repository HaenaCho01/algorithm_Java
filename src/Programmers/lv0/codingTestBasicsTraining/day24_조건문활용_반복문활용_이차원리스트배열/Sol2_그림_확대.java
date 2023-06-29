package Programmers.lv0.codingTestBasicsTraining.day24_조건문활용_반복문활용_이차원리스트배열;

class Solution2 {
	public String[] solution(String[] picture, int k) {
		String[] answer = new String[picture.length*k];
		for (int i = 0, j = 0; i < answer.length; j++) {
			StringBuilder sb = new StringBuilder();
			for (int l = 0; l < picture[j].length(); l++) {
				for (int m = 0; m < k; m++) {
					sb.append(picture[j].charAt(l));
				}
			}
			for (int m = 0; m < k; m++) {
				answer[i] = sb.toString(); i++;
			}
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.05ms, 78.1MB)
테스트 2 〉	통과 (0.09ms, 75.1MB)
테스트 3 〉	통과 (0.05ms, 75.6MB)
테스트 4 〉	통과 (0.11ms, 73.5MB)
테스트 5 〉	통과 (0.07ms, 77.8MB)
테스트 6 〉	통과 (0.11ms, 80.6MB)
테스트 7 〉	통과 (0.08ms, 78.3MB)
테스트 8 〉	통과 (0.23ms, 69MB)
테스트 9 〉	통과 (0.13ms, 79.4MB)
테스트 10 〉	통과 (0.17ms, 73.6MB)
테스트 11 〉	통과 (0.06ms, 75.1MB)
테스트 12 〉	통과 (0.07ms, 77.7MB)
테스트 13 〉	통과 (0.11ms, 73.4MB)
테스트 14 〉	통과 (0.06ms, 75MB)
테스트 15 〉	통과 (0.06ms, 78.9MB)
테스트 16 〉	통과 (0.10ms, 85.6MB)
테스트 17 〉	통과 (0.13ms, 79.7MB)
테스트 18 〉	통과 (0.18ms, 77.3MB)
테스트 19 〉	통과 (0.20ms, 76.9MB)
테스트 20 〉	통과 (0.10ms, 74.4MB)
테스트 21 〉	통과 (0.39ms, 74.6MB)
테스트 22 〉	통과 (0.38ms, 78.6MB)
테스트 23 〉	통과 (0.03ms, 74.4MB)
테스트 24 〉	통과 (0.03ms, 77.5MB)
 */

public class Sol2_그림_확대 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();

		String[] pic1 = {".xx...xx.",
						 "x..x.x..x",
						 "x...x...x",
						 ".x.....x.",
						 "..x...x..",
						 "...x.x...",
						 "....x...."};

		String[] pic2 = {"x.x",
						 ".x.",
						 "x.x"};

		String[] sol1 = sol.solution(pic1, 2);
		String[] sol2 = sol.solution(pic2, 3);
		for (String s : pic1) {
			System.out.println(s);
		}
		System.out.println();
		for (String s : sol1) {
			System.out.println(s);
		}
		System.out.println();
		for (String s : pic2) {
			System.out.println(s);
		}
		System.out.println();
		for (String s : sol2) {
			System.out.println(s);
		}
	}
}

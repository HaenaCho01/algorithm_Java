package Programmers.lv0.codingTestBasicsTraining.day18_문자열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1 {
	public int[] solution(String myString) {
		List<Integer> cntList = new ArrayList<>();

		int cnt = 0;
		for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) == 'x') {
				cntList.add(cnt);
				cnt = 0;
			} else {
				cnt++;
			}

			if (i == myString.length()-1) {
				cntList.add(cnt);
			}
		}

		int[] answer = new int[cntList.size()];
		for (int i = 0; i < answer.length; i++) {
			 answer[i] = cntList.get(i);
		}

		return answer;
	}
}

/*
테스트 1 〉	통과 (0.06ms, 73MB)
테스트 2 〉	통과 (0.04ms, 73.8MB)
테스트 3 〉	통과 (11.69ms, 85.3MB)
테스트 4 〉	통과 (10.78ms, 90.2MB)
테스트 5 〉	통과 (1.58ms, 77.8MB)
테스트 6 〉	통과 (1.81ms, 75.8MB)
테스트 7 〉	통과 (4.44ms, 83.3MB)
테스트 8 〉	통과 (7.43ms, 77.9MB)
테스트 9 〉	통과 (3.87ms, 78.9MB)
테스트 10 〉	통과 (10.09ms, 78.3MB)
테스트 11 〉	통과 (5.66ms, 72.7MB)
테스트 12 〉	통과 (7.80ms, 93.5MB)
테스트 13 〉	통과 (10.06ms, 90.3MB)
 */

public class Sol1_x_사이의_개수 {
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		System.out.println(Arrays.toString(sol.solution("oxooxoxxox")));
		System.out.println(Arrays.toString(sol.solution("xabcxdefxghi")));
	}
}

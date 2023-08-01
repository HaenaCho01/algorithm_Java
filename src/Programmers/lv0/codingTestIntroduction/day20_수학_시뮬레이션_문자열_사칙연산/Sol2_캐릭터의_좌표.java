package Programmers.lv0.codingTestIntroduction.day20_수학_시뮬레이션_문자열_사칙연산;

import java.util.Arrays;

public class Sol2_캐릭터의_좌표 {
	public int[] solution(String[] keyinput, int[] board) {
		int[] answer = {0, 0};
		int maxX = board[0] / 2;
		int maxY = board[1] / 2;
		for (int i = 0; i < keyinput.length; i++) {
			switch (keyinput[i]) {
				case "left":
					if (answer[0] - 1 < -maxX) continue;
					else answer[0]--; break;
				case "right":
					if (answer[0] + 1 > +maxX) continue;
					else answer[0]++; break;
				case "up":
					if (answer[1] + 1 > +maxY) continue;
					else answer[1]++; break;
				case "down":
					if (answer[1] - 1 < -maxY) continue;
					answer[1]--; break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Sol2_캐릭터의_좌표 sol = new Sol2_캐릭터의_좌표();
		System.out.println(Arrays.toString(sol.solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11})));
		System.out.println(Arrays.toString(sol.solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9})));
	}
}

/*
테스트 1 〉	통과 (0.03ms, 84.4MB)
테스트 2 〉	통과 (0.02ms, 67.3MB)
테스트 3 〉	통과 (0.03ms, 71.2MB)
테스트 4 〉	통과 (0.04ms, 79.7MB)
테스트 5 〉	통과 (0.02ms, 76.2MB)
테스트 6 〉	통과 (0.02ms, 77.3MB)
테스트 7 〉	통과 (0.04ms, 72.3MB)
테스트 8 〉	통과 (0.04ms, 79.7MB)
테스트 9 〉	통과 (0.02ms, 75.3MB)
테스트 10 〉	통과 (0.02ms, 66.5MB)
테스트 11 〉	통과 (0.03ms, 75.2MB)
 */
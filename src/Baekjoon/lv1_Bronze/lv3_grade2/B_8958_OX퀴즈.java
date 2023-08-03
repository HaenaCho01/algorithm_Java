package Baekjoon.lv1_Bronze.lv3_grade2;

import java.util.Scanner;

public class B_8958_OX퀴즈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCnt = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= testCnt; i++) {
			String scoring = sc.nextLine();
			int totalScore = 0;
			int score = 0;
			for (int j = 0; j < scoring.length(); j++) {
				if (scoring.charAt(j) == 'O') {
					score++;
					totalScore += score;
				}
				if (scoring.charAt(j) == 'X') {
					score = 0;
				}
			}
			System.out.println(totalScore);
		}

		sc.close();
	}
}

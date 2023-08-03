package Baekjoon.lv1_Bronze.lv1_grade4;

import java.util.Scanner;

public class B_2439_별_찍기_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();

		for (int i = 1; i <= cnt; i++) {
			System.out.println(" ".repeat(cnt - i) + "*".repeat(i));
		}

		sc.close();
	}
}

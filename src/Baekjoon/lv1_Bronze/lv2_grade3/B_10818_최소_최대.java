package Baekjoon.lv1_Bronze.lv2_grade3;

import java.util.Scanner;

public class B_10818_최소_최대 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();

		int max = sc.nextInt();
		int min = max;
		for (int i = 2; i <= cnt; i++) {
			int target = sc.nextInt();
			if (max < target) {
				max = target;
			}
			if (min > target) {
				min = target;
			}
		}
		System.out.println(min + " " + max);

		sc.close();
	}
}

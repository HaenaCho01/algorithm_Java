package Baekjoon.lv1_Bronze.lv2_grade3;

import java.util.Scanner;

public class B_2884_알람_시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int minute = sc.nextInt();

		minute -= 45;
		if (minute < 0) {
			--hour;
			minute += 60;
			if (hour == -1) hour = 23;
		}

		System.out.println(hour + " " + minute);

		sc.close();
	}
}

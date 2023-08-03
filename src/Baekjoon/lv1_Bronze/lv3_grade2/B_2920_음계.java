package Baekjoon.lv1_Bronze.lv3_grade2;

import java.util.Scanner;

public class B_2920_음계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();
		sc.close();
		string = string.replace(" ", "");

		String answer = "mixed";
		if (string.equals("12345678")) answer = "ascending";
		if (string.equals("87654321")) answer = "descending";

		System.out.println(answer);
	}
}

package Baekjoon.lv1_Bronze.lv3_grade2;

import java.util.Scanner;

public class B_2577_숫자의_개수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		String string = String.valueOf(a * b * c);
		int[] intArr = new int[10];
		for (int i = 0; i < string.length(); i++) {
			int num = string.charAt(i) - '0';
			intArr[num]++;
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
}

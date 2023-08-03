package Baekjoon.lv1_Bronze.lv3_grade2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class B_1152_단어의_개수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String sentence = sc.nextLine();
		sc.close();

		StringTokenizer st = new StringTokenizer(sentence, " ");

		System.out.println(st.countTokens());
	}
}

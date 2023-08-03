package Baekjoon.lv1_Bronze.lv3_grade2;

import java.util.Scanner;

public class B_10809_알파벳_찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] alphabet = new int[26];
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1;
		}
		String word = sc.nextLine();
		sc.close();
		for (int i = 0; i < word.length(); i++) {
			char character = word.charAt(i);
			int index = character - 'a';
			if (alphabet[index] == -1) {
				alphabet[index] = i;
			}
		}

		for (int i : alphabet) {
			System.out.print(i + " ");
		}
	}
}

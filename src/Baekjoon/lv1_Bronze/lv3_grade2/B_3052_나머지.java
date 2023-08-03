package Baekjoon.lv1_Bronze.lv3_grade2;

import java.util.HashSet;
import java.util.Scanner;

public class B_3052_나머지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] scInArr = new int[10];
		for (int i = 1, index = 0; i <= 10; i++) {
			scInArr[index++] = sc.nextInt();
		}

		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < scInArr.length; i++) {
			set.add(scInArr[i] % 42);
		}

		System.out.println(set.size());

		sc.close();
	}
}

package Baekjoon.lv1_Bronze.lv2_grade3;

import java.util.Scanner;

public class B_10250_ACM_호텔 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCnt = sc.nextInt();
		for (int i = 1; i <= testCnt; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();

			int nH = n % h;
			int nW = n / h + 1;
			if (nH == 0) {
				nH = h;
				nW = n / h;
			}
			if (nW > w) nW = w;
			String zero = nW >= 10? "" : "0";

			System.out.println(nH + zero + nW);
		}

		sc.close();
	}
}

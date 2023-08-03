package Baekjoon.lv1_Bronze.lv2_grade3;

import java.io.*;

public class B_2562_최댓값 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int max = arr[0]; int index = 1;
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i + 1;
			}
		}

		bw.write(String.valueOf(max));
		bw.newLine();
		bw.write(String.valueOf(index));

		br.close();
		bw.flush();
		bw.close();
	}
}

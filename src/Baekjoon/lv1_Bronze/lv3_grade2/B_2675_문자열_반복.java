package Baekjoon.lv1_Bronze.lv3_grade2;

import java.io.*;

public class B_2675_문자열_반복 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCnt = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= testCnt; i++) {
			String string = br.readLine();
			int repeatCnt = string.charAt(0) - '0';
			String target = string.substring(2);

			for (int j = 0; j < target.length(); j++) {
				String repeat = String.valueOf(target.charAt(j)).repeat(repeatCnt);
				sb.append(repeat);
			}

			bw.write(sb.toString());
			bw.newLine();

			sb.setLength(0);
		}
		br.close();
		bw.flush();
		bw.close();
	}
}

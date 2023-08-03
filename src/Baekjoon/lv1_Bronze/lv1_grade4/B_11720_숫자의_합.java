package Baekjoon.lv1_Bronze.lv1_grade4;

import java.io.*;

public class B_11720_숫자의_합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = Integer.parseInt(br.readLine());
		String num = br.readLine();

		int answer = 0;
		for (int i = 0; i < cnt; i++) {
			answer += num.charAt(i) - '0';
		}

		bw.write(String.valueOf(answer));
		br.close();
		bw.flush();
		bw.close();
	}
}

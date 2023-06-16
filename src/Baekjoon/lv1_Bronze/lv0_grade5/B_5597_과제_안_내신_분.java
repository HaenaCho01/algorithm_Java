package Baekjoon.lv1_Bronze.lv0_grade5;

import java.io.*;

public class B_5597_과제_안_내신_분 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] checkSubmit = new int[31];
        for (int i = 1; i <= 28; i++) {
            int x = Integer.parseInt(br.readLine());
            checkSubmit[x] = 1;
        }

        for (int i = 1; i < checkSubmit.length; i++) {
            if (checkSubmit[i] == 0) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

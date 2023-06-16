package Baekjoon.lv1_Bronze.lv0_grade5;

import java.io.*;

public class B_10807_개수_세기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 첫째 줄 정수 N 개수 입력됨
        int n = Integer.parseInt(br.readLine());

        // 둘째 줄 정수 N개가 공백으로 구분되어 입력됨
        String strLn = br.readLine();
        String[] strArr = strLn.split(" ");

        // 셋째 줄 찾으려고 하는 정수 v가 주어짐
        int v = Integer.parseInt(br.readLine());

        // 둘째 줄 정수 중 v가 몇 개인지 출력
        int cntV = 0;
        for(int i = 0; i < n; i++) {
            if (Integer.parseInt(strArr[i]) == v) {
                cntV++;
            }
        }
        bw.write(String.valueOf(cntV));

        br.close();
        bw.flush();
        bw.close();
    }
}

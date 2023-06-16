package Baekjoon.lv1_Bronze.lv0_grade5;

import java.io.*;
import java.util.StringTokenizer;

public class B_10871_X보다_작은_수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 첫째 줄에 정수의 개수 N, 기준 정수 X 를 입력 받음
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken()); // 정수의 개수
        int x = Integer.parseInt(st.nextToken()); // 기준 정수

        // 둘째 줄에 수열 A를 이루는 정수 N개를 입력 받음
        String strLn = br.readLine();
        String[] strArr = strLn.split(" ");

        // X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력함
        for(int i = 0; i < n; i++) {
            if (Integer.valueOf(strArr[i]) < x) {
                bw.write(String.valueOf(strArr[i]));
                bw.write(" ");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

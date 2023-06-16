package Baekjoon.lv1_Bronze.lv1_grade4;

import java.io.*;
import java.util.StringTokenizer;

public class B_15552_빠른AplusB {

//    스캐너와 sout을 사용할 경우 시간초과로 실패 -> BufferReader, BufferWriter 사용하기!
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        for (int i = 1; i <= t; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println(a + b);
//        }
//
//        sc.close();
//    }

    public static void main(String[] args) throws IOException { // Buffer 사용시 IOException 필수!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 1; i <= t; i++) {
            String str = br.readLine(); // BufferReader로 한 줄 받기
            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken()); // 공백단위로 나누기

            bw.write(String.valueOf(a+b));
            bw.newLine(); // 해당 줄을 안쓰면 출력이 계속 이어져서 나옴
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

package Baekjoon.lv1_Bronze.lv0_grade5;

import java.io.*;

public class B_2754_학점계산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 성적이 주어짐
        String grade = br.readLine();
        double score;

        // 성적별 기본
        switch (grade.charAt(0)) {
            case 'A' : score = +4.0; break;
            case 'B' : score = +3.0; break;
            case 'C' : score = +2.0; break;
            case 'D' : score = +1.0; break;
            default: score = 0.0; break;
        }

        // 성적별 가감
        if (grade.length() == 2) {
            switch (grade.charAt(1)) {
                case '+' : score = score + 0.3; break;
                case '-' : score = score -0.3; break;
                default: score = score +0.0;
            }
        } else if (grade.length() == 1) {
            score = 0.0;
        }


        // 출력
        bw.write(String.valueOf(score));
        br.close();
        bw.flush();
        bw.close();
    }
}

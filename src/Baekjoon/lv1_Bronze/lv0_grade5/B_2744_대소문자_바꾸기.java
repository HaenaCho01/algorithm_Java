package Baekjoon.lv1_Bronze.lv0_grade5;

import java.io.*;

public class B_2744_대소문자_바꾸기 {
    public static void main(String[] args) throws IOException {
        // 첫째줄에 대수몬자로 이루어진 단어가 주어짐
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();

        // 대<->소문자 변환
        StringBuilder changeWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char wordChar = word.charAt(i);
            int wordAscii = (int) wordChar;
            int changeWordAscii = 0;
            if (wordAscii >= 65 && wordAscii <=90) {
                changeWordAscii = wordAscii + 32;
            } else if (wordAscii >= 97 && wordAscii <= 122) {
                changeWordAscii = wordAscii - 32;
            }
            char changeWordChar = (char) changeWordAscii;
            changeWord.append(changeWordChar);
        }

        // 출력
        bw.write(String.valueOf(changeWord));
        br.close();
        bw.flush();
        bw.close();
    }
}

package Baekjoon.lv1_Bronze.lv0_grade5;

import java.util.Scanner;

public class B_27866_문자와_문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫째줄에 단어 S가 주어짐
        String s = sc.nextLine();
        // 둘째줄에 정수 i가 주어짐
        int i = sc.nextInt();
        // S 의 i번째 글자 출력
        System.out.println(s.charAt(i-1));
    }
}

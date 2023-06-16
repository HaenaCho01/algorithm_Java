package Baekjoon.lv1_Bronze.lv0_grade5;

import java.util.Scanner;

public class B_9086_문자열 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        // 입력 첫 줄에 테스트 케이스의 개수가 주어짐
        int t = sc.nextInt();
        sc.nextLine(); // 개행문자 잊지 않기!

        // 각 테스트 케이스에 한 줄에 하나의 문자열이 주어짐 -> 첫글자와 마지막 글자 출력하기
        for (int i = 0; i < t; i++) {
            String word = sc.nextLine();
            System.out.println(String.valueOf(word.charAt(0)) + String.valueOf(word.charAt(word.length()-1)));
        }
    }
}

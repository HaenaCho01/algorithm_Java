package Baekjoon.lv1_Bronze.lv0_grade5;

import java.util.Scanner;

public class B_10950_APlusB_3 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 개수 입력
        int[] values = new int[t];
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt(); // 테스트 정수 띄어쓰기해서 한 줄씩 입력
            values[i] = a + b;
        }
        sc.close();
        for (int value: values) {
            System.out.println(value);
        }
    }
}

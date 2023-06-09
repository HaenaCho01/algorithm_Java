package Baekjoon.lv1_Bronze.lv0_grade5;

import java.util.Scanner;

public class B_2420_사파리월드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(); // 정수 조건값 보고 타입 잘 잡아주기!!!
        long m = sc.nextInt();
        if (n-m >= 0) {
            System.out.println(n-m);
        } else if (n-m <= 0) {
            System.out.println(-(n-m));
        }
        sc.close();
    }
}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextInt();
//        long m = sc.nextInt();
//        System.out.println(Math.abs(n-m)); // 절대값 함수 쓰는 방법
//        sc.close();
//    }


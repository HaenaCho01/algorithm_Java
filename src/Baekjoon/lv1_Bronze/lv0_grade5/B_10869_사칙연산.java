package Baekjoon.lv1_Bronze.lv0_grade5;

import java.util.Scanner;

public class B_10869_사칙연산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        sc.close();
    }
}

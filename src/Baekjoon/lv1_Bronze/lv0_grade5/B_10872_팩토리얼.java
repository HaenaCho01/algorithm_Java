package Baekjoon.lv1_Bronze.lv0_grade5;

import java.util.Scanner;

public class B_10872_팩토리얼 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        if (n == 0) {
            System.out.println(1);
        } else if (n >= 1) {
            for (int i = 1; i <= n; i++) {
               x = x * i;
            }
            System.out.println(x);
        }
    }
}

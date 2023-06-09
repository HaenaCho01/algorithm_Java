package Baekjoon.lv1_Bronze.lv0_grade5;

import java.util.Scanner;

public class B_2739_구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}

package Baekjoon.lv1_Bronze.lv0_grade5;

import java.util.Scanner;

public class B_1330_두_수_비교하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else if (a == b) {
            System.out.println("==");
        }
        sc.close();
    }
}

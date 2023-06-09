package Baekjoon.lv1_Bronze.lv0_grade5;

import java.util.Scanner;

public class B_9498_시험_성적 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>=90 && a<=100) {
            System.out.println("A");
        } else if (a >= 80 && a <=89) {
            System.out.println("B");
        } else if (a >=70 && a <= 79) {
            System.out.println("C"); // 출력 대소문자 구분 주의!!!
        } else if (a >= 60 && a <= 69) {
            System.out.println("D");
        } else if (a >=0 && a<=59) {
            System.out.println("F");
        }
        sc.close();
    }
}
